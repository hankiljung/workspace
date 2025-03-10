import axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";

const MemList = () => {
  const [memList, setList] = useState([]);
  const nav = useNavigate();
  useEffect(() => {
    axios
      .get("/api/mans")
      .then((res) => {
        setList(res.data);
      })
      .catch((error) => {
        console.log(error);
      });
  }, []);

  return (
    <>
      <table>
        <thead>
          <tr>
            <td>No</td>
            <td>회원 이름</td>
            <td>회원 아이디</td>
            <td>회원 암호</td>
            <td>회원 전화번호</td>
            <td>회원 소개</td>
          </tr>
        </thead>
        <tbody>
          {memList.map((mem, i) => {
            return (
              <tr
                key={i}
                onClick={() => {
                  nav(`/${mem.memId}`);
                }}
              >
                <td>{i + 1}</td>
                <td>{mem.memName}</td>
                <td>{mem.memId}</td>
                <td>{mem.memPw}</td>
                <td>{mem.memTel}</td>
                <td>{mem.memIntro}</td>
              </tr>
            );
          })}
        </tbody>
      </table>
    </>
  );
};

export default MemList;
