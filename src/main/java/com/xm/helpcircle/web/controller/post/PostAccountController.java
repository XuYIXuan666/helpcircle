package com.xm.helpcircle.web.controller.post;

import com.alibaba.fastjson.JSONObject;
import com.xm.helpcircle.biz.post.PostAccountAction;
import com.xm.helpcircle.biz.post.PostAccountCommentAction;
import com.xm.helpcircle.biz.post.PostAccountQuery;
import com.xm.helpcircle.common.enums.PostAccountStatusEnum;
import com.xm.helpcircle.common.utils.FileUtils;
import com.xm.helpcircle.domain.post.entity.PostAccount;
import com.xm.helpcircle.domain.post.entity.PostAccountComment;
import com.xm.helpcircle.domain.post.entity.PostAccountWithBLOBs;
import com.xm.helpcircle.web.controller.config.WebReturn;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

import static com.xm.helpcircle.common.utils.CodeGenerator.getOrderNo;


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
    @Autowired
    private PostAccountCommentAction  postAccountCommentAction;

    @Value("${upload-path-imgPost}")
    private String filePath;
    @Value("${exhibition-path-imgPost}")
    private String exhibitionPath;
    /**
     * 帖子列表
     * @return
     * @throws Exception
     */
    @GetMapping("/post/list")
    @ResponseBody
    public WebReturn list(
                          @RequestParam(required = false) String postName,
                          @RequestParam(required = false, defaultValue = "10") Integer pageSize,
                          @RequestParam Long page){
        String  status = PostAccountStatusEnum.UNDELETED.getType();
        List<PostAccountWithBLOBs> lostAndFoundList = postAccountQuery.getQuestionsList(status, pageSize, page,postName);
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
        PostAccountWithBLOBs postAccountWithBLOBs = postAccountQuery.getQuestions(postNO);
        return WebReturn.success(postAccountWithBLOBs);
    }
    /**
     * 帖子添加(发布)
     * @param postAccountWithBLOBs
     * @return
     */
    @PostMapping("/post/insert")
    @ResponseBody
    public WebReturn quesInsert(@RequestBody PostAccountWithBLOBs postAccountWithBLOBs){
        postAccountWithBLOBs.setPostStatus(PostAccountStatusEnum.UNDELETED.getType());
        postAccountWithBLOBs.setPostNo(getOrderNo("post"));
        logger.info(JSONObject.toJSONString(postAccountWithBLOBs));
        int postAccountId = postAccountAction.getInsert(postAccountWithBLOBs);
        return WebReturn.success(postAccountId);
    }

    /**
     *  图片上传
     * @param file
     * @return
     */
    @PostMapping(value = "/post/fileUpload")
    @ResponseBody
    public WebReturn fileUpload(@RequestParam(value = "file") MultipartFile file) {
        String filePathImg = FileUtils.fileUpload(file, filePath,exhibitionPath);
        return WebReturn.success(filePathImg);
    }
    /**
     * 帖子评论
     * @param postAccountComment
     * @return
     */
    @PostMapping("/post/insertComment")
    @ResponseBody
    public WebReturn quesInsertComment(@RequestBody PostAccountComment postAccountComment){
        Long postAccountId = postAccountCommentAction.quesInsertComment(postAccountComment);
        return WebReturn.success(postAccountId);
    }

}
