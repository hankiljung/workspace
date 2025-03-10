package com.green.mem_manager.service;

import com.green.mem_manager.dto.ManDTO;
import com.green.mem_manager.mapper.ManMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Service
public class ManServiceImpl implements ManService{
  ManMapper manMapper;

  @Autowired
  public ManServiceImpl(ManMapper manMapper) {
    this.manMapper = manMapper;
  }
  @Override
  public List<ManDTO> selectAll() {
    return  manMapper.selectAll();
  }

  @Override
  public ManDTO selectOne(String menId) {
    return manMapper.selectOne(menId);
  }
}
