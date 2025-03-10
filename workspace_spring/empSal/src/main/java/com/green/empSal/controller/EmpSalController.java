package com.green.empSal.controller;

import com.green.empSal.dto.EmpDTO;
import com.green.empSal.service.EmpSalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/empsals")
public class EmpSalController {
  EmpSalService empSalService;

  @Autowired
  public EmpSalController(EmpSalService empSalService) {
    this.empSalService = empSalService;
  }

  @GetMapping("")
  public List<EmpDTO> selectAll(){
    return  empSalService.selectAll();
  }
}
