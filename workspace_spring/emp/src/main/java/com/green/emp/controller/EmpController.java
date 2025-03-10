package com.green.emp.controller;

import com.green.emp.dto.EmpDTO;
import com.green.emp.dto.SearchDTO;
import com.green.emp.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
@RequestMapping("/emps")
public class EmpController {
  EmpService empService;

  @Autowired
  public EmpController(EmpService empService) {
    this.empService = empService;
  }

  //localhost:8080/api/emps/deptjob
  //부서 조회 api
  @GetMapping("/deptjob")
  public List<EmpDTO> selectDept(){
    return empService.selectDept();
  }

  //localhost:8080/api/emps/deptjob
  //부서 등록 api
    @PostMapping("/deptjob")
  public void insertDept(@RequestBody EmpDTO empDTO){
    empService.insertDept(empDTO);
  }

  //localhost:8080/api/emps/deptjob
  //부서 삭제 api
  @DeleteMapping("/{deptNo}")
  public void deleteDept(@PathVariable("deptNo") int deptNo){
    empService.deleteDept(deptNo);
  }

  //localhost:8080/api/emps/job
  //직급 조회 api
  @GetMapping("/job")
  public List<EmpDTO> selectJob(){
   return empService.selectJob();
  }

  //localhost:8080/api/emps/job
  //직급 등록 api
  @PostMapping("/job")
  public void insertJob(@RequestBody EmpDTO empDTO){
    empService.insertJob(empDTO);
  }

  //localhost:8080/api/emps/job
  //직급 삭제 api
  @DeleteMapping("/job/{jobNo}")
  public void deleteJob(@PathVariable("jobNo") int jobNo){
    empService.deleteJob(jobNo);
  }

  //localhost:8080/api/emps/emp
  //사원 등록 api
  @PostMapping("/emp")
  public void insertEmp(@RequestBody EmpDTO empDTO){
    empService.insertEmp(empDTO);
  }

  //localhost:8080/api/emps/emp
  // 사원 조회 api
  @GetMapping("/emp")
public List<EmpDTO> selectEmp(SearchDTO searchDTO){
    System.out.println(searchDTO);
   return   empService.selectEmp(searchDTO);
  }
}

