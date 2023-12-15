package com.security.securityauth.dto;

import com.security.securityauth.enums.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {
}
