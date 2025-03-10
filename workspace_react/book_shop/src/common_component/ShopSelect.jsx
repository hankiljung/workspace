import React from "react";

const ShopSelect = ({ children, ...a }) => {
  return <select {...a}>{children}</select>;
};

export default ShopSelect;
