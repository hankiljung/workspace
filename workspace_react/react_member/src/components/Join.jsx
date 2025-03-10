import axios from "axios";
import React, { useState } from "react";
import { useNavigate } from "react-router-dom";

const Join = () => {
  const [memInfo, setInfo] = useState({
    memId: "",
  });
  const nav = useNavigate();
  function onChange(e) {
    setInfo({
      ...memInfo,
      [e.target.name]: e.target.value,
    });
  }

  const validateData = () => {
    let isValid = true;
    if (memInfo.memId === "") {
      alert("ID는 필수 입력입니다.");
      isValid = false;
    }
    if (memInfo.memName === "") {
      alert("이름은 필수 입력입니다.");
      isValid = false;
    }
    if (memInfo.memPw !== memInfo.confirmPw) {
      alert("암호가 다릅니다");
      isValid = false;
    }
    return isValid;
  };

  function saveData() {
    if (!validateData()) {
      return;
    }

    axios
      .post("/api/reacts/join", memInfo)
      .then((res) => {
        console.log(res.data);
      })
      .catch();
  }
  return (
    <>
      <div>
        이름 <input type="text" name="memName" onChange={onChange} />
        <br />
        아이디 <input type="text" name="memId" onChange={onChange} />
        <br />
        암호 <input type="password" name="memPw" onChange={onChange} />
        <br />
        암호 확인 <input type="password" name="confirmPw" onChange={onChange} />
        <br />
        자기소개 <input type="text" name="memIntro" onChange={onChange} />
        <br />
        핸드폰 <input type="text" name="memTel" onChange={onChange} />
        <br />
        <button type="button" onClick={saveData}>
          저장
        </button>
        <button
          type="button"
          onClick={() => {
            nav("/");
          }}
        >
          목록으로 가기
        </button>
      </div>
    </>
  );
};

export default Join;
