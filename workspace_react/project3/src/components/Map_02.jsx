import React from "react";

const Map_02 = () => {
  const arr2 = ["짜장면", "짬뽕", "탕수육"];

  return (
    <>
      <ul>
        {arr2.map((food, i) => {
          return (
            <li key={i}>{food}</li>
          )
        })}
      </ul>
    </>
  );
};

export default Map_02;
