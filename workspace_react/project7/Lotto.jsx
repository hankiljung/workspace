import React from "react";
import "./Lotto.css";
import axios from "axios";
const Lotto = ({ num, numSet }) => {
  function changeNum(e) {
    axios
      .get("api/t10")
      .then((res) => {
        const updatedNum = [...num];
        updatedNum[e.target.name] = res.data;
        numSet(updatedNum);
      })

      .catch((eroor) => {
        console.log("경고");
      });
  }

  return (
    <>
      <div className="main">

        <div className="box">
          
          <div className="lottoNum">
            <h1>{num[0]}</h1>
            <button name="0" type="button" onClick={changeNum}>
              생 성
            </button>
          </div>

          <div className="lottoNum">
            <h1>{num[1]}</h1>
            <button name="1" type="button" onClick={changeNum}>
              생 성
            </button>
          </div>

          <div className="lottoNum">
            <h1>{num[2]}</h1>
            <button name="2" type="button" onClick={changeNum}>
              생 성
            </button>
          </div>

          <div className="lottoNum">
            <h1>{num[3]}</h1>
            <button name="3" type="button" onClick={changeNum}>
              생 성
            </button>
          </div>

          <div className="lottoNum">
            <h1>{num[4]}</h1>
            <button name="4" type="button" onClick={changeNum}>
              생 성
            </button>
          </div>

          <div className="lottoNum">
            <h1>{num[5]}</h1>
            <button name="5" type="button" onClick={changeNum}>
              생 성
            </button>
          </div>

        </div>
      </div>
    </>
  );
};

export default Lotto;
