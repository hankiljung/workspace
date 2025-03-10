package com.green.shop.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.web.bind.annotation.RequestBody;

import java.sql.Timestamp;

//DTO 클래스는 하나의 테이브롸 데이터를 주고 받기 위한 자료형
@Setter
@Getter
@ToString
public class ShopDTO {
private int itemCode;
private String itemName;
private int itemPrice;
private String itemIntro;
private Timestamp regDate;


}
