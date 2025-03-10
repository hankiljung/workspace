package com.green.board.controller;


import com.green.board.dto.BoardDTO;
import com.green.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/boards")
public class BoardController {
  BoardService boardService;


  @Autowired
  public BoardController(BoardService boardService) {
    this.boardService = boardService;
  }



  /// 게시글 전체 조회 api
  /// localhost:8080/boards
  @GetMapping("")
  public List<BoardDTO> selectAll(){
      return boardService.selectAll();
  }


  /// 게시글 등록 api
  /// localhost:8080/boards
  @PostMapping("")
  public void writeBoard(@RequestBody BoardDTO boardDTO){
    boardService.writeBoard(boardDTO);
  }


//  @GetMapping("/{title}/{writer}")
//  public List<BoardDTO> selectFromTitle(
//      @PathVariable("title" ) String title,
//      @PathVariable("writer") String writer,
//      BoardDTO boardDTO){
//    boardDTO.setWriter(writer);
//    boardDTO.setTitle(title);
//    return boardService.selectOne(boardDTO);
//  }

  /// 상세 조회 api
  /// localhost:8080/boards/1
  @GetMapping("/{boardNum}")
  public BoardDTO selectFromWriter(
      @PathVariable("boardNum") int boardNum, BoardDTO boardDTO){
    boardService.updateCnt(boardNum);
    return boardService.selectFromNum(boardDTO);
  }


  /// 게시글 업데이트 api
  /// localhost:8080/boards/1
  @PutMapping("/{boardNum}")
  public void updateBoard(@PathVariable("boardNum") int boardNum, @RequestBody BoardDTO boardDTO){
    boardDTO.setBoardNum(boardNum);
    boardService.updateBoard(boardDTO);
  }

  /// 게시글 삭제 api
  /// localhost:8080/boards/1
  @DeleteMapping("/{boardNum}")
  public void deleteBoard(@PathVariable("boardNum") int boardNum){
    boardService.deleteBoard(boardNum);
  }

}
