package com.cms.system.cms.service;

import com.cms.system.cms.entity.Attendance;
import java.util.List;

public interface AttendanceService {
    List<Attendance> getAllAttendances();
    Attendance getAttendanceById(Long id);
    Attendance createAttendance(Attendance attendance);
    Attendance updateAttendance(Long id, Attendance attendance);
    void deleteAttendance(Long id);
}
