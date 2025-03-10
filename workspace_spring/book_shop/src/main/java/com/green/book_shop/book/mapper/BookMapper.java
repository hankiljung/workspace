package com.green.book_shop.book.mapper;

import com.green.book_shop.book.dto.BookCategoryDTO;
import com.green.book_shop.book.dto.BookDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookMapper {
  /*카테고리 조회 쿼리*/
  List<BookCategoryDTO> selectCate();

  /*카테고리 등록 쿼리*/
  void insertCate(BookCategoryDTO bookCategoryDTO);

  /*카테고리 삭제 쿼리*/
  void deleteCate(int cateCode);

  /*카테고리 확인 쿼리*/
  String selectCateName(String cateName);

  /*책 등록 쿼리*/
  void insertBook(BookDTO bookDTO);

}
