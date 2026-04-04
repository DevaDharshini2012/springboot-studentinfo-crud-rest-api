package com.StudentInfo.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentInfo.Repository.StudentInfoRepository;
import com.StudentInfo.model.StudentInfo;

@Service
public class StudentInfoService {

	@Autowired
    StudentInfoRepository repository;
	
	// CREATE or SAVE
	public StudentInfo saveStudent(StudentInfo student) {
        return repository.save(student);
    }
	
	// GET ALL
	public List<StudentInfo> getAllStudents() {
        return repository.findAll();
    }
	
	// UPDATE
	public StudentInfo updateStudentInfo(Long id, StudentInfo updatedStudentInfo) {
	    return repository.findById(id).map(student -> {
	        student.setName(updatedStudentInfo.getName());
	        student.setDepartment(updatedStudentInfo.getDepartment());
	        student.setEmail(updatedStudentInfo.getEmail());
	        return repository.save(student);
	    }).orElseThrow(() -> new RuntimeException("StudentInfo not found with id " + id));
	}
	
	// DELETE
	public void deleteStudentInfo(Long id) {
	    if (!repository.existsById(id)) {
	        throw new RuntimeException("StudentInfo not found with id " + id);
	    }
	    repository.deleteById(id);
	}
}
