import React, { useState } from "react";

const RadioBox = () => {
  const [feel, setFeel] = useState();
  function changeFeel(e) {
    setFeel(e.target.value);
  }

  return (
    <>
      <div>라디오 박스</div>
      <input
        type="radio"
        value={"sad"}
        onChange={changeFeel}
        checked={feel === "sad"}
      />
      슬픔
      <input
        type="radio"
        value={"happy"}
        onChange={changeFeel}
        checked={feel === "happy"}
      />
      기쁨
      <input
        type="radio"
        value={"soso"}
        onChange={changeFeel}
        checked={feel === "soso"}
      />
      보통
      <div>현재 기분 : {feel}</div>
    </>
  );
};

export default RadioBox;
