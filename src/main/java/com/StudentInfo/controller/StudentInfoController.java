package com.StudentInfo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.StudentInfo.Service.StudentInfoService;
import com.StudentInfo.model.StudentInfo;

@RestController
@RequestMapping("/studentinfo")
public class StudentInfoController {

	@Autowired
	private StudentInfoService service;
	
	// CREATE
    @PostMapping("/add")
    public StudentInfo addStudent(@RequestBody StudentInfo student) {
		return service.saveStudent(student);	
    }
    
    // GET ALL
    @GetMapping("/all")
    public List<StudentInfo> getAllStudents() {
        return service.getAllStudents();
    }
    
    // UPDATE
    @PutMapping("/{id}")
    public StudentInfo updateStudent(
            @PathVariable Long id,
            @RequestBody StudentInfo studentInfo) {

        return service.updateStudentInfo(id, studentInfo);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Long id) {

        service.deleteStudentInfo(id);
        return "StudentInfo deleted successfully";
    }

}
