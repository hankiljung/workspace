package com.green.chart.service;

import com.green.chart.dto.ChartDTO;
import com.green.chart.mapper.ChartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChartServiceImpl implements ChartService{
  ChartMapper chartMapper;

  @Autowired
  public ChartServiceImpl(ChartMapper chartMapper) {
    this.chartMapper = chartMapper;
  }

  @Override
  public void insertChart(ChartDTO chartDTO) {
    chartMapper.insertChart(chartDTO);
  }

  @Override
  public List<ChartDTO> selectAll() {
    return chartMapper.selectAll();
  }
}
