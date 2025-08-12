package com.example.pojo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserUpdatePasswordDto {
    private String oldPassword;
    private String newPassword;
    private String againPassword;
}
