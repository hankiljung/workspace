import React, { useEffect, useState } from "react";
import "./Join.css";
import ShopInput from "../common_component/ShopInput";
import { insertUser } from "../apis/userApi.js";
const Join = () => {
  const [user, setUser] = useState({
    userId: "",
    userPw: "",
    userName: "",
    userEmail: "",
    email1: "",
    email2: "",
    userTel: "",
    tel1: "",
    tel2: "",
    tel3: "",
  });

  useEffect(() => {
    setUser({
      ...user,
      userEmail: user.email1 + user.email2,
    });
  }, [user.email1, user.email2]);

  useEffect(() => {
    setUser({
      ...user,
      userTel: [user.tel1, user.tel2, user.tel3].join("-"),
    });
  }, [user.tel1, user.tel2, user.tel3]);

  const changeData = (e) => {
    setUser({
      ...user,
      [e.target.name]: e.target.value,
    });
  };

  const saveData = () => {
    insertUser(user)
      .then((res) => console.log("저장 완료"))
      .catch();
  };

  return (
    <>
      <div className="mainContainer">
        <div>
          <span>아이디</span>
          <ShopInput name="userId" onChange={changeData} />
        </div>
        <div>
          <span>비밀번호</span>
          <ShopInput name="userPw" type="password" onChange={changeData} />
        </div>
        <div>
          <span>이름</span>
          <ShopInput name="userName" onChange={changeData} />
        </div>
        <div>
          <span>이메일</span>
          <div>
            <ShopInput
              name="email1"
              value={user.email1}
              onChange={changeData}
            />

            <select name="email2" onChange={changeData}>
              <option value="">선택하세요</option>
              <option value="@naver.com">@naver.com</option>
              <option value="@gmail.com">@gmail.com</option>
            </select>
          </div>
        </div>
        <div>
          <span>연락처</span>
          <div>
            <input
              type="text"
              name="tel1"
              value={user.tel1}
              onChange={changeData}
            />
            <input
              type="text"
              name="tel2"
              value={user.tel2}
              onChange={changeData}
            />
            <input
              type="text"
              name="tel3"
              value={user.tel3}
              onChange={changeData}
            />
          </div>
          <button type="button" onClick={saveData}>
            저장
          </button>
        </div>
      </div>
    </>
  );
};

export default Join;
