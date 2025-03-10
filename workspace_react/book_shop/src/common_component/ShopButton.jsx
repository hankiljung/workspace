import React from "react";

const ShopButton = ({ title = "버튼", ...a }) => {
  return (
    <button type="button" {...a}>
      {title}
    </button>
  );
};

export default ShopButton;
