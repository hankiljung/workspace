package com.green.member_manager.service;

import com.green.member_manager.dto.MemDTO;

import java.util.List;

public interface MemService {
  List<MemDTO> selectAll();
  public void insertMem(MemDTO memDTO);
  MemDTO selectOne(MemDTO memDTO);
  void deleteOne(MemDTO memDTO);
  void updateOne(MemDTO memDTO);
}
