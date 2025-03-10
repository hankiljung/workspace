package com.green.member_manager.controller;


import com.green.member_manager.dto.MemDTO;
import com.green.member_manager.service.MemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reacts")
public class MemController {
 MemService memService;

 @Autowired
  public MemController(MemService memService) {
    this.memService = memService;
  }

  @GetMapping("")
  public List<MemDTO> selectAll(){
   return memService.selectAll();
  }

  @PostMapping("/join")
 public void insertMem(@RequestBody MemDTO memDTO){
    memService.insertMem(memDTO);
  }

 @GetMapping("/{memId}")
 public MemDTO selectOne(@PathVariable("memId") String memId,MemDTO memDTO ){
  memDTO.setMemId(memId);
  return memService.selectOne(memDTO);
 }

 @DeleteMapping("/{memId}")
 public void deleteOne(@PathVariable("memId") String memId, MemDTO memDTO){
  memDTO.setMemId(memId);
 memService.deleteOne(memDTO);
 }
 @PutMapping("/update/{memId}")
 public void updateOne(@PathVariable("memId") String memId, @RequestBody MemDTO MemDTO){
 MemDTO.setMemId(memId);
 memService.updateOne(MemDTO);
 }
}
