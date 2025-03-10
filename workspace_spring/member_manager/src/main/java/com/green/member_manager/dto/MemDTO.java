package com.green.member_manager.dto;


import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@ToString
public class MemDTO {
  private String memId;
  private String memName;
  private String memPw;
  private String memTel;
  private String memIntro;
  private Timestamp joinDate;


}
