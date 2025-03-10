package com.green.emp.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter
@Setter
@ToString
public class SearchDTO {
  private LocalDate hireDateStart;
  private LocalDate hireDateEnd;
  private String gender;
  private String empName;
  private String deptName;
  private int deptNo;

  DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-mm-dd");


}
