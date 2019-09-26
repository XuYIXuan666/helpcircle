package com.xm.helpcircle.biz.post;

import com.xm.helpcircle.domain.post.entity.PostAccount;
import com.xm.helpcircle.domain.post.entity.PostAccountComment;
import com.xm.helpcircle.domain.post.entity.PostAccountWithBLOBs;
import com.xm.helpcircle.domain.post.service.PostAccountCommentService;
import com.xm.helpcircle.domain.post.service.PostAccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @Author XuLiang
 * create 2019-09-04 14:07
 */
@Component
public class PostAccountQuery {

    private final Logger logger = LoggerFactory.getLogger(PostAccountQuery.class);

    @Autowired
    private PostAccountService postAccountService;
    @Autowired
    private PostAccountCommentService commentService;

    public List<PostAccountWithBLOBs> getQuestionsList(String status, Integer pageSize, Long page, String postName) {
        List<PostAccountWithBLOBs> postAccountList = postAccountService.getQuestionsList(status, pageSize, page, postName);
        if(postAccountList != null){
            postAccountList.forEach(postAccount ->{
                if(postAccount != null && postAccount.getPostUrl() != null && !postAccount.getPostUrl().equals("")){
                    List<String> strings = Arrays.asList(postAccount.getPostUrl().split("\\|"));
                    if(strings.size() >= 1){
                        postAccount.setPostUrl(Arrays.asList(postAccount.getPostUrl().split("\\|")).get(0));
                    }
                }
            });
        }
        return postAccountList;
    }

    public PostAccountWithBLOBs getQuestions(String postNo) {
        PostAccountWithBLOBs postAccount = postAccountService.getQuestions(postNo);
        if(postAccount != null && postAccount.getPostUrl() != null && !postAccount.getPostUrl().equals("")){
            postAccount.setPostUrlList(Arrays.asList(postAccount.getPostUrl().split("\\|")));
        }
        //评论
        List<PostAccountComment> postAccountCommentList = commentService.getQuestions(postNo);
        postAccount.setPostAccountComments(postAccountCommentList);
        return postAccount;
    }
}
