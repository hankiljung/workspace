import React from "react";
import "./Body5.css";
import blogImg1 from "./blogpost1.jpg";
import blogImg2 from "./blogpost2.jpg";
import blogImg3 from "./blogpost3.jpg";
const Body5 = () => {
  return (
    <>
      <div className="boxBox">
        <div className="blogBox">
          <img src={blogImg1} />
          <div className="blackBox">
            <span>SUMMER SANDWICH</span>
            <span className="orange">29 Sep 2004</span>
          </div>
        </div>
        <div className="blogBox">
          <img src={blogImg2} />
          <div className="blackBox">
            <span>SUMMER SANDWICH</span>
            <span className="orange">29 Sep 2004</span>
          </div>
        </div>
        <div className="blogBox">
          <img src={blogImg3} />
          <div className="blackBox">
            <span>SUMMER SANDWICH</span>
            <span className="orange">29 Sep 2004</span>
          </div>
        </div>
      </div>
    </>
  );
};

export default Body5;
