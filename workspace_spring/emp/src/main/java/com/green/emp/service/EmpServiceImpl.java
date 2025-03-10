package com.green.emp.service;

import com.green.emp.dto.EmpDTO;
import com.green.emp.dto.SearchDTO;
import com.green.emp.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService{
  EmpMapper empMapper;

  @Autowired
  public EmpServiceImpl(EmpMapper empMapper) {
    this.empMapper = empMapper;
  }

  @Override
  public List<EmpDTO> selectDept() {
    return empMapper.selectDept();
  }

  @Override
  public void deleteDept(int deptNO) {
    empMapper.deleteDept(deptNO);
  }

  @Override
  public List<EmpDTO> selectJob() {
    return empMapper.selectJob();
  }

  @Override
  public void insertDept(EmpDTO empDTO) {
    empMapper.insertDept(empDTO);
  }

  @Override
  public void insertJob(EmpDTO empDTO) {
    empMapper.insertJob(empDTO);
  }

  @Override
  public void deleteJob(int jobNo) {
    empMapper.deleteJob(jobNo);
  }

  @Override
  public void insertEmp(EmpDTO empDTO) {
    empMapper.insertEmp(empDTO);
  }

  @Override
  public List<EmpDTO> selectEmp(SearchDTO searchDTO) {
    return empMapper.selectEmp(searchDTO);
  }
}
