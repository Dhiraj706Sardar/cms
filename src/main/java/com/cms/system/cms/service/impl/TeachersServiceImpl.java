package com.cms.system.cms.service.impl;

import com.cms.system.cms.entity.Teachers;
import com.cms.system.cms.repository.TeachersRepository;
import com.cms.system.cms.service.TeachersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeachersServiceImpl implements TeachersService {

    @Autowired
    private TeachersRepository teachersRepository;

    @Override
    public List<Teachers> getAllTeachers() {
        return teachersRepository.findAll();
    }

    @Override
    public Teachers getTeacherById(Long id) {
        return teachersRepository.findById(id).orElse(null);
    }

    @Override
    public Teachers createTeacher(Teachers teacher) {
        return teachersRepository.save(teacher);
    }

    @Override
    public Teachers updateTeacher(Long id, Teachers teacher) {
        if (teachersRepository.existsById(id)) {
            teacher.setTeacherId(id);
            return teachersRepository.save(teacher);
        }
        return null;
    }

    @Override
    public void deleteTeacher(Long id) {
        teachersRepository.deleteById(id);
    }
}