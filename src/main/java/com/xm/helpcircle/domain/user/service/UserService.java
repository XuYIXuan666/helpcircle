package com.xm.helpcircle.domain.user.service;

import com.xm.helpcircle.domain.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author XuLiang
 * create 2019-09-12 13:16
 */
@Component
public class UserService {

    @Autowired
    private UserSupper supper;

    public User selectById(String openid) {
        User user = supper.selectById(openid);
        return user;
    }

    public void insert(User user) {
        supper.insert(user);
    }

    public void updateById(User user) {
        supper.updateById(user);
    }
}
