import axios from "axios";
import React, { useEffect, useState } from "react";
import styles from "./Boardmain.module.css";
import { useNavigate, useParams } from "react-router-dom";
import dayjs from "dayjs";

const BoardMain = () => {
  const [boardList, setList] = useState([]);
  const [search, setSearch] = useState({});
  const [select, setSelect] = useState("title");
  const nav = useNavigate();
  const param = useParams;

  /// 셀렉트 박스 바뀌는 값 받을 함수
  function onChangeSelect(e) {
    setSelect(e.target.value);
    console.log(e.target.value);
  }

  /// 검색 내용 받을 함수
  function onChangeSearch(e) {
    setSearch({
      ...search,
      [e.target.name]: e.target.value,
    });
    console.log(search);
  }

  /// 정보 받아오는 axios
  useEffect(() => {
    axios
      .get("/api/boards")
      .then((res) => {
        console.log("접속완료");
        setList(res.data);
      })
      .catch();
  }, []);

  
  return (
    <>
      <div className={[styles.main].join(" ")}>
        <div>
          <h1>자유게시판</h1>
        </div>

        <div className={styles.selBox}>
          <select name="setData" value={select} onChange={onChangeSelect}>
            <option value="title">제목</option>
            <option value="writer">작성자</option>
          </select>
          <input type="text" name={select} onChange={onChangeSearch} />
          <button
            type="button"
            onClick={() => {
              nav(`/${search.title}/${search.writer}`);
            }}
          >
            검색
          </button>
        </div>

        <table>
          <colgroup>
          <col width='10%'/>
          <col width='50%'/>
          </colgroup>
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
            {boardList.map((board, i) => {
              return (
                <tr
                  key={i}
                  onClick={() => {
                    nav(`/${board.boardNum}`);
                  }}
                >
                  <td>{boardList.length - i}</td>
                  <td>{board.title}</td>
                  <td className={styles.smallFont}>{board.writer}</td>
                  <td className={styles.smallFont}>{dayjs(board.regDate).format('YY년 MM월 DD일')}</td>
                  <td className={styles.smallFont}>{board.readCnt}</td>
                </tr>
              );
            })}
          </tbody>
        </table>
        <button
          type="button"
          onClick={(e) => {
            nav("/write");
          }}
        >
          글쓰기
        </button>
      </div>
    </>
  );
};

export default BoardMain;
