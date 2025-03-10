import React, { useState } from "react";

const Person = () => {
  const [person, setPeople] = useState({
    name: "김자바",
    age: 20,
    addr: "울산시",
  });

  return (
    <>
      <div>이름 : {person.name}</div>
      <div>나이 : {person.age}</div>
      <div>주소 : {person.addr}</div>

      <button
        id="aaa"
        className="bbb"
        type="button"
        //이벤트 발생시 실행코드로 작성하는 함수의 매개변수로는
        //이벤트 객체를 전달받을 수 있다.
        //이벤트 객체는 이벤트와 관련된 모든 정보를 개체 형태로 갖고 있다.
        onClick={(e) => {
          console.log(e);

          //e.target 이벤트가 발생한 태그 자체가 나온다.
          console.log(e.target);

          //이벤트가 발생한 태그의 속성값
          console.log(e.target.type);
          console.log(e.target.id);
          console.log(e.target.className);

          setPeople({
            ...person,
            name: "홍길동",
          });
        }}
      >
        이름을 홍길동으로 변경
      </button>
      <button
        type="button"
        onClick={() => {
          setPeople({
            ...person,
            age: 30,
          });
        }}
      >
        나이를 30으로 변경
      </button>
      <button
        type="button"
        onClick={() => {
          setPeople({
            ...person,
            addr: "서울시",
          });
        }}
      >
        주소를 서울시로 변경
      </button>
    </>
  );
};

export default Person;
