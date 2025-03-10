import React from "react";
import { useParams } from "react-router-dom";

// 해당 컴포넌트가 실행될 대, num이라는 이름으로 데이터가 전달된다.
// URL parameter로 전달되는 데이터를 받을 때는 useParams() 훅을 사용하여 받는다
// useParams() 훅은 URL Parameter로 전달되는 데이터를 객체 형식으로 리턴시켜준다

const BoardDetail = () => {
  const { num, age } = useParams();
  return (
    <>
      <div>게시글 상세페이지</div>
      <div>num 데이터 {num}</div>
      <div>num 에이지 {age}</div>
    </>
  );
};

export default BoardDetail;
