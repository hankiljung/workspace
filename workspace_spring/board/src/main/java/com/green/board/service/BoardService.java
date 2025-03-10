package com.green.board.service;

import com.green.board.dto.BoardDTO;

import java.util.List;

public interface BoardService {

  //리스트 조회
  List<BoardDTO> selectAll();

  //리스트 조회
  void writeBoard(BoardDTO boardDTO);

  //게시글 삭제
  void deleteBoard(int boardnum);

  List<BoardDTO> selectOne(BoardDTO boardDTO);

  BoardDTO selectFromNum(BoardDTO boardDTO);
  void updateCnt(int boardNum);
  void updateBoard(BoardDTO boardDTO);
}

