package com.green.book_shop.book.controller;

import com.green.book_shop.admin.service.AdminService;
import com.green.book_shop.book.dto.BookDTO;
import com.green.book_shop.book.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/books")
public class BookController {
  final BookService bookService;

  /// 도서 등록 api
  /// (post) localhost:8080/books
  @PostMapping("")
  public void insertBook(@RequestBody BookDTO bookDTO){
    bookService.insertBook(bookDTO);
  }

}
