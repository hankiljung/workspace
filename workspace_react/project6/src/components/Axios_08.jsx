import axios from "axios";
import React, { useEffect, useState } from "react";

const Axios_08 = () => {
  const [stu, studentSet] = useState(0);

  const phone = {
    brand: "samsung",
    price: 100000,
    color: "red",
  };

  const student = {
    name: "kim",
    korScore: 80,
    engScore: 80,
    mathScore: 80,
  };

  //아래 코드의 결과 전달되는 데이터를 자바에서 받은 후
  //전달돤 국 영 수 총점을 다시 리액트로 가져와서
  //react 화면에 총점을 보여주세요.
  useEffect(() => {
    axios
      .post("/api/t8", student)
      .then((res) => {
        studentSet(res.data);
      })
      .catch();
  }, []);

  return (
    <>
      <div>총점은 : {stu} 입니다.</div>
    </>
  );
};

export default Axios_08;
