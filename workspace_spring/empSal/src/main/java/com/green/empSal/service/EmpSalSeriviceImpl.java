package com.green.empSal.service;

import com.green.empSal.dto.EmpDTO;
import com.green.empSal.mapper.EmpSalMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpSalSeriviceImpl implements EmpSalService{
  EmpSalMapper empSalMapper;

  @Autowired
  public EmpSalSeriviceImpl(EmpSalMapper empSalMapper) {
    this.empSalMapper = empSalMapper;
  }

  @Override
  public List<EmpDTO> selectAll() {
    return empSalMapper.selectAll();
  }
}
