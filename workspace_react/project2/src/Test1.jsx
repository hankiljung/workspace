import "./Test1.css";
import React, { useState } from "react";

//카운터 숫자 데이터를 저장할 state 변수

const Test1 = () => {
  const [cnt, setCnt] = useState("0");

  return (
    <>
      <div className="cnt">{cnt}</div>
      <button
        type="button"
        onClick={
          setCnt(cnt + 1)
        }
      >
        클릭
      </button>
    </>
  );
};

export default Test1;
