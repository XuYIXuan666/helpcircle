package com.xm.helpcircle.web.controller.lost;

import com.alibaba.fastjson.JSONObject;
import com.xm.helpcircle.biz.lost.LostAndFoundAction;
import com.xm.helpcircle.biz.lost.LostAndFoundCommentAction;
import com.xm.helpcircle.biz.lost.LostAndFoundQuery;
import com.xm.helpcircle.common.enums.LostAndFoundStatusEnum;
import com.xm.helpcircle.common.utils.FileUtils;
import com.xm.helpcircle.domain.lost.entity.LostAndFound;
import com.xm.helpcircle.domain.lost.entity.LostAndFoundComment;
import com.xm.helpcircle.domain.lost.entity.LostAndFoundWithBLOBs;
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

import static com.xm.helpcircle.common.utils.CodeGenerator.getOrderNo;

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
        List<LostAndFoundWithBLOBs> lostAndFoundList = lostAndFoundQuery.getQuestionsList(status, pageSize, page, lostName);
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
        LostAndFoundWithBLOBs lostAndFound = lostAndFoundQuery.getQuestions(lostArticleNo);
        return WebReturn.success(lostAndFound);
    }
    /**
     * 失物招领添加(发布)
     * @param lostAndFoundWithBLOBs
     * @return
     */
    @PostMapping("/ques/insert")
    @ResponseBody
    public WebReturn quesInsert(@RequestBody LostAndFoundWithBLOBs lostAndFoundWithBLOBs){
        lostAndFoundWithBLOBs.setLostArticleStatus(LostAndFoundStatusEnum.UNCOLLECTED.getType());
        lostAndFoundWithBLOBs.setLostArticleNo(getOrderNo("ques"));
        logger.info(JSONObject.toJSONString(lostAndFoundWithBLOBs));
        int lostAndFoundId = lostAndFoundAction.getInsert(lostAndFoundWithBLOBs);
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
