package com.tm.helpcircle.web.controller.lost;

import com.tm.helpcircle.biz.lost.LostAndFoundAction;
import com.tm.helpcircle.biz.lost.LostAndFoundCommentAction;
import com.tm.helpcircle.biz.lost.LostAndFoundQuery;
import com.tm.helpcircle.common.enums.LostAndFoundStatusEnum;
import com.tm.helpcircle.common.utils.FileUtils;
import com.tm.helpcircle.domain.lost.entity.LostAndFound;
import com.tm.helpcircle.domain.lost.entity.LostAndFoundComment;
import com.tm.helpcircle.web.controller.config.WebReturn;
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

/**
 *  失物招领
 */
@Controller
@Validated
public class LostAndFoundController {

    private final Logger logger = LoggerFactory.getLogger(LostAndFoundController.class);

    @Autowired
    private LostAndFoundQuery lostAndFoundQuery;
    @Autowired
    private LostAndFoundAction lostAndFoundAction;
    @Autowired
    private LostAndFoundCommentAction lostAndFoundCommentAction;

    @Value("${upload-path-imgLost}")
    private String filePath;
    @Value("${exhibition-path-imgLost}")
    private String exhibitionPath;
    /**
     * 失物招领列表
     * @return
     */
    @GetMapping("/ques/list")
    @ResponseBody
    public WebReturn quesList(
                          @RequestParam(required = false)String lostName,
                          @RequestParam(required = false, defaultValue = "10") Integer pageSize,
                          @RequestParam Long page){
        String status = LostAndFoundStatusEnum.UNCOLLECTED.getType();
        List<LostAndFound> lostAndFoundList = lostAndFoundQuery.getQuestionsList(status, pageSize, page, lostName);
        return WebReturn.success(lostAndFoundList);
    }
    /**
     * 失物招领详情
     * @param lostArticleNo
     * @return
     */
    @GetMapping("/ques/details")
    @ResponseBody
    public WebReturn quesDetails(@NotNull(message = "物品编号不能为空") @RequestParam(required = false) String lostArticleNo){
        LostAndFound lostAndFound = lostAndFoundQuery.getQuestions(lostArticleNo);
        return WebReturn.success(lostAndFound);
    }
    /**
     * 失物招领添加(发布)
     * @param lostAndFound
     * @return
     */
    @PostMapping("/ques/insert")
    @ResponseBody
    public WebReturn quesInsert(@RequestBody LostAndFound lostAndFound){
        lostAndFound.setLostArticleStatus(LostAndFoundStatusEnum.UNCOLLECTED.getType());
        String lostArticleNo = UUID.randomUUID().toString();
        lostAndFound.setLostArticleNo(lostArticleNo);
        int lostAndFoundId = lostAndFoundAction.getInsert(lostAndFound);
        return WebReturn.success(lostAndFoundId);
    }

    /**
     *  图片上传
     * @param file
     * @return
     */
    @PostMapping(value = "/ques/fileUpload")
    @ResponseBody
    public WebReturn fileUpload(@RequestParam(value = "file") MultipartFile file) {
        String filePathImg = FileUtils.fileUpload(file, filePath,exhibitionPath);
        return WebReturn.success(filePathImg);
    }
    /**
     * 帖子评论
     * @param lostAndFoundComment
     * @return
     */
    @PostMapping("/ques/insertComment")
    @ResponseBody
    public WebReturn quesInsertComment(@RequestBody LostAndFoundComment lostAndFoundComment){
        Long postAccountId = lostAndFoundCommentAction.quesInsertComment(lostAndFoundComment);
        return WebReturn.success(postAccountId);
    }
}
