package com.cms.system.cms.service;

import com.cms.system.cms.entity.Teachers;
import java.util.List;
import java.util.UUID;

public interface TeachersService {
    List<Teachers> getAllTeachers();
    Teachers getTeacherById(UUID id);
    Teachers createTeacher(Teachers teacher);
    Teachers updateTeacher(UUID id, Teachers teacher);
    void deleteTeacher(UUID id);
}
