import axios from "axios";
import React, { useEffect, useState } from "react";

const Axios_01 = () => {
  //서버에서 받는 데이터를 저장할 state 변수
  const [data, setData] = useState(0);

  //마운트 될때만 서버에서 데이터를 받기 위해 useEffect 사용
  useEffect(() => {
    axios
      //서버에서 데이터 받기
      //get 안에는 데이터를 요청할 url작성
      .get("/api/t2")

      //통신성공 후 실행 내용 작성
      //res는 통신 성공에 대한 모든 정보가 담겨있는 객체
      .then((res) => {
        setData(res.data);
      })

      //통신성공 후 실행 내용 작성
      //error는 통신 실패에 대한 모든 정보가 담겨있는 객체
      .catch((error) => {});
  }, []);

  return (
    <>
      <div>
        <h3>데이터 받기1</h3>
        <div>받은 데이터는 : {data}</div>
      </div>
    </>
  );
};

export default Axios_01;
