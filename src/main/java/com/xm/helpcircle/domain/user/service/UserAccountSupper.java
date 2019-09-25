package com.xm.helpcircle.domain.user.service;

import com.xm.helpcircle.domain.user.entity.UserAccount;
import com.xm.helpcircle.domain.user.entity.UserAccountExample;
import com.xm.helpcircle.domain.user.persistent.UserAccountMapper;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author XuLiang
 * create 2019-09-25 17:04
 */

@Component
public class UserAccountSupper {
    private final Logger logger = LoggerFactory.getLogger(UserAccountSupper.class);


    @Autowired
    private UserAccountMapper mapper;


    public void insert(UserAccount userAccount) {
        mapper.insertSelective(userAccount);
    }

    public UserAccount selectByOpenId(String openid) {
        UserAccountExample example = new UserAccountExample();
        example.setLimit(1);
        example.createCriteria().andOpenNoEqualTo(openid);
        List<UserAccount> userAccounts = mapper.selectByExample(example);
        if(CollectionUtils.isEmpty(userAccounts))
            return null;
        return userAccounts.get(0);
    }
}
