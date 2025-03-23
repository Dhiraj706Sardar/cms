package com.cms.system.cms.service;

import com.cms.system.cms.entity.Teachers;
import java.util.List;

public interface TeachersService {
    List<Teachers> getAllTeachers();
    Teachers getTeacherById(Long id);
    Teachers createTeacher(Teachers teacher);
    Teachers updateTeacher(Long id, Teachers teacher);
    void deleteTeacher(Long id);
}
