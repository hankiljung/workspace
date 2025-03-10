package com.green.book_shop.user.service;

import com.green.book_shop.user.dto.UserDTO;
import com.green.book_shop.user.mapper.UserMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{
  private final UserMapper userMapper;

  @Override
  public void insertUser(UserDTO user) {
    userMapper.insertUser(user);
  }
}
