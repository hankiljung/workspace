import axios from "axios";
import React, { useEffect, useState } from "react";

const OrderList = ({ isShow, setShow, detail, setDetail }) => {
  const [list, setList] = useState([]);
  useEffect(() => {
    axios
      .get("/api/rests")
      .then((res) => {
        setList(res.data);
        console.log("성공");
      })
      .catch((error) => {
        console.log("오류발생");
      });
  }, []);

  function changeShow() {
    detail != null ? setShow(true) : setShow(false);
  }

  return (
    <div className="container-order">
      <table>
        <colgroup>
          <col width={""} />
          <col width={""} />
          <col width={"15%"} />
          <col width={"10%"} />
          <col width={"25%"} />
        </colgroup>
        <thead>
          <tr>
            <td>No</td>
            <td>상품명</td>
            <td>상품가격</td>
            <td>수량</td>
            <td>총구매가격</td>
          </tr>
        </thead>
        <tbody>
          {list.map((shop, i) => {
            return (
              <tr
                key={i}
                onClick={(e) => {
                  for (let i = 0; i < list.length; i++) {
                    if (shop.orderNum == list[i].orderNum) {
                      setDetail(list[i]);
                      changeShow();

                      console.log(isShow);
                      console.log(detail);
                    }
                  }
                }}
              >
                <td>{list.length - i}</td>
                <td>{shop.modelName}</td>
                <td>{shop.price}</td>
                <td>{shop.num}</td>
                <td>{shop.totalPrice}</td>
              </tr>
            );
          })}
        </tbody>
      </table>
    </div>
  );
};

export default OrderList;
