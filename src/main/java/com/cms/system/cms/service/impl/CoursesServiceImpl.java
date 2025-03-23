package com.cms.system.cms.service.impl;

import com.cms.system.cms.entity.Courses;
import com.cms.system.cms.repository.CoursesRepository;
import com.cms.system.cms.service.CoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoursesServiceImpl implements CoursesService {

    @Autowired
    private CoursesRepository coursesRepository;

    @Override
    public List<Courses> getAllCourses() {
        return coursesRepository.findAll();
    }

    @Override
    public Courses getCourseById(Long id) {
        return coursesRepository.findById(id).orElse(null);
    }

    @Override
    public Courses createCourse(Courses course) {
        return coursesRepository.save(course);
    }

    @Override
    public Courses updateCourse(Long id, Courses course) {
        if (coursesRepository.existsById(id)) {
            course.setCourseId(id);
            return coursesRepository.save(course);
        }
        return null;
    }

    @Override
    public void deleteCourse(Long id) {
        coursesRepository.deleteById(id);
    }
}