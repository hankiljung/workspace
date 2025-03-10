package com.green.rest_test.controller;

import com.green.rest_test.dto.OrderDTO;
import com.green.rest_test.service.RestService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/rests")
public class OrderController {

private RestService restService;

  public OrderController(RestService restService) {
    this.restService = restService;
  }

  ///  모든 주문 정보 조회기능을 제공하는 api
  @GetMapping("")
  public List<OrderDTO> selectAll(){
    List<OrderDTO> list = new ArrayList<>();
    /*int orderNum, String modelName, int price, int num, String id*/
    list.add(new OrderDTO(101, "데님청바지", 15000, 2, "id1"));
    list.add(new OrderDTO(102, "맨투맨 반팔 티셔츠", 10000, 3, "id2"));
    list.add(new OrderDTO(103, "오버핏 니트", 25000, 2, "id3"));
    list.add(new OrderDTO(104, "롱 패딩", 55000, 1, "id4"));
    list.add(new OrderDTO(105, "맨투맨 긴팔 티셔츠", 12000, 3, "id5"));
    restService.selectAll();

    return list;

  }

  ///  하나의주문정보를조회하는기능을제공하는REST API
  @GetMapping("/{orderNum}")
  public void selectOne(int orderNum){
    List<OrderDTO> list = new ArrayList<>();
    System.out.println("하나의주문정보를조회하는기능을제공하는REST API");
    restService.selectOne(orderNum);
  }




  ///  하나의주문정보를등록하는기능을제공하는REST API
  @PostMapping("")
  public void insertInfo(@RequestBody OrderDTO orderDTO){
    System.out.println("하나의주문정보를등록하는기능을제공하는REST API");
    restService.insertInfo(orderDTO);
  }

  ///  하나의주문정보를삭제하는기능을제공하는REST API
  @DeleteMapping("")
  public void  deleteOne(@PathVariable int orderNum){
    System.out.println("하나의주문정보를삭제하는기능을제공하는REST API");
    restService.deleteOne(orderNum);
  }

  /// 하나의주문정보를수정하는기능을제공하는REST API
  @PutMapping("")
  public void updateData(@RequestBody OrderDTO orderDTO){
    System.out.println("하나의주문정보를수정하는기능을제공하는REST API");
    restService.updateData(orderDTO);
  }
}
