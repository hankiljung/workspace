import React, { useState } from "react";
import OrderList from "./OrderList";
import OrderDetail from "./OrderDetail";
import "./OrderInfo.css"

const OrderInfo = () => {
  const[detail,setDetail]=useState({});
  const[isShow,setShow]=useState(false);

  return (
    <>
      <OrderList detail={detail} setDetail={setDetail}
      setShow={setShow}
      isShow={isShow}/>
      { isShow ? <OrderDetail detail={detail}/> : null }
      
    </>
  );
};

export default OrderInfo;
