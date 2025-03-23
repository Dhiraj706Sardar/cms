package com.cms.system.cms.service;

import com.cms.system.cms.entity.Students;
import java.util.List;

public interface StudentsService {
    List<Students> getAllStudents();
    Students getStudentById(Long id);
    Students createStudent(Students student);
    Students updateStudent(Long id, Students student);
    void deleteStudent(Long id);
}
