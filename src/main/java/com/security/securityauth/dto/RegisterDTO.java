package com.security.securityauth.dto;

import com.security.securityauth.entity.enums.UserRole;

public record RegisterDTO(String email, String password, UserRole role) {
}
