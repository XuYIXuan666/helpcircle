package com.tm.helpcircle.biz.post;

import com.tm.helpcircle.domain.post.entity.PostAccount;
import com.tm.helpcircle.domain.post.entity.PostAccountComment;
import com.tm.helpcircle.domain.post.service.PostAccountCommentService;
import com.tm.helpcircle.domain.post.service.PostAccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

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

    public List<PostAccount> getQuestionsList(String status, Integer pageSize, Long page,String postName) {
        List<PostAccount> postAccountList = postAccountService.getQuestionsList(status, pageSize, page, postName);
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

    public PostAccount getQuestions(Long postNo) {
        PostAccount postAccount = postAccountService.getQuestions(postNo);
        if(postAccount != null && postAccount.getPostUrl() != null && !postAccount.getPostUrl().equals("")){
            postAccount.setPostUrlList(Arrays.asList(postAccount.getPostUrl().split("\\|")));
        }
        //评论
        List<PostAccountComment> postAccountCommentList = commentService.getQuestions(postNo);
        postAccount.setPostAccountComments(postAccountCommentList);
        return postAccount;
    }
}
