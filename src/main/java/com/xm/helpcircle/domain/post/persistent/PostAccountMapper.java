package com.xm.helpcircle.domain.post.persistent;

import com.xm.helpcircle.domain.post.entity.PostAccount;
import com.xm.helpcircle.domain.post.entity.PostAccountExample;
import com.xm.helpcircle.domain.post.entity.PostAccountWithBLOBs;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PostAccountMapper {
    long countByExample(PostAccountExample example);

    int deleteByExample(PostAccountExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PostAccountWithBLOBs record);

    int insertSelective(PostAccountWithBLOBs record);

    List<PostAccountWithBLOBs> selectByExampleWithBLOBs(PostAccountExample example);

    List<PostAccount> selectByExample(PostAccountExample example);

    PostAccountWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PostAccountWithBLOBs record, @Param("example") PostAccountExample example);

    int updateByExampleWithBLOBs(@Param("record") PostAccountWithBLOBs record, @Param("example") PostAccountExample example);

    int updateByExample(@Param("record") PostAccount record, @Param("example") PostAccountExample example);

    int updateByPrimaryKeySelective(PostAccountWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(PostAccountWithBLOBs record);

    int updateByPrimaryKey(PostAccount record);
}