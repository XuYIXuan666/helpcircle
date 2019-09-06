package com.tm.helpcircle.web.controller.post;

import com.tm.helpcircle.biz.post.PostAccountQuery;
import com.tm.helpcircle.domain.post.entity.PostAccount;
import com.tm.helpcircle.web.controller.config.WebReturn;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @Author XuLiang
 * create 2019-09-04 14:34
 */
public class PostAccountController {

    private final Logger logger = LoggerFactory.getLogger(PostAccountController.class);

    @Autowired
    private PostAccountQuery postAccountQuery;

    /**
     * 失物招领列表
     * @param status
     * @return
     * @throws Exception
     */
    @GetMapping("/post/list")
    @ResponseBody
    public WebReturn list(@NotNull(message = "状态不能为空") @RequestParam(required = false) Integer status,
                          @RequestParam(required = false, defaultValue = "10") Integer pageSize,
                          @RequestParam Long page){
        List<PostAccount> lostAndFoundList = postAccountQuery.getQuestionsList(status, pageSize, page);
        return WebReturn.success(lostAndFoundList);
    }

}
