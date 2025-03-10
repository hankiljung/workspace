import React, { useEffect } from "react";

const Header = ({ name, age, hobby }) => {
  console.log(name);
  console.log(age);
  console.log(hobby);
  //객체,배열은 구조분해할당이 된다. 객체의 구조분해할당시 key값이 동일해야한다.

  return (
    <>
      <div>Header</div>
    </>
  );
};

export default Header;
