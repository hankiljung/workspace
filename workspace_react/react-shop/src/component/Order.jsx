import axios from "axios";
import React, { useEffect, useState } from "react";
import styles from "./Header.module.css";

const Order = () => {
  const [itemList, setList] = useState([]);
  const [num, setNum] = useState(null);
  const [order, setOrder] = useState({});
  const [itemprice, setPrice] = useState(null);
  
  
  useEffect(() => {
    axios
      .get("/api/shops")
      .then((res) => {
        setList(res.data);
      })
      .catch((error) => console.log("에러 발생"));
  }, [itemprice]);

  function onChange(e) {
    console.log(num);
    setNum(e.target.value);
    for (let i = 0; i < itemList.length; i++) {
      if (num == itemList[i].itemNum) {
        setPrice(itemList[i].itemPrice);
      }
    }
  }

  function orderChange(e) {
    setOrder({
      ...order,
      [e.target.name]: e.target.value,
      itemNum: num,
      buyPrice: num.itemPrice * order.buyCnt,
    });

    console.log(order);
  }

  function saveOrder(e) {
    axios
      .post("/api/shops/order", order)
      .then((res) => console.log("송신성공"))
      .catch((error) => console.log("오류발생"));
  }
  return (
    <>
      <div className={styles.itemListBox3}>
        <table>
          <tbody>
            <tr>
              <td>주문상품</td>
              <td>
                <select name="optionA" id="" onChange={onChange}>
                  <option value="0">옵션을 선택하세요</option>
                  {itemList.map((item, i) => {
                    return (
                      <option value={item.itemNum} key={i}>
                        {item.itemName}
                      </option>
                    );
                  })}
                </select>
              </td>
            </tr>
            <tr>
              <td>상품단가</td>
              <td>{itemprice}</td>
            </tr>
            <tr>
              <td>상품 수량</td>
              <td>
                <input
                  type="number"
                  name="buyCnt"
                  onChange={orderChange}
                  placeholder="상품수량"
                />
              </td>
            </tr>
            <tr>
              <td>구매자</td>
              <td>
                <input
                  type="text"
                  name="buyer"
                  onChange={orderChange}
                  placeholder="구매자 이름"
                />
              </td>
            </tr>
          </tbody>
        </table>
        <button type="button" onClick={saveOrder}>
          주문하기
        </button>
      </div>
    </>
  );
};

export default Order;
