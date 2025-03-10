import axios from "axios";
import React, { useState } from "react";
import "./Write.css";
import { useNavigate } from "react-router-dom";

const Write = () => {
  const [board, setboard] = useState({
    title: "",
    writer: "",
  });
  const nav = useNavigate();

  function changeData(e) {
    setboard({
      ...board,
      [e.target.name]: e.target.value,
    });
    console.log(board);
  }

  function validate() {
    let isValid = true;

    if (board.title === "") {
      alert("제목은 필수 입력입니다.");
      isValid = false;
    }
    if (board.writer === "") {
      alert("작성자는 필수 입력입니다.");
      isValid = false;
    }

    return isValid;
  }

  const saveData = () => {
    if (!validate()) {
      return;
    }
    axios
      .post("/api/boards", board)
      .then((res) => {
        console.log("입력완료");
        alert("등록완료");
      })
      .catch((error) => {
        console.log("에러발생");
      });
  };

  return (
    <>
      <div className="writeBox">
        <table>
          <tbody>
            <tr>
              <td>제목</td>
              <td>
                <input type="text" name="title" onChange={changeData} />
              </td>
            </tr>
            <tr>
              <td>작성자</td>
              <td>
                <input type="text" name="writer" onChange={changeData} />
              </td>
            </tr>
            <tr>
              <td>내용</td>
              <td>
                <textarea
                  cols={20}
                  rows={5}
                  name="content"
                  onChange={changeData}
                ></textarea>
              </td>
            </tr>
          </tbody>
        </table>
        <button
          type="button"
          onClick={() => {
            saveData();
            nav("/write");
          }}
        >
          글등록
        </button>
      </div>
    </>
  );
};

export default Write;
