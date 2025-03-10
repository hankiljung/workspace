package com.green.book_shop.admin.service;

import com.green.book_shop.admin.mapper.AdminMapper;
import com.green.book_shop.book.dto.BookCategoryDTO;
import com.green.book_shop.book.dto.BookDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService{
  private final AdminMapper adminMapper;

}

