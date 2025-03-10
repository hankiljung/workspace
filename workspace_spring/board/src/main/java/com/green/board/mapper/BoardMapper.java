package com.green.board.mapper;

import com.green.board.dto.BoardDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

  // 게시판 조회 쿼리
  List<BoardDTO> selectAll();

  // 게시판 작성 쿼리
  void writeBoard(BoardDTO boardDTO);

  // 게시글 조회 쿼리
  List<BoardDTO> selectOne(BoardDTO boardDTO);

  // 번호로 게시글 조회 쿼리
  BoardDTO selectFromNum(BoardDTO boardDTO);

  void updateCnt(int boardNum);

  // 게시글 삭제 쿼리
  void deleteBoard(int boardNum);

  // 게시글 수정 쿼리
  void updateBoard(BoardDTO boardDTO);
}
