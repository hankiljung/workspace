import { Route, Routes } from "react-router-dom";
import "./App.css";
import UserLayout from "./components/UserLayout";
import AdminLayout from "./components/AdminLayout";
import ItemForm from "./components/ItemForm";
import Catemanager from "./components/Catemanager";
import Join from "./components/Join";
import Login from "./components/Login";

function App() {
  return (
    <div className="container">
      <Routes>
        {/* 유저가 접속하는 페이지 */}
        <Route path="/" element={<UserLayout />}>
          {/* 상품목록 페이지 */}
          <Route path="" element={<div>상품 목록 페이지</div>} />

          {/* 상품 상세 페이지 */}
          <Route path="detail" element={<div>상품 상세 페이지</div>} />

          {/* 로그인 페이지 */}
          <Route path="login" element={<Login />} />

          {/* 회원가입 페이지 */}
          <Route path="join" element={<Join />} />
        </Route>

        {/* 관리자가 접속하는 페이지 */}
        <Route path="/admin" element={<AdminLayout />}>
          {/* 상품등록 */}
          <Route path="reg-item" element={<ItemForm />} />
          {/* 카테고리 관리 */}
          <Route path="cate-mamager" element={<Catemanager />} />
          {/* 회원관리 */}
          <Route path="user-manage" element={<div>회원관리</div>} />
        </Route>
      </Routes>
    </div>
  );
}

export default App;
