package com.cms.system.cms.repository;

import com.cms.system.cms.entity.CourseEnrollment;
import com.cms.system.cms.entity.CourseEnrollment.CourseEnrollmentId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseEnrollmentRepository extends JpaRepository<CourseEnrollment, CourseEnrollmentId> {
}