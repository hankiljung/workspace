package com.green.member_manager.mapper;

import com.green.member_manager.dto.MemDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemMapper {
  List<MemDTO> selectAll();
  public void insertMem(MemDTO memDTO);
  MemDTO selectOne(MemDTO memDTO);
  void deleteOne(MemDTO memDTO);
  void updateOne(MemDTO memDTO);
}
