import React, { useState } from "react";

const SelectBox = () => {
  const [fruit, setFruit] = useState("000");
  const fruitList = ["사과", "바나나", "오렌지"];
  function changeFruit(e) {
    setFruit(e.target.value);
  }
  /* state 변수의 초기값 = */
  /* 초기값은 여러 option들 중에 최초로 화면에 표현한 값으로 지정 */

  return (
    <>
      <div>
        <select value={fruit} onChange={changeFruit}>
          <option value="000">선택하세요</option>
        </select>
      </div>
      <div>입력 받은 값 : {fruit}</div>
    </>
  );
};

export default SelectBox;
