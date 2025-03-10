package com.green.board.service;

import com.green.board.dto.BoardDTO;
import com.green.board.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl  implements BoardService{
  BoardMapper boardMapper;

  @Autowired
  public BoardServiceImpl(BoardMapper boardMapper)
  {
    this.boardMapper = boardMapper;
  }

  @Override
  public List<BoardDTO> selectAll() {
    return boardMapper.selectAll();
  }

  @Override
  public void writeBoard(BoardDTO boardDTO) {
    boardMapper.writeBoard(boardDTO);
  }

  @Override
  public List<BoardDTO> selectOne(BoardDTO boardDTO) {
  return boardMapper.selectOne(boardDTO);

  }

  @Override
  public BoardDTO selectFromNum(BoardDTO boardDTO) {

    return boardMapper.selectFromNum(boardDTO);
  }

  @Override
  public void updateCnt(int boardNum) {

    boardMapper.updateCnt(boardNum);
  }

  @Override
  public void updateBoard(BoardDTO boardDTO) {

    boardMapper.updateBoard(boardDTO);
  }

  @Override
  public void deleteBoard(int boardnum) {
    boardMapper.deleteBoard(boardnum);
  }
}
