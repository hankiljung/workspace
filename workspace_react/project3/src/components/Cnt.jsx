import React, { useState } from "react";
import "./Cnt.css";

const Cnt = () => {
  const [count, setCount] = useState(0);

  const change = (value) => {
    setCount(count + value);
  };
  return (
    <>
      <div className="title">Simple Counter</div>
      <div className="all">
        <div>현재 카운트 : </div>
        <br />
        <div className="count">{count}</div>
        <br />
      </div>
      <div className="all">
        <button
          type="button"
          onClick={(e) => {
            change(-1);
          }}
        >
          -1
        </button>
        <button
          type="button"
          onClick={(e) => {
            change(-10);
          }}
        >
          -10
        </button>
        <button
          type="button"
          onClick={(e) => {
            change(-100);
          }}
        >
          - 100
        </button>
        <button
          type="button"
          onClick={(e) => {
            change(100);
          }}
        >
          + 100
        </button>
        <button
          type="button"
          onClick={(e) => {
            change(10);
          }}
        >
          + 10
        </button>
        <button
          type="button"
          onClick={(e) => {
            change(1);
          }}
        >
          + 1
        </button>
      </div>
    </>
  );
};

export default Cnt;
