package com.green.shop.controller;

import com.green.shop.dto.ShopDTO;
import com.green.shop.service.ShopService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/shops")
@RestController
public class ShopController {
ShopService shopService;


  public ShopController(ShopService shopService) {
    this.shopService = shopService;
  }

  @PostMapping("")
  public void  selectItem(@RequestBody ShopDTO shopDTO){
    shopService.insertItem(shopDTO);
    System.out.println("주입완");
  }


  @GetMapping("")
  public List<ShopDTO> selectItem(){
    System.out.println("조회완.");
    return shopService.selectItem();
  }

  @GetMapping("/{itemCode}")
  public ShopDTO byNum(@PathVariable int itemCode){
    System.out.println("조회완.");
    return shopService.byNum(itemCode);
  }


  @DeleteMapping("/{itemCode}")
  public int  deleteItem(@PathVariable("itemCode") int itemCode){
    shopService.deleteByNum(itemCode);
   return itemCode;
  }

  /// REST가 나오기 전
  @PostMapping("/update")
  public void updateItem(@RequestBody ShopDTO shopDTO){
    shopService.updateByNum(shopDTO);
  }


  @PutMapping("/{itemCode}")
public  void  updateByNum(@PathVariable("itemCode") int itemCode, @RequestBody ShopDTO shopDTO){
    shopDTO.setItemCode(itemCode);
    shopService.updateByNum(shopDTO);
  }

}
