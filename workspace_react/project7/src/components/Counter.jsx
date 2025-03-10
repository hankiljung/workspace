import React, { useState } from "react";
import Display from "./Display";
import Controllerjsx from "./Controllerjsx";

const Counter = () => {
  const [cnt, cntSet] = useState(0);
  return (
    <>
      <h2>Simple Counter</h2>
      <Display cnt={cnt} />
      <Controllerjsx cnt={cnt} cntSet={cntSet} />
    </>
  );
};

export default Counter;
