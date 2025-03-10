import React, { useState } from "react";
const Input_02 = () => {
  //입력받을 값과 데이터 변경
  const [person, setPerson] = useState({
    name: "",
    age: "",
    addr: "",
  });

  //간소화 하는 함수
  //key값은 주로 person.name을 사용하지만
  //key값을 person["name"]을 하면 된다. ->key값이 변수일때 이렇게 쓴다
  function setData(e) {
    setPerson({
      ...person,
      [e.target.name]: e.target.value,
    });
  }
  return (
    <>
      이름{" "}
      <input name="name" type="text" value={person.name} onChange={setData} />
      <br />
      나이{" "}
      <input name="age" type="text" value={person.age} onChange={setData} />
      <br />
      주소{" "}
      <input name="addr" type="text" value={person.addr} onChange={setData} />
      <br />
      <div>
        이름 : {person.name}, 나이 :{person.age} , 주소 : {person.addr}
      </div>
    </>
  );
};

export default Input_02;
