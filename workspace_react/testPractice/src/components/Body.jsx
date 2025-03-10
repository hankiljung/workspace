import React from "react";
import image1 from "./blogpost2.jpg";
import "./body.css";
const Body = () => {
  return (
    <>
      <div className="container">
        <img src={image1} className="img1" />
        <div>
          <span>DELICIOUS MEALS</span>
        <span> Lorem, ipsum dolor sit amet consectetur adipisicing elit. Quos, vitae.</span><br />
        
        
          <button type="button">SHOP NOW</button>
        </div>
      </div>
    </>
  );
};

export default Body;
