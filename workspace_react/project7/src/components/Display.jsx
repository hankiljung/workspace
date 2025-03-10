import React from "react";

const Display = ({cnt}) => {
  return (
    <>
      <div>현재카운트</div>
      <div>
        <h2>{cnt}</h2>
      </div>
    </>
  );
};

export default Display;
