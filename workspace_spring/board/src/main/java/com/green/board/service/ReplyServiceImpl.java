package com.green.board.service;

import com.green.board.dto.ReplyDTO;
import com.green.board.mapper.ReplyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReplyServiceImpl implements ReplyService{
  ReplyMapper replyMapper;

  @Autowired
  public ReplyServiceImpl(ReplyMapper replyMapper) {
    this.replyMapper = replyMapper;
  }

  @Override
  public List<ReplyDTO> selectAllReply(int boardNum) {
    return replyMapper.selectAllReply(boardNum);
  }

  @Override
  public void deleteReply(int replyNum) {
    replyMapper.deleteReply(replyNum);
  }

  @Override
  public void insertReply(ReplyDTO replyDTO) {
    replyMapper.insertReply(replyDTO);
  }
}
