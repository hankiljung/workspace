import React from "react";
import { useState } from "react";

const ObjectTest = () => {
  const [monitor, setMonitor] = useState({
    brand: "samsung",
    price: 10000,
    color: "black",
  });

  return (
    <>
      <div>ObjectTest</div>
      브랜드 : {monitor.brand} <br />
      가격 : {monitor.price} <br />
      색상 : {monitor.color} <br />
      <button
        type="button"
        onClick={() => {
          // const copyMonitor = { ...monitor };
          // copyMonitor.brand = "u+";
          // setMonitor(copyMonitor);

          setMonitor({
            ...monitor,
            brand: "LG",
          });
        }}
      >
        버튼
      </button>
    </>
  );
};

export default ObjectTest;
