package com.green.board.mapper;

import com.green.board.dto.ReplyDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReplyMapper {

  // 모든 댓글 조회 쿼리
  List<ReplyDTO> selectAllReply (int boardNum);

  //댓글 삭제 쿼리
  void deleteReply(int replyNum);

  //댓글 추가 쿼리
  void insertReply(ReplyDTO replyDTO);

}
