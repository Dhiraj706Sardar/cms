package com.cms.system.cms.controller;

import com.cms.system.cms.entity.Teachers;
import com.cms.system.cms.service.TeachersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/teachers")
public class TeachersController {

    @Autowired
    private TeachersService teachersService;

    @GetMapping
    public List<Teachers> getAllTeachers() {
        return teachersService.getAllTeachers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Teachers> getTeacherById(@PathVariable Long id) {
        Teachers teacher = teachersService.getTeacherById(id);
        if (teacher != null) {
            return ResponseEntity.ok(teacher);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Teachers> createTeacher(@RequestBody Teachers teacher) {
        return new ResponseEntity<>(teachersService.createTeacher(teacher), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Teachers> updateTeacher(@PathVariable Long id, @RequestBody Teachers teacher) {
        Teachers updatedTeacher = teachersService.updateTeacher(id, teacher);
        if (updatedTeacher != null) {
            return ResponseEntity.ok(updatedTeacher);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTeacher(@PathVariable Long id) {
        teachersService.deleteTeacher(id);
        return ResponseEntity.noContent().build();
    }
}
