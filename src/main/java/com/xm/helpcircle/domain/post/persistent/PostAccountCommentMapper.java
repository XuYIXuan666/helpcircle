package com.xm.helpcircle.domain.post.persistent;

import com.xm.helpcircle.domain.post.entity.PostAccountComment;
import com.xm.helpcircle.domain.post.entity.PostAccountCommentExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PostAccountCommentMapper {
    long countByExample(PostAccountCommentExample example);

    int deleteByExample(PostAccountCommentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PostAccountComment record);

    int insertSelective(PostAccountComment record);

    List<PostAccountComment> selectByExample(PostAccountCommentExample example);

    PostAccountComment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PostAccountComment record, @Param("example") PostAccountCommentExample example);

    int updateByExample(@Param("record") PostAccountComment record, @Param("example") PostAccountCommentExample example);

    int updateByPrimaryKeySelective(PostAccountComment record);

    int updateByPrimaryKey(PostAccountComment record);
}