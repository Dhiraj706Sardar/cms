package com.cms.system.cms.service;

import com.cms.system.cms.entity.CourseEnrollment;
import java.util.List;

public interface CourseEnrollmentService {
    List<CourseEnrollment> getAllCourseEnrollments();
    CourseEnrollment getCourseEnrollmentById(CourseEnrollment.CourseEnrollmentId id);
    CourseEnrollment createCourseEnrollment(CourseEnrollment courseEnrollment);
    void deleteCourseEnrollment(CourseEnrollment.CourseEnrollmentId id);
}
