package com.cms.system.cms.controller;

import com.cms.system.cms.entity.Students;
import com.cms.system.cms.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentsController {

    @Autowired
    private StudentsService studentsService;

    @GetMapping
    public List<Students> getAllStudents() {
        return studentsService.getAllStudents();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Students> getStudentById(@PathVariable Long id) {
        Students student = studentsService.getStudentById(id);
        if (student != null) {
            return ResponseEntity.ok(student);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Students createStudent(@RequestBody Students student) {
        return studentsService.createStudent(student);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Students> updateStudent(@PathVariable Long id, @RequestBody Students student) {
        Students updatedStudent = studentsService.updateStudent(id, student);
        if (updatedStudent != null) {
            return ResponseEntity.ok(updatedStudent);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id) {
        studentsService.deleteStudent(id);
        return ResponseEntity.noContent().build();
    }
}
