package com.green.empSal.mapper;

import com.green.empSal.dto.EmpDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmpSalMapper {

  /// 전체 조회 쿼리
  List<EmpDTO>selectAll() ;
}
