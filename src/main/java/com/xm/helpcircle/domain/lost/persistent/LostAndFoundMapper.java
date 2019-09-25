package com.xm.helpcircle.domain.lost.persistent;

import com.xm.helpcircle.domain.lost.entity.LostAndFound;
import com.xm.helpcircle.domain.lost.entity.LostAndFoundExample;
import com.xm.helpcircle.domain.lost.entity.LostAndFoundWithBLOBs;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LostAndFoundMapper {
    long countByExample(LostAndFoundExample example);

    int deleteByExample(LostAndFoundExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LostAndFoundWithBLOBs record);

    int insertSelective(LostAndFoundWithBLOBs record);

    List<LostAndFoundWithBLOBs> selectByExampleWithBLOBs(LostAndFoundExample example);

    List<LostAndFound> selectByExample(LostAndFoundExample example);

    LostAndFoundWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LostAndFoundWithBLOBs record, @Param("example") LostAndFoundExample example);

    int updateByExampleWithBLOBs(@Param("record") LostAndFoundWithBLOBs record, @Param("example") LostAndFoundExample example);

    int updateByExample(@Param("record") LostAndFound record, @Param("example") LostAndFoundExample example);

    int updateByPrimaryKeySelective(LostAndFoundWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(LostAndFoundWithBLOBs record);

    int updateByPrimaryKey(LostAndFound record);
}