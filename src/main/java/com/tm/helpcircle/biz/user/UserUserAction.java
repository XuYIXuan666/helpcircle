package com.tm.helpcircle.biz.user;

import com.tm.helpcircle.domain.user.entity.User;
import com.tm.helpcircle.domain.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author XuLiang
 * create 2019-09-12 13:16
 */
@Component
public class UserUserAction {

    @Autowired
    private UserService userService;

    public void insert(User user) {
        userService.insert(user);
    }

    public void updateById(User user) {
        userService.updateById(user);
    }
}
