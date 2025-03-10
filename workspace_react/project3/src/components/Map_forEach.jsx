import React from "react";

const Map_forEach = () => {
  const arr = [1, 3, 5];
  function aaa() {
    console.log(3);
  }
  for (let i = 0; i < arr.length /*aarr[i] = a  ,i = b */; i++) {}

  arr.forEach((item, index) => {
    console.log(`item = ${item}, index = ${index}`);
  });

  const result = arr.map((e, i) => {
    console.log(`e= ${e}, i=${i}`);
    return e * 2;
  });
  //map은 리턴받아올 수 있고, forEach는 값을 출력하고 끝 void
  console.log(result);

  return (
    <>
      {/* 반복문 : for, for of, foreach(), map() */}
      <div>Map For each</div>
    </>
  );
};

export default Map_forEach;
