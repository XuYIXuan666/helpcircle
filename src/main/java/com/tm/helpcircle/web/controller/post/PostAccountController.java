package com.tm.helpcircle.web.controller.post;

import com.tm.helpcircle.biz.post.PostAccountAction;
import com.tm.helpcircle.biz.post.PostAccountQuery;
import com.tm.helpcircle.common.utils.FileUtils;
import com.tm.helpcircle.domain.post.entity.PostAccount;
import com.tm.helpcircle.web.controller.config.WebReturn;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.NotNull;
import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;


/**
 * @Author XuLiang
 * create 2019-09-04 14:34
 */
@Controller
@Validated
public class PostAccountController {

    private final Logger logger = LoggerFactory.getLogger(PostAccountController.class);

    @Autowired
    private PostAccountQuery postAccountQuery;
    @Autowired
    private PostAccountAction postAccountAction;
    @Value("${web.upload-path}")
    private String filePath;
    /**
     * 帖子列表
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
    /**
     * 帖子详情
     * @param postNO
     * @return
     */
    @GetMapping("/post/details")
    @ResponseBody
    public WebReturn quesDetails(@NotNull(message = "物品编号不能为空") @RequestParam(required = false) Long postNO){
        PostAccount postAccount = postAccountQuery.getQuestions(postNO);
        return WebReturn.success(postAccount);
    }
    /**
     * 帖子添加(发布)
     * @param postAccount
     * @return
     */
    @GetMapping("/post/insert")
    @ResponseBody
    public WebReturn quesInsert(@RequestBody PostAccount postAccount){
        int postAccountId = postAccountAction.getInsert(postAccount);
        return WebReturn.success(postAccountId);
    }

    /**
     *  图片上传
     * @param file
     * @return
     */
    @PostMapping(value = "/fileUpload")
    public WebReturn fileUpload(@RequestParam(value = "file") MultipartFile file) {
        String filePathImg = FileUtils.fileUpload(file, filePath);
        System.out.println(filePathImg);
        return WebReturn.success(filePathImg);
    }
}
