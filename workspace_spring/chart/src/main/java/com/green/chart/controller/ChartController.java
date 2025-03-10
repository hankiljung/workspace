package com.green.chart.controller;

import com.green.chart.dto.ChartDTO;
import com.green.chart.service.ChartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/charts")
public class ChartController {

ChartService chartService;

@Autowired
  public ChartController(ChartService chartService) {
    this.chartService = chartService;
  }

  //localhost:8080/charts
   //차트 조회 쿼리
  @GetMapping("")
  public List<ChartDTO> selectAll(){
  return chartService.selectAll();
  }

  @PostMapping("")
  public void insertChart(@RequestBody ChartDTO chartDTO){
  chartService.insertChart(chartDTO);
  }
}
