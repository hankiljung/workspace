import axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";

const Detail2 = () => {
  const nav = useNavigate();
  const [detail, setDetail] = useState([]);
  const param = useParams();
  console.log(param);

  useEffect(() => {
    axios
      .get(`/api/boards/${param.title}/${param.writer}`)

      .then((res) => {
        setDetail(res.data);
        console.log("통신성공");
      })
      .catch();
  }, []);

  

  return (
    <>
      <div className="main">
        <div>
          <h1>자유게시판</h1>
        </div>
        <table>
          <thead>
            <tr>
              <td>No</td>
              <td>제목</td>
              <td>작성자</td>
              <td>작성일</td>
              <td>조회수</td>
            </tr>
          </thead>
          <tbody>
            {detail.map((board, i) => {
              return (
                <tr key={i}>
                  <td>{board.boardNum}</td>
                  <td>{board.title}</td>
                  <td>{board.writer}</td>
                  <td>{board.regDate}</td>
                  <td>{board.readCnt}</td>
                </tr>
              );
            })}
          </tbody>
        </table>

        <div>
          <button
            type="button"
            onClick={() => {
              nav("/");
            }}
          >
            목록가기
          </button>
          <button
            type="button"
            onClick={() => {
              nav("/delete/");
            }}
          >
            삭제
          </button>
          <button
            type="button"
            onClick={() => {
              nav(`/update/${param.boardNum}`);
            }}
          >
            수정
          </button>
        </div>
      </div>
    </>
  );
};

export default Detail2;
