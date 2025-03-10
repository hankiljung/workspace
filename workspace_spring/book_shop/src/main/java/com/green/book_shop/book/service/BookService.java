package com.green.book_shop.book.service;

import com.green.book_shop.book.dto.BookCategoryDTO;
import com.green.book_shop.book.dto.BookDTO;

import java.util.List;

public interface BookService {

  List<BookCategoryDTO> selectCate();

  void insertCate(BookCategoryDTO bookCategoryDTO);

  void insertBook(BookDTO bookDTO);

  void deleteCate(int cateCode);

  int insertCategory(BookCategoryDTO bookCategoryDTO);

}
