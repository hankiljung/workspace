import React, { useState } from "react";

function StateTest() {
  console.log(3);
  /* 일반 변수는 바뀌어도 html 안에서 바뀌지 않음 */

  /* useState는 react hook */
  /* useState는 실행 후 두 개의 데이터를 갖는 배열을 리턴 */
  //배열의 첫번째 데이터는 소괄호 안에 작성된 데이터를 리턴
  //배열의 두번째 데이터로 전달되는 것은 함수이다.
  //두번째로 리턴되는 함수는 변수의 값을 변경하는 기능을 가진 함수이다.
  //리렌더링이 되면서 변수의 값을 그대로 유지된다.

  let [hobby, setHobby] = useState("잠자기");

  return (
    <>
      <div>{hobby}</div>
      <button
        type="button"
        onClick={() => {
          setHobby("밥먹기");
        }}
      >
        취미변경
      </button>
    </>
  );
}

export default StateTest;
