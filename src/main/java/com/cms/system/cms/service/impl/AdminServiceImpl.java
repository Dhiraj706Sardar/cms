package com.cms.system.cms.service.impl;

import com.cms.system.cms.entity.Admin;
import com.cms.system.cms.entity.User;
import com.cms.system.cms.entity.Role;
import com.cms.system.cms.repository.AdminRepository;
import com.cms.system.cms.repository.UserRepository;
import com.cms.system.cms.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepository adminRepository;
    
    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }

    @Override
    public Admin getAdminById(Long id) {
        return adminRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Admin createAdmin(Admin admin) {
        // First save the User entity
        User user = admin.getUser();
        user.setRole(Role.ADMIN);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        User savedUser = userRepository.save(user);
        
        // Then set the saved user to admin and save
        admin.setUser(savedUser);
        return adminRepository.save(admin);
    }

    @Override
    public Admin updateAdmin(Long id, Admin admin) {
        if (adminRepository.existsById(id)) {
            admin.setAdminId(id);
            return adminRepository.save(admin);
        }
        return null;
    }

    @Override
    public void deleteAdmin(Long id) {
        adminRepository.deleteById(id);
    }
}