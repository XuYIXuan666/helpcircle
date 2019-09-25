package com.xm.helpcircle.web.controller.user;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.xm.helpcircle.biz.user.UserQuery;
import com.xm.helpcircle.biz.user.UserUserAction;
import com.xm.helpcircle.common.utils.WechatUtil;
import com.xm.helpcircle.domain.user.entity.User;
import com.xm.helpcircle.web.controller.config.WebReturn;
import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.Date;
import java.util.UUID;

import static com.xm.helpcircle.common.utils.CodeGenerator.getOrderNo;

/**
 * @Author XuLiang
 * create 2019-09-12 13:10
 */
@Controller
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserQuery userQuery;
    @Autowired
    private UserUserAction userUserAction;

    /**
     * 微信用户登录详情
     */
    @PostMapping("wx/login")
    @ResponseBody
    public WebReturn user_login(@RequestParam(value = "code", required = false) String code,
                                @RequestParam(value = "rawData", required = false) String rawData,
                                @RequestParam(value = "signature", required = false) String signature,
                                @RequestParam(value = "encrypteData", required = false) String encrypteData,
                                @RequestParam(value = "iv", required = false) String iv) {

        // 用户非敏感信息：rawData
        // 签名：signature
        JSONObject rawDataJson = JSON.parseObject(rawData);
        // 1.接收小程序发送的code
        // 2.开发者服务器 登录凭证校验接口 appi + appsecret + code
        JSONObject SessionKeyOpenId = WechatUtil.getSessionKeyOrOpenId(code);
        // 3.接收微信接口服务 获取返回的参数
        String openid = SessionKeyOpenId.getString("openid");
        String sessionKey = SessionKeyOpenId.getString("session_key");

        // 4.校验签名 小程序发送的签名signature与服务器端生成的签名signature2 = sha1(rawData + sessionKey)
        String signature2 = DigestUtils.sha1Hex(rawData + sessionKey);
        if (!signature.equals(signature2)) {
            return WebReturn.failure("500", "签名校验失败", null);
        }
        // 5.根据返回的User实体类，判断用户是否是新用户，是的话，将用户信息存到数据库；不是的话，更新最新登录时间
        User user = userQuery.selectById(openid);
        //生成唯一key，用于维护微信小程序用户与服务端的会话
        String skey = getOrderNo("user");
        if (user == null) {
            // 用户信息入库
            String nickName = rawDataJson.getString("nickName");
            String avatarUrl = rawDataJson.getString("avatarUrl");
            String gender = rawDataJson.getString("gender");
            String city = rawDataJson.getString("city");
            String country = rawDataJson.getString("country");
            String province = rawDataJson.getString("province");

            user = new User();
            user.setOpenId(openid);
            user.setSkey(skey);
            user.setCreateTime(new Date());
            user.setLastVisitTime(new Date());
            user.setSessionKey(sessionKey);
            user.setCity(city);
            user.setProvince(province);
            user.setCountry(country);
            user.setAvatarUrl(avatarUrl);
            user.setGender(Byte.parseByte(gender));
            user.setNickName(nickName);
            this.userUserAction.insert(user);
        } else {
            // 已存在，更新用户登录时间
            user.setLastVisitTime(new Date());
            // 重新设置会话skey
            user.setSkey(skey);
            this.userUserAction.updateById(user);
        }
        //encrypteData比rowData多了appid和openid
        JSONObject userInfo = WechatUtil.getUserInfo(encrypteData, sessionKey, iv);
        logger.info("user_login_userInfo",userInfo);
        //6. 把新的skey返回给小程序
        return WebReturn.success("200",null,skey);
    }

}
