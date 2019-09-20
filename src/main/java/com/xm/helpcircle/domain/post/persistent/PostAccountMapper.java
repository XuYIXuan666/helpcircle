package com.xm.helpcircle.domain.post.persistent;

import com.xm.helpcircle.domain.post.entity.PostAccount;
import com.xm.helpcircle.domain.post.entity.PostAccountExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PostAccountMapper {
    long countByExample(PostAccountExample example);

    int deleteByExample(PostAccountExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PostAccount record);

    int insertSelective(PostAccount record);

    List<PostAccount> selectByExampleWithBLOBs(PostAccountExample example);

    List<PostAccount> selectByExample(PostAccountExample example);

    PostAccount selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PostAccount record, @Param("example") PostAccountExample example);

    int updateByExampleWithBLOBs(@Param("record") PostAccount record, @Param("example") PostAccountExample example);

    int updateByExample(@Param("record") PostAccount record, @Param("example") PostAccountExample example);

    int updateByPrimaryKeySelective(PostAccount record);

    int updateByPrimaryKeyWithBLOBs(PostAccount record);

    int updateByPrimaryKey(PostAccount record);
}