import React, { useState } from "react";
import "./Login.css";
const Login = () => {
  const [data, setData] = useState({
    name: "",
    tel: "",
    email: "",
    study: "",
  });
  function changeData(e) {
    setData({
      ...data,
      [e.target.name]: e.target.value,
    });
  }
  return (
    <>
      <div className="title">회원가입서</div>
      <div className="text">
        이름
        <input
          type="text"
          name="name"
          value={data.name}
          onChange={changeData}
        />
        <br />
        연락처
        <input type="text" name="tel" value={data.tel} onChange={changeData} />
        <br />
        이메일
        <input
          type="text"
          name="email"
          value={data.email}
          onChange={changeData}
        />
        <br />
        희망과목
        <select name="study" value={data.study} onChange={changeData}>
          <option value="kor">국어</option>
          <option value="math">수학</option>
          <option value="eng">영어</option>
        </select>
      </div>

      <div>작성내용</div>
      <div>이름 : {data.name}</div>
      <div>전화번호 : {data.tel}</div>
      <div>이메일 : {data.email}</div>
      <div>희망과목 : {data.study}</div>
    </>
  );
};

export default Login;
