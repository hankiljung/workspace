package com.green.mem_manager.controller;

import com.green.mem_manager.dto.ManDTO;
import com.green.mem_manager.service.ManService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mans")
public class ManController {
  ManService manService;

  @Autowired
  public ManController(ManService manService) {
    this.manService = manService;
  }

  @GetMapping("")
  public List<ManDTO> selectAll(){
    System.out.println("자료 조회가 완료되었습니다.");
    return manService.selectAll();
  }
  @GetMapping("/{memId}")
  public ManDTO selectOne (@PathVariable("memId") String memId){
    return manService.selectOne(memId);
  }

}
