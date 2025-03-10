package com.green.mem_manager.mapper;

import com.green.mem_manager.dto.ManDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ManMapper {
  List<ManDTO> selectAll();
  ManDTO selectOne(String menId);
}
