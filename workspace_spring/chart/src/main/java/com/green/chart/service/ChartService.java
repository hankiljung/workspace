package com.green.chart.service;

import com.green.chart.dto.ChartDTO;

import java.util.List;

public interface ChartService {

  void insertChart(ChartDTO chartDTO);

  List<ChartDTO> selectAll();
}
