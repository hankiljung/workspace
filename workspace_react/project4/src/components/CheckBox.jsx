import React, { useState } from "react";

const CheckBox = () => {
  const fruitList = ["사과", "바나나", "오렌지"];
  const [check, setCheck] = useState();
  function checkAll(e) {
    setCheck(e.target.checked ? fruitList : []);
  }
  function checkItem(e) {
    setCheck([...check, e.target.value]);
  }
  return (
    <>
      <div></div>
    </>
  );
};

export default CheckBox;
