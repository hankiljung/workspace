import axios from "axios";
import React from "react";
import { useSearchParams } from "react-router-dom";

const QueryString = () => {
  ///쿼리 스트링으로 넘어오는 데이터 받기
  ///배열의 첫번째 인자 : 쿼리 스트링으로 넘어오는 데이터(객체 형식)
  const [params, setParams] = useSearchParams();

  const age = params.get("age");
  const name = params.get("name");
  console.log(age);
  console.log(name);
  function sendData() {
    axios.get(`/api/shops/test?age=${age}&name=${name}`).then().catch();
  }

  return (
    <>
      <div>QueryString 연습</div>
      <button type="button" onClick={sendData}>
        데이터 전송
      </button>
    </>
  );
};

export default QueryString;
