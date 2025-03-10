import React from "react";
import "./Lotto1.css";
import axios from "axios";
import Lotto2 from "./Lotto2";
const Lotto1 = ({ num, numSet }) => {
  return (
    <>
      <div className="main">
        {num.map((lotto, i) => {
          return <Lotto2 lotto={lotto} numSet={numSet} key={i} i={i} />;
        })}
      </div>
    </>
  );
};

export default Lotto1;
