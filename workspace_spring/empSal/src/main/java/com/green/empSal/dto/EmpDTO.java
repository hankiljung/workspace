package com.green.empSal.dto;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmpDTO {
  private String empNo;
  private String empName;
  private String gender;
  private LocalDate hireDate;
  private int deptNo;
  private int jobNo;
  private int sal;
  private DeptDTO dept;
  private JobDTO job;
}
