package com.cms.system.cms.service.impl;

import com.cms.system.cms.entity.Students;
import com.cms.system.cms.repository.StudentsRepository;
import com.cms.system.cms.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsServiceImpl implements StudentsService {

    @Autowired
    private StudentsRepository studentsRepository;

    @Override
    public List<Students> getAllStudents() {
        return studentsRepository.findAll();
    }

    @Override
    public Students getStudentById(Long id) {
        return studentsRepository.findById(id).orElse(null);
    }

    @Override
    public Students createStudent(Students student) {
        return studentsRepository.save(student);
    }

    @Override
    public Students updateStudent(Long id, Students student) {
        if (studentsRepository.existsById(id)) {
            student.setStudentId(id);
            return studentsRepository.save(student);
        }
        return null;
    }

    @Override
    public void deleteStudent(Long id) {
        studentsRepository.deleteById(id);
    }
}