package com.green.shop.mapper;

import com.green.shop.dto.ShopDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ShopMapper {
  
  /// 상품등록
  public  int insertItem(ShopDTO shopDTO);
  
  /// 모든 상품 조회
  public List<ShopDTO> selectItem();

  /// 상품 번호로 조회
  public  ShopDTO byNum(int itemCode);

  /// 상품 번호 삭제
  public int deleteByNum(int itemCode);

  ///  상품 번호 수정
  public int updatByNum (ShopDTO shopDTO);




}
