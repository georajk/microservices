package com.codergk.user.vo;

import com.codergk.user.entity.User;
import lombok.Data;

@Data
public class UserResponseVO {

    private User user;
    private Department department;

}
