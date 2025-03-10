package com.green.mem_manager.service;

import com.green.mem_manager.dto.ManDTO;

import java.util.List;

public interface ManService {
  List<ManDTO> selectAll();
  ManDTO selectOne(String menId);
}
