package com.cms.system.cms.service;

import com.cms.system.cms.entity.LeaveRequest;
import java.util.List;

public interface LeaveRequestService {
    List<LeaveRequest> getAllLeaveRequests();
    LeaveRequest getLeaveRequestById(Long id);
    LeaveRequest createLeaveRequest(LeaveRequest leaveRequest);
    LeaveRequest updateLeaveRequest(Long id, LeaveRequest leaveRequest);
    void deleteLeaveRequest(Long id);
}
