import axios from "axios";
import React, { useEffect, useState } from "react";

const OrderLIst = () => {
  const [data, setData] = useState([]);

  useEffect(() => {
    axios
      .get("/api/t12")
      .then((res) => {
        console.log("성공");
        setData(res.data);
      })
      .catch((error) => {
        console.log("에러 발생");
      });
  }, []);

  return (
    <>
      <div>
        <table>
          <thead>
            <tr>
              <td>NO</td>
              <td>상품명</td>
              <td>상품가격</td>
              <td>수량</td>
              <td>총구매가격</td>
            </tr>
          </thead>
          <tbody>
            {data.map((list, i) => {
              return (
                <tr key={i}>
                  <td>{data.length - i}</td>
                  <td>{list.model}</td>
                  <td>{list.price}</td>
                  <td>{list.num}</td>
                  <td>{list.totalPrice}</td>
                </tr>
              );
            })}
          </tbody>
        </table>
      </div>
    </>
  );
};

export default OrderLIst;
