package com.cms.system.cms.service;

import com.cms.system.cms.entity.Courses;
import java.util.List;

public interface CoursesService {
    List<Courses> getAllCourses();
    Courses getCourseById(Long id);
    Courses createCourse(Courses course);
    Courses updateCourse(Long id, Courses course);
    void deleteCourse(Long id);
}
