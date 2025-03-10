import axios from "axios";
import dayjs from "dayjs";
import React, { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
import styles from "./Boardmain.module.css";

const Detail = () => {
  ///
  const nav = useNavigate();
  const { boardNum } = useParams();
  /// useState 목록
  const [detail, setDetail] = useState({});
  const [cnt, setCnt] = useState(0);
  const [replyList, setReply] = useState([]);
  const [newReply, setNewReply] = useState({
    writer: "",
    content: "",
    boardNum: boardNum,
  });

  // 상세 게시글을 db에서 가져오는 axios
  useEffect(() => {
    axios
      .get(`/api/boards/${boardNum}`)

      .then((res) => {
        setDetail(res.data);
        console.log(detail);
      })
      .catch();
  }, [cnt]);

  // 댓글 db에서 가져오는 axios
  useEffect(() => {
    axios
      .get(`/api/replys/${boardNum}`)

      .then((res) => {
        setReply(res.data);
        console.log(replyList);
      })
      .catch();
  }, [cnt]);

  /// 보드 삭제시 실행될 axios
  function deleteData() {
    if (!confirm("삭제할까요?")) {
      return;
    }
    axios
      .delete(`./api/boards/${detail.boardNum}`)
      .then(() => {})
      .catch(() => {});
  }

  // 댓글 저장시 실행될 axios
  function saveReply() {
    if (newReply.writer === "") {
      alert("작성자는 필수 사항입니다.");
      return;
    }
    if (newReply.content === "") {
      alert("작성자는 필수 사항입니다.");
      return;
    }

    if (!confirm("댓글을 등록하시겠습니까?")) {
      return;
    }
    axios
      .post(`/api/replys`, newReply)
      .then((res) => {
        console.log("등록되었다");
        // nav(`/${boardNum}`)
        console.log(newReply);
        setNewReply({
          ...newReply,
          writer: "",
          content: "",
          boardNum: boardNum,
        });
        setCnt(cnt + 1);
      })
      .catch(() => {});
  }

  function changetReply(e) {
    setNewReply({
      ...newReply,
      [e.target.name]: e.target.value,
    });
    console.log(newReply);
  }

  dayjs().format();

  console.log();

  return (
    <div className={styles.main}>
      <div>
        <h1>{detail.title}</h1>
      </div>

      <table className={styles.table}>
        <tbody>
          <tr>
            <td>작성일</td>
            <td className={styles.smallFont}>
              {dayjs(detail.regDate).format("YY년 MM월 DD일 HH:mm")}
            </td>
            <td>작성자</td>
            <td className={styles.smallFont}>{detail.writer}</td>
            <td>조회수</td>
            <td className={styles.smallFont}>{detail.readCnt}</td>
          </tr>
          <tr>
            <td>제목</td>
            <td colSpan={5}>{detail.title}</td>
          </tr>
          <tr>
            <td>내용</td>
            <td colSpan={5}>{detail.content}</td>
          </tr>
        </tbody>
      </table>

      <div className={styles.replyAndButton}>
        <div className={styles.replyBox}>
          <input
            type="text"
            placeholder=" 작성자"
            name="writer"
            onChange={changetReply}
          />
          <input
            type="text"
            placeholder=" 댓글 내용 입력"
            name="content"
            onChange={changetReply}
          />
          <button
            type="button"
            onClick={(e) => {
              saveReply();
            }}
          >
            댓글 등록
          </button>
        </div>

        <div className={styles.leftFlex}>
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
              deleteData();
              nav("/");
            }}
            className={styles.rlMargin}
          >
            삭제
          </button>

          <button
            type="button"
            onClick={() => {
              nav(`/update/${boardNum}`);
            }}
          >
            수정
          </button>
        </div>
      </div>
      <br />

      {/* 밑에서 부터 댓글 데이터 */}
      {replyList.map((reply, i) => {
        return (
          <div key={i} className={styles.reply}>
            <div>
              <div className={styles.replyKid2}>
                <p className={styles.smallFont}>작성자 : {reply.writer} </p>
                <p className={styles.smallFont}>
                  작성일 : {dayjs(reply.regDate).format("YY년 MM월 DD일")}
                </p>
              </div>

              <div className={styles.replyKid}>
                {reply.content}
                {/* 삭제 버튼 */}
                <button
                  type="button"
                  onClick={(e) => {
                    if (!confirm("삭제할까요?")) {
                      return;
                    }
                    axios
                      .delete(`/api/replys/${reply.replyNum}`)
                      .then((res) => {
                        console.log("댓글을 지웠습니다.");
                        setCnt(cnt + 1);
                      })
                      .catch((error) => {
                        console.log("오류발생");
                      });
                  }}
                >
                  삭제
                </button>
              </div>
              <br />
            </div>
          </div>
        );
      })}
    </div>
  );
};

export default Detail;
