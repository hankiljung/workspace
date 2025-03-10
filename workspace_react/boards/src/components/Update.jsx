import axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
import styles from "./Boardmain.module.css";
import dayjs from "dayjs";

const Update = () => {
  const nav = useNavigate();
  const [detail, setDetail] = useState({});
  const param = useParams();

  useEffect(() => {
    axios
      .get(`/api/boards/${param.boardNum}`)
      .then((res) => {
        setDetail(res.data);
        console.log(detail);
      })
      .catch();
  }, []);

  function onChange(e) {
    setDetail({
      ...detail,
      [e.target.name]: e.target.value,
    });
    console.log(detail);
  }

  function updateData() {
    axios
      .put(`/api/boards/${param.boardNum}`, detail)
      .then((res) => {
        console.log("성공");
      })
      .catch();
  }

  return (
    <>
      <div className={styles.main}>
        <div>
          <h1>게시글 수정 {detail.title}</h1>
        </div>

        <table>
          <tbody>
            <tr>
              <td>작성일</td>
              <td className={styles.smallFont}>{dayjs(detail.regDate).format('YY년 MM월 DD일')}</td>
              <td>작성자</td>
              <td className={styles.smallFont}>{detail.writer}</td>
            </tr>
            <tr>
              <td>제목</td>
              <td colSpan={5}>
                <input
                  type="text"
                  onChange={onChange}
                  name="title"
                  placeholder="제목 수정"
                  value={detail.title}
                />
              </td>
            </tr>
            <tr>
              <td>내용</td>
              <td colSpan={5}>
                <input
                  type="text"
                  onChange={onChange}
                  name="content"
                  placeholder="내용 수정"
                  value={detail.content}
                />
              </td>
            </tr>
          </tbody>
          <tbody></tbody>
        </table>
        <div>
          <button type="button" onClick={updateData}>
            수정
          </button>
        </div>
      </div>
    </>
  );
};

export default Update;
