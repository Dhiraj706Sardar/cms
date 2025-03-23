package com.cms.system.cms.service.impl;

import com.cms.system.cms.entity.CourseEnrollment;
import com.cms.system.cms.repository.CourseEnrollmentRepository;
import com.cms.system.cms.service.CourseEnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseEnrollmentServiceImpl implements CourseEnrollmentService {

    @Autowired
    private CourseEnrollmentRepository courseEnrollmentRepository;

    @Override
    public List<CourseEnrollment> getAllCourseEnrollments() {
        return courseEnrollmentRepository.findAll();
    }

    @Override
    public CourseEnrollment getCourseEnrollmentById(CourseEnrollment.CourseEnrollmentId id) {
        return courseEnrollmentRepository.findById(id).orElse(null);
    }

    @Override
    public CourseEnrollment createCourseEnrollment(CourseEnrollment courseEnrollment) {
        return courseEnrollmentRepository.save(courseEnrollment);
    }

    @Override
    public void deleteCourseEnrollment(CourseEnrollment.CourseEnrollmentId id) {
        courseEnrollmentRepository.deleteById(id);
    }
}