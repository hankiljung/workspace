import { Link, Route, Routes, useNavigate, useParams } from "react-router-dom";
import "./App.css";
import MemberList from "./components/MemberList";
import Join from "./components/Join";
import { use, useState } from "react";
import MemberDetail from "./components/MemberDetail";
import MemberUpdate from "./components/MemberUpdate";

function App() {
  const [memData, setMem] = useState({});

  return (
    <>
      <div>
        <h1>
          회원 관리 프로그램
        </h1>
        <Routes>
          {/* 회원 목록 페이지 */}
          <Route path="" element={<MemberList />} />

          {/* 회원 상세 페이지 */}
          <Route path="/:id" element={<MemberDetail />} />

          {/* 회원 등록 */}
          <Route path="/join" element={<Join />} />
          <Route
            path="/update/:id"
            element={<MemberUpdate setMem={setMem} memData={memData} />}
          />
        </Routes>
      </div>
    </>
  );
}

export default App;
