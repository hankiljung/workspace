import React, { useState } from "react";

const Input_01 = () => {
  {
    /* input 태그 안의 내용을 저장할 state 변수 */
  }

  const [data, setData] = useState("");

  return (
    <>
      <h2>input 태그에 데이터 입력받기</h2>

      <input
        type="text"
        value={data}
        placeholder="이름을 입력하세요"
        onChange={(e) => {
          setData(e.target.value);
        }}
      />

      <div>input 태그에 입력한 내용 : {data}</div>
    </>
  );
};

export default Input_01;
