package com.green.chart.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ChartDTO {
  private int chartNum;
  private String name;
  private double bodyweight;
  private double bodyfat;
  private double muscle;

}
