import axios from "axios";
import React from "react";

const Lotto2 = ({lotto,numSet,i}) => {
   function changeNum(i) {
      axios
        .get("/api/t10")
        .then((res) => {
          const newArr = [...num];
          newArr[i] = res.data;
          numSet(newArr);
        })
        .catch((error) => {});
    }
  return (
    <div className="box" >
      <div>
        <h1>{lotto}</h1>
      </div>
      <button type="button" onClick={changeNum(i)}>
        생성
      </button>
    </div>
  );
};

export default Lotto2;
