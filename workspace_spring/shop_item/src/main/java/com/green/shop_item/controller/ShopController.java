package com.green.shop_item.controller;


import com.green.shop_item.dto.MemDTO;
import com.green.shop_item.dto.OrderDTO;
import com.green.shop_item.dto.SearchDTO;
import com.green.shop_item.dto.ShopItemDTO;
import com.green.shop_item.service.ShopItemService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shops")
public class ShopController {
  ShopItemService shopItemService;

  @Autowired
  public ShopController(ShopItemService shopItemService) {
    this.shopItemService = shopItemService;
  }

  // 아이템 추가 api
  // (post) localhost:8080/shops
  @PostMapping("")
  public void insertItem (@RequestBody ShopItemDTO shopItemDTO){
    shopItemService.insertItem(shopItemDTO);
  }

  // 아이템 리스트 조회 api
  // (get) localhost:8080/shops
  @GetMapping("")
  public List<ShopItemDTO> selectAll(SearchDTO searchDTO){
    System.out.println(searchDTO);
    return shopItemService.selectAll(searchDTO);
  }

  // 번호로 아이템 리스트 조회 api
  // (get) localhost:8080/shops/1
  @GetMapping("/{itemNum}")
  public ShopItemDTO selectByNum(@PathVariable("itemNum") int itemNum){
    return shopItemService.selectByNum(itemNum);
  }

  // 번호로 아이템 정보 업데이트 api
  // (get) localhost:8080/shops/1
  @PutMapping("/{itemNum}")
  public void updateItem (@PathVariable("itemNum") int itemNum, @RequestBody  ShopItemDTO shopItemDTO){
    shopItemDTO.setItemNum(itemNum);
    shopItemService.updateItem(shopItemDTO);
  }

  // 오더 추가 api
  // (get) localhost:8080/shops/order
  @PostMapping("/order")
public void insertOrder(@RequestBody OrderDTO orderDTO){
    shopItemService.insertOrder(orderDTO);
  }

    @GetMapping("/orderlist")
    public List<OrderDTO> selectOrder(){
      return shopItemService.selectOrder();
    }

//  @GetMapping("/test")
//  public void test(@RequestParam("age") int age, @RequestParam("name") String name){
//    System.out.println("age = " + age);
//    System.out.println("name = " + name);
//
//  }

  @GetMapping("/test")
  public void test(MemDTO mem){
    System.out.println(mem);
      }

}









