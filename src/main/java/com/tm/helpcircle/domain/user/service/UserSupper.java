package com.tm.helpcircle.domain.user.service;

import com.tm.helpcircle.domain.user.entity.User;
import com.tm.helpcircle.domain.user.persistent.UserMappeer;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author XuLiang
 * create 2019-09-12 13:17
 */
public class UserSupper {

    @Autowired
    private UserMappeer mappeer;

    public User selectById(String openid) {
        User user = mappeer.selectByPrimaryKey(openid);
        return user;
    }

    public void insert(User user) {
        mappeer.insertSelective(user);
    }

    public void updateById(User user) {
        mappeer.updateByPrimaryKeySelective(user);
    }
}
