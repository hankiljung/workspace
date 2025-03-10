import React, { useEffect, useState } from "react";
import styles from "./Header.module.css";
import axios from "axios";

const OrderList = () => {
  const [orderList, setOrder] = useState([]);
  useEffect(() => {
    axios
      .get("/api/shops/orderlist")
      .then((res) => setOrder(res.data))
      .catch();
  }, []);
  console.log(orderList);
  return (
    <>
      <div className={styles.itemListBox}>
        <table>
          <colgroup>
            <col width="10%" />
            <col width="30%" />
            <col width="20%" />
            <col width="10%" />
          </colgroup>
          <thead>
            <tr>
              <td>No</td>
              <td>상품명</td>
              <td>구매자</td>
              <td>상품가격</td>
              <td>구매수량</td>
              <td>구매일</td>
            </tr>
          </thead>
          <tbody>
            {orderList.map((order, i) => {
              return (
                <tr key={i}>
                  <td>{order.orderNum}</td>
                  <td>{order.itemName}</td>
                  <td>{order.buyer}</td>
                  <td>{order.buyPrice}</td>
                  <td>{order.buyCnt}</td>
                  <td>{order.buyDate}</td>
                </tr>
              );
            })}
          </tbody>
        </table>
      </div>
    </>
  );
};

export default OrderList;
