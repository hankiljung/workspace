import React from "react";
import "./Head.css";


const Head = () => {
  return (
    <>
      <div className="main">

        <div>
          <span>HOME</span>
          <span>ABOUT</span>
          <span>PRODUCT</span>
          <span>CONTACT</span>
        </div>
        
        <div className="input">
          <input type="text" />
          <i className="bi bi-search search"></i>
        </div>
        
      </div>
    </>
  );
};

export default Head;
