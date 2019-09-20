package com.xm.helpcircle.domain.lost.persistent;

import com.xm.helpcircle.domain.lost.entity.LostAndFoundComment;
import com.xm.helpcircle.domain.lost.entity.LostAndFoundCommentExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LostAndFoundCommentMapper {
    long countByExample(LostAndFoundCommentExample example);

    int deleteByExample(LostAndFoundCommentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LostAndFoundComment record);

    int insertSelective(LostAndFoundComment record);

    List<LostAndFoundComment> selectByExample(LostAndFoundCommentExample example);

    LostAndFoundComment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LostAndFoundComment record, @Param("example") LostAndFoundCommentExample example);

    int updateByExample(@Param("record") LostAndFoundComment record, @Param("example") LostAndFoundCommentExample example);

    int updateByPrimaryKeySelective(LostAndFoundComment record);

    int updateByPrimaryKey(LostAndFoundComment record);
}