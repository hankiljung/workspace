import React, { useState } from "react";
import "./Test2.css";

const Test2 = () => {
  let [light, onSet] = useState("on");

  function onOff() {
    if (light === "off") {
      return "on";
    } else {
      return "off";
    }
  }

  return (
    <>
      <div className="box1">{light}</div>
      <button
        type="button"
        onClick={() => {
          onSet(onOff());
        }}
      >
        {light}
      </button>
    </>
  );
};

export default Test2;
