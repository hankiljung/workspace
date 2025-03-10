package com.green.emp.service;


import com.green.emp.dto.EmpDTO;
import com.green.emp.dto.SearchDTO;

import java.util.List;

public interface EmpService {

  /*부서 조회 메서드*/
  List<EmpDTO> selectDept();

  /*부서 등록 메서드*/
  void insertDept(EmpDTO empDTO);

  /*부서 삭제 메서드*/
  void deleteDept(int deptNO);

  /*직급 조회 메서드*/
  List<EmpDTO>selectJob();

  /*직급 등록 메서드*/
  void insertJob(EmpDTO empDTO);

  /*직급 삭제 메서드*/
  void deleteJob(int jobNo);

  /*사원 등록 메서드*/
  void insertEmp(EmpDTO empDTO);

  /*사원 조회 메서드*/
  List<EmpDTO> selectEmp(SearchDTO searchDTO);
}
