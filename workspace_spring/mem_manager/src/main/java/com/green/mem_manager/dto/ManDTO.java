package com.green.mem_manager.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Date;
import java.sql.Timestamp;

@Getter
@Setter
@ToString
public class ManDTO {
String memId;
String memName;
String memPw;
String memTel;
String memIntro;
Timestamp joinDate;


}
