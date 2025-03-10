import { Link, Links, Route, Routes, useNavigate } from "react-router-dom";
import "./App.css";
import Header from "./components/Header";
import Login from "./components/Login";
import BoardLIst from "./components/BoardLIst";
import BoardDetail from "./components/BoardDetail";

function App() {
  ///useNavigate() hook은 페이지 이동 기능을 제공하는 함수를 리턴
  const nav = useNavigate();

  return (
    <>
      <Header />

      <Routes>
        {/* 게시글 목록 페이지 */}
        <Route path="*" element={<BoardLIst />} />

        {/* 게시글 상세 페이지 */}
        <Route path="/detail/:num/:age" element={<BoardDetail />} />

        {/* 게시글 등록 페이지 */}

        {/* 게시글 수정 페이지 */}

        {/* 로그인 페이지 */}
        <Route path="/login" element={<Login />} />
        {/* 마이페이지 */}
        <Route path="my-page" element={<div>마이페이지입니다.</div>} />
      </Routes>

      {/* 버튼 클릭시 페이지 이동 */}
      <div>
        <button
          type="button"
          onClick={(e) => {
            nav("my-page");
          }}
        >
          마이페이지로 이동
        </button>
      </div>
    </>
  );
}

export default App;
