import React from "react";

const ShopInput = ({ type = "text", ...a }) => {
  return <input type={type} {...a} />;
};

export default ShopInput;
