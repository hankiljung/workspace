package com.green.book_shop.admin.controller;

import com.green.book_shop.admin.service.AdminService;
import com.green.book_shop.book.dto.BookCategoryDTO;
import com.green.book_shop.book.dto.BookDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("admins")
public class AdminController {
  final AdminService adminService;


}
