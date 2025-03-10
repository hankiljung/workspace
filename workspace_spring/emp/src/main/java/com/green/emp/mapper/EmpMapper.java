package com.green.emp.mapper;

import com.green.emp.dto.EmpDTO;
import com.green.emp.dto.SearchDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmpMapper {

  /*부서 조회 쿼리*/
  List<EmpDTO> selectDept();

  /*부서 등록 쿼리*/
  void insertDept(EmpDTO empDTO);

  /*부서 삭제 쿼리*/
  void deleteDept(int deptNO);

  /*직급 조회 쿼리*/
  List<EmpDTO>selectJob();

  /*직급 등록 쿼리*/
  void insertJob(EmpDTO empDTO);

  /*직급 삭제 쿼리*/
  void deleteJob(int jobNo);

  /*사원 등록 쿼리*/
  void insertEmp(EmpDTO empDTO);

  /*사원 조회 쿼리*/
  List<EmpDTO> selectEmp(SearchDTO searchDTO);

}
