package com.tm.helpcircle.biz.user;

import com.tm.helpcircle.domain.user.entity.User;
import com.tm.helpcircle.domain.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author XuLiang
 * create 2019-09-12 13:15
 */
@Component
public class UserQuery {


    @Autowired
    private UserService userService;

    public User selectById(String openid) {
        User user = userService.selectById(openid);
        return user;
    }
}
