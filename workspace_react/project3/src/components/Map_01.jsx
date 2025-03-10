import React from "react";
const arr1 = [1, 2, 3, 4, 5];

const Map_01 = () => {
  return (
    <>
      {arr1.map((num, i) => {
        return <div key={i}>안녕하세요.</div>;
      })}
    </>
  );
};

export default Map_01;
