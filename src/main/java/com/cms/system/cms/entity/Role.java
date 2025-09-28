package com.cms.system.cms.entity;

public enum Role {
    STUDENT,
    TEACHER,
    ADMIN;
    
    public String getAuthority() {
        return "ROLE_" + this.name();
    }
}
