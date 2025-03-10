import React from "react";

const OrderDetail = ({ detail }) => {
  console.log(detail);
  return (
    <>
      <div className="container-detail">
        <table>
          <colgroup>
            <col width={"20%"} />
            <col width={"20%"} />
            <col width={"20%"} />
            <col width={"20%"} />
          </colgroup>
          <tbody>
            <tr>
              <td>상품번호</td>
              <td>{detail.orderNum}</td>
              <td>상품명</td>
              <td>{detail.modelName}</td>
            </tr>
            <tr>
              <td>가격</td>
              <td>{detail.price}</td>
              <td>수량</td>
              <td>{detail.num}</td>
            </tr>
            <tr>
              <td>주문자ID</td>
              <td>{detail.id}</td>
              <td>구매금액</td>
              <td>{detail.totalPrice}</td>
            </tr>
          </tbody>
        </table>
      </div>
    </>
  );
};

export default OrderDetail;
