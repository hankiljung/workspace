import React, { useState } from "react";

const Input_04 = () => {
  const [data, setData] = useState({
    name: "",
    tel: "",
    email: "",
    study: "영어",
  });

  function changeData(e) {
    setData({
      ...data,
      [e.target.name]: e.target.value,
    });
  }

  return (
    <>
      이름{" "}
      <input type="text" name="name" value={data.name} onChange={changeData} />
      <br />
      연락처{" "}
      <input type="text" name="tel" value={data.tel} onChange={changeData} />
      <br />
      이메일{" "}
      <input
        type="text"
        name="email"
        value={data.email}
        onChange={changeData}
      />
      <br />
      희망과목
      <select name="study" value={data.study} onChange={changeData}>
        <option value="국어">국어</option>
        <option value="영어">영어</option>
        <option value="수학">수학</option>
      </select>
      <br />
      <div>
        <h3>작성내용</h3>
        <p>이름 : {data.name}</p>
        <p>연락처 : {data.tel}</p>
        <p>이메일 : {data.email}</p>
        <p>희망과목 : {data.study}</p>
      </div>
    </>
  );
};

export default Input_04;
