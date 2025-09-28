package com.cms.system.cms.repository;

import com.cms.system.cms.entity.Teachers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TeachersRepository extends JpaRepository<Teachers, UUID> {
}