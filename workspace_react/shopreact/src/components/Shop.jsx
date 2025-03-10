import axios from "axios";
import React, { useEffect, useState } from "react";

const Shop = () => {
  const [item, setItem] = useState({});



  function changeData(e) {
    setItem({ ...item, [e.target.name]: e.target.value });
    console.log(item);
  }
  function sendData() {
    axios
      .post("./api/shops", item)
      .then((res) => {
        console.log("성공");
      })
      .catch((error) => {
        console.log("실패",error.response.data);
      });
  }
  return (
    <>
      <div>
        제품명 <input type="text" name="itemName" onChange={changeData} />
      </div>
      <div>
        제품가격 <input type="text" name="itemPrice" onChange={changeData} />
      </div>
      <div>
        제품설명 <input type="text" name="itemIntro" onChange={changeData} />
      </div>
      <button type="button" onClick={sendData}>
        저장
      </button>
    </>
  );
};

export default Shop;
