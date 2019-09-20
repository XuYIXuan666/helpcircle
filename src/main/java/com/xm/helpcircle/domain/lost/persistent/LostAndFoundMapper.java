package com.xm.helpcircle.domain.lost.persistent;

import com.xm.helpcircle.domain.lost.entity.LostAndFound;
import com.xm.helpcircle.domain.lost.entity.LostAndFoundExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LostAndFoundMapper {
    long countByExample(LostAndFoundExample example);

    int deleteByExample(LostAndFoundExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LostAndFound record);

    int insertSelective(LostAndFound record);

    List<LostAndFound> selectByExampleWithBLOBs(LostAndFoundExample example);

    List<LostAndFound> selectByExample(LostAndFoundExample example);

    LostAndFound selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LostAndFound record, @Param("example") LostAndFoundExample example);

    int updateByExampleWithBLOBs(@Param("record") LostAndFound record, @Param("example") LostAndFoundExample example);

    int updateByExample(@Param("record") LostAndFound record, @Param("example") LostAndFoundExample example);

    int updateByPrimaryKeySelective(LostAndFound record);

    int updateByPrimaryKeyWithBLOBs(LostAndFound record);

    int updateByPrimaryKey(LostAndFound record);
}