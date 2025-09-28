package com.cms.system.cms.service.impl;

import com.cms.system.cms.entity.Teachers;
import com.cms.system.cms.repository.TeachersRepository;
import com.cms.system.cms.service.TeachersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TeachersServiceImpl implements TeachersService {

    @Autowired
    private TeachersRepository teachersRepository;

    @Override
    public List<Teachers> getAllTeachers() {
        return teachersRepository.findAll();
    }

    @Override
    public Teachers getTeacherById(UUID id) {
        return teachersRepository.findById(id).orElse(null);
    }

    @Override
    public Teachers createTeacher(Teachers teacher) {
        return teachersRepository.save(teacher);
    }

    @Override
    public Teachers updateTeacher(UUID id, Teachers teacher) {
        if (teachersRepository.existsById(id)) {
            teacher.setTeacherId(id);
            return teachersRepository.save(teacher);
        }
        return null;
    }

    @Override
    public void deleteTeacher(UUID id) {
        teachersRepository.deleteById(id);
    }
}