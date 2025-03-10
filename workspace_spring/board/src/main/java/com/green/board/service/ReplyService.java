package com.green.board.service;

import com.green.board.dto.ReplyDTO;

import java.util.List;

public interface ReplyService {

  // 전체 댓글 조회 메서드
  List<ReplyDTO> selectAllReply (int boardNum);

  //댓글 삭제 메서드
  void deleteReply(int replyNum);

  //댓글 추가 메서드
  void insertReply(ReplyDTO replyDTO);
}
