import React, { useState } from "react";
import "./Test3.css";
const Test3 = () => {
  let [isShow, setAd] = useState(true);
  const [btnTest, SetBt] = useState("광고닫기");

  return (
    <>
      <button
        type="button"
        onClick={() => {
          SetBt(btnTest === "광고닫기" ? "광고보기" : "광고닫기");
          setAd(!isShow);
        }}
      >
        {btnTest}
      </button>

      {isShow ? <div className="ad">오늘 구매하시면 30% SALE</div> : null}
    </>
  );
};

export default Test3;
