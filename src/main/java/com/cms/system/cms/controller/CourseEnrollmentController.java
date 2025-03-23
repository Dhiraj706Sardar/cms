package com.cms.system.cms.controller;

import com.cms.system.cms.entity.CourseEnrollment;
import com.cms.system.cms.service.CourseEnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/course-enrollments")
public class CourseEnrollmentController {

    @Autowired
    private CourseEnrollmentService courseEnrollmentService;

    @GetMapping
    public List<CourseEnrollment> getAllCourseEnrollments() {
        return courseEnrollmentService.getAllCourseEnrollments();
    }

    @GetMapping("/{studentId}/{courseId}")
    public ResponseEntity<CourseEnrollment> getCourseEnrollmentById(@PathVariable Long studentId, @PathVariable Long courseId) {
        CourseEnrollment.CourseEnrollmentId id = new CourseEnrollment.CourseEnrollmentId(studentId, courseId);
        CourseEnrollment courseEnrollment = courseEnrollmentService.getCourseEnrollmentById(id);
        if (courseEnrollment != null) {
            return ResponseEntity.ok(courseEnrollment);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public CourseEnrollment createCourseEnrollment(@RequestBody CourseEnrollment courseEnrollment) {
        return courseEnrollmentService.createCourseEnrollment(courseEnrollment);
    }

    @DeleteMapping("/{studentId}/{courseId}")
    public ResponseEntity<Void> deleteCourseEnrollment(@PathVariable Long studentId, @PathVariable Long courseId) {
        CourseEnrollment.CourseEnrollmentId id = new CourseEnrollment.CourseEnrollmentId(studentId, courseId);
        courseEnrollmentService.deleteCourseEnrollment(id);
        return ResponseEntity.noContent().build();
    }
}
