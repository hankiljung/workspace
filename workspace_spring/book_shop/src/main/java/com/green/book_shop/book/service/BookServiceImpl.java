package com.green.book_shop.book.service;

import com.green.book_shop.admin.mapper.AdminMapper;
import com.green.book_shop.book.dto.BookCategoryDTO;
import com.green.book_shop.book.dto.BookDTO;
import com.green.book_shop.book.mapper.BookMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
  private final BookMapper bookMapper;


  @Override
  public List<BookCategoryDTO> selectCate() {
    return bookMapper.selectCate();
  }

  @Override
  public void insertBook(BookDTO bookDTO) {
    bookMapper.insertBook(bookDTO);
  }

  @Override
  public void insertCate(BookCategoryDTO bookCategoryDTO) {
    /*카테고리명이 중복인지 확인한다.*/
    /*cateName이 null이면 사용가능한 카테고리명*/
    String cateName = bookMapper.selectCateName(bookCategoryDTO.getCateName());
    if(cateName == null) {
      bookMapper.insertCate(bookCategoryDTO);
    }
  }

  @Override
  public void deleteCate(int cateCode) {
    bookMapper.deleteCate(cateCode);
  }

  @Override
  public int insertCategory(BookCategoryDTO bookCategoryDTO) {
    if(bookMapper.selectCateName(bookCategoryDTO.getCateName())==null){
      bookMapper.insertCate(bookCategoryDTO);
      return 1;
    }
    else{
      return 2;
    }
  }
}
