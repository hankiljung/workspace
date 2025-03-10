import React, { useState } from "react";
import "./Test6.css";
const Test6 = () => {
  const [show, setShow] = useState(false);

  return (
    <>
      <div
        className="test7"
        onMouseEnter={(e) => {
          setShow(true);
        }}
        onMouseLeave={(e) => {
          setShow(false);
        }}
      >
        마우스를 올리면 숨겨진 글자가 보여요
      </div>
      {show ? <div className="test7">react</div> : null}
    </>
  );
};

export default Test6;
