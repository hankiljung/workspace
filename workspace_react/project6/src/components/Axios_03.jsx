import axios from "axios";
import React, { useState } from "react";

const Axios_03 = () => {
  const [data, setData] = useState({});
  function changeData() {
    axios
      .get("/api/person")
      .then((res) => {
        console.log("통신 성공");
        setData(res.data);
      })
      .catch((error) => {
        console.log("통신 실패");
      });
  }

  //useEffect는 컴포넌트의 특정 생애주기에 기능을 구현할때
  //서버에서 데이터 받을때 오래걸리기 때문에 사용함
  //그림을 다 그린 후 마지막에 실행(*)
  //rerendering을 막아준다

  return (
    <>
      <div className="name">아래 버튼을 눌러 정보를 받으세요</div>
      <input type="button" value={"정보 받기"} onClick={changeData} />
      <br />
      <br />
      <div>이름 : {data.name}</div>
      <div>나이 : {data.age}</div>
      <div>주소 : {data.addr}</div>
    </>
  );
};

export default Axios_03;
