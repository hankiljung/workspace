import React, { useState } from "react";
import "./RadioInput.css";

const RadioInput = () => {
  const [data, setData] = useState("sad");

  function changeData(e) {
    setData(e.target.value);
  }
  return (
    <>
      <h1>Radio Input</h1>

      <div className="bb">
        <span>
          <input
            name="feel"
            type="radio"
            value="happy"
            onChange={changeData}
            checked={data === "happy"}
          />
          좋다
        </span>
        <span>
          <input
            name="feel"
            type="radio"
            value="sad"
            onChange={changeData}
            checked={data === "sad"}
          />
          슬프다
        </span>
        <span>
          <input
            name="feel"
            type="radio"
            value="fucking"
            onChange={changeData}
            checked={data === "fucking"}
          />
          나이스
        </span>
      </div>

      <div className="cc">기분은 : 아주 {data}입니다.</div>
    </>
  );
};

export default RadioInput;
