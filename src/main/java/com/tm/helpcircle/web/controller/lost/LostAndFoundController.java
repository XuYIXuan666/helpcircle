package com.tm.helpcircle.web.controller.lost;

import com.tm.helpcircle.biz.lost.LostAndFoundAction;
import com.tm.helpcircle.biz.lost.LostAndFoundQuery;
import com.tm.helpcircle.domain.lost.entity.LostAndFound;
import com.tm.helpcircle.web.controller.config.WebReturn;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.constraints.NotNull;
import java.util.List;

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

    /**
     * 失物招领列表
     * @param status
     * @return
     */
    @GetMapping("/ques/list")
    @ResponseBody
    public WebReturn quesList(@NotNull(message = "状态不能为空") @RequestParam(required = false) Integer status,
                          @RequestParam(required = false, defaultValue = "10") Integer pageSize,
                          @RequestParam Long page){
        List<LostAndFound> lostAndFoundList = lostAndFoundQuery.getQuestionsList(status, pageSize, page);
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
    @GetMapping("/ques/insert")
    @ResponseBody
    public WebReturn quesInsert(@RequestBody LostAndFound lostAndFound){
        int lostAndFoundId = lostAndFoundAction.getInsert(lostAndFound);
        return WebReturn.success(lostAndFoundId);
    }

}
