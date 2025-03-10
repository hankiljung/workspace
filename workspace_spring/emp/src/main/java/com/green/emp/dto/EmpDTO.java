package com.green.emp.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class EmpDTO {
  /*부서*/
  private int deptNo;
  private String deptName;

  /*직급*/
  private int jobNo;
  private String jobName;

  private int empNO;
  private String empName;
  private String gender;
  private LocalDate hireDate;


}
