package com.green.chart.mapper;

import com.green.chart.dto.ChartDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ChartMapper {

  // 차트 추가 쿼리
 void insertChart(ChartDTO chartDTO);

 // 차트 조회 쿼리
  List<ChartDTO> selectAll();
}
