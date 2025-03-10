import axios from "axios";
import React from "react";

const Axios_07 = () => {
  //axio post() 함수의 두번째 매개변수
  //자바로 전달할 데이터를 작성할 수 있다.
  //자바로 전달할 데이터는 객체형식으로 지정해야함

  // 1.클래스를 활용하는 방법
  //react에서 전달하는 객체의 key와
  //자바에서 데이터를 받기 위해 매개변수에 선언한 클래스의 변수명이
  //동일하면 데이터를 자동으로 받아옴

  //2.Collection Framework의 Map을 이용
  axios
    .post("/api/t7", {
      name: "kim",
      age: 20,
      addr: "서울시",
    })
    .then((res) => {})
    .catch((error) => {});

  return (
    <>
      <div>axsio를 사용하여 서버에 데이터 전달하기</div>
    </>
  );
};

export default Axios_07;
