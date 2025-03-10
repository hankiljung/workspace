package com.green.board.controller;

import com.green.board.dto.ReplyDTO;
import com.green.board.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/replys")
public class ReplyController {
  ReplyService replyService;

  @Autowired
  public ReplyController(ReplyService replyService) {
    this.replyService = replyService;
  }

  //댓글 조회 api
  //(get) localhost:8080/replys/1
  @GetMapping("/{boardNum}")
  public List<ReplyDTO> selectAllReply(@PathVariable("boardNum") int boardNum){
    return replyService.selectAllReply(boardNum);
  }

  //댓글 삭제 api
  //(delete) localhost:8080/replys/1
  @DeleteMapping("/{replyNum}")
  public void deleteReply(@PathVariable("replyNum") int replyNum){
    replyService.deleteReply(replyNum);
  }

  //댓글 삭제 api
  //(post) localhost:8080/replys
  @PostMapping("")
  public void insertReply(@RequestBody ReplyDTO replyDTO){
    replyService.insertReply(replyDTO);
  }

}
