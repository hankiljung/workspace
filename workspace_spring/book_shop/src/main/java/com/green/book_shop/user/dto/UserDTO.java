package com.green.book_shop.user.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserDTO {
  private String userId;
  private String userPw;
  private String userName;
  private String userEmail;
  private String userTel;
  private String userRoll;
  private String isUsing;
  private LocalDateTime joinDate;

}
