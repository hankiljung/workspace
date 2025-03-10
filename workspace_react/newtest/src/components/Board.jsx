import React, { useState } from "react";
import LIst from "./LIst";
import Detail from "./Detail";
import "./Board.css";

const Board = () => {
  const [detail, setDetail] = useState({});

  // 상세정보가 보일지/안보일지 결정하는 state 변수
  const [show, setShow] = useState(false);

  return (
    <>
      <div className="container">
        <div>
          <h2>게시글 제목</h2>
          <LIst
            detail={detail}
            setDetail={setDetail}
            show={show}
            setShow={setShow}
          />
          {show ? <Detail detail={detail} setDetail={setDetail} /> : null}
        </div>
      </div>
    </>
  );
};

export default Board;
