package com.green.book_shop.book.controller;

import com.green.book_shop.admin.service.AdminService;
import com.green.book_shop.book.dto.BookCategoryDTO;
import com.green.book_shop.book.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/categories")
public class BookCateController {
  private final BookService bookService;


  /// 카테고리 목록 조회 api
  /// (get) localhost:8080/categories
  @GetMapping("")
  public List<BookCategoryDTO> selectCate (){
    return bookService.selectCate();
  }


  /// 카테고리 등록 api
  /// (post) localhost:8080/categories
  @PostMapping("")
  
  public int insertCate(@RequestBody BookCategoryDTO bookCategoryDTO){
    return bookService.insertCategory(bookCategoryDTO);
  }


  ///  카테고리 삭제 api
  ///  (delete) localhost:8080/categories
  @DeleteMapping("{cateCode}")
  public void deleteCate(@PathVariable("cateCode") int cateCode){
    bookService.deleteCate(cateCode);
  }
}
