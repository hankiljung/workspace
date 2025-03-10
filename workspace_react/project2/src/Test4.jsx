import React, { useState } from "react";
import "./Test4.css";

const Test4 = () => {
  let [numArr, setArr] = useState([0, 0, 0]);
  /* 스프레드 연산자를 사용하면 */
  // 배열도 복사가 가능하다 arr2 = [...arr1]

  function changeData(index) {
    numArr[index] = numArr[index] + 1;
    const copyArr = [...numArr];
    setArr(copyArr);
  }

  return (
    <>
      <div>Test4</div>
      <span
        onClick={() => {
          changeData(0);
        }}
      >
        {numArr[0]}
      </span>
      <span
        onClick={() => {
          changeData(1);
        }}
      >
        {numArr[1]}
      </span>
      <span
        onClick={() => {
          changeData(2);
        }}
      >
        {numArr[2]}
      </span>
    </>
  );
};

export default Test4;
