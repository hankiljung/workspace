import { Route, Routes } from "react-router-dom";
import "./App.css";
import ItemList from "./component/ItemList";
import Header from "./component/Header";
import { useState } from "react";
import ItemAdd from "./component/ItemAdd";
import ItemDetail from "./component/ItemDetail";
import Order from "./component/Order";
import QueryString from "./component/QueryString";
import OrderList from "./component/OrderList";

function App() {
  return (
    <>
      {/* 헤더 */}
      <Header />

      <Routes>
        {/* 상품정보 페이지 */}
        <Route path="" element={<ItemList />} />

        {/* 상품등록 페이지 */}
        <Route path="/itemadd" element={<ItemAdd />} />

        {/* 상품주문 페이지 */}
        <Route path="/order" element={<Order />} />

        {/* 주문조회 페이지 */}
        <Route path="/orderList" element={<OrderList />} />
        <Route path="/test" element={<QueryString />} />
      </Routes>
    </>
  );
}

export default App;
