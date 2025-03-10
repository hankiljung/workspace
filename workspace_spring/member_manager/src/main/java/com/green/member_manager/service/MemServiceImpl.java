package com.green.member_manager.service;

import com.green.member_manager.dto.MemDTO;
import com.green.member_manager.mapper.MemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemServiceImpl  implements MemService{
  MemMapper memMapper;

  @Autowired
  public MemServiceImpl(MemMapper memMapper) {
    this.memMapper = memMapper;
  }

  @Override
  public List<MemDTO> selectAll() {
    return memMapper.selectAll();
  }

  @Override
  public void insertMem(MemDTO memDTO) {
    memMapper.insertMem(memDTO);

  }

  @Override
  public void deleteOne(MemDTO memDTO) {
    memMapper.deleteOne(memDTO);
  }

  @Override
  public void updateOne(MemDTO memDTO) {
    memMapper.updateOne(memDTO);
  }

  @Override
  public MemDTO selectOne(MemDTO memDTO) {
    return memMapper.selectOne(memDTO);
  }
}

