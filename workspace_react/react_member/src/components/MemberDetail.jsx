import axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";

const MemberDetail = () => {
  const nav = useNavigate();
  const id = useParams();
  const [memData, setMem] = useState({});

  useEffect(() => {
    axios
      .get(`/api/reacts/${id.id}`)
      .then((res) => {
        setMem(res.data);
      })
      .catch(() => {
        console.log("오류 발생");
      });
  }, []);
  return (
    <>
      <div>
        <table>
          <thead>
            <tr>
              <td>회원 아이디</td>
              <td>회원 이름</td>
              <td>회원 암호</td>
              <td>전화 번호</td>
              <td>회원 소개</td>
              <td>회원 가입일</td>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td>{memData.memId}</td>
              <td>{memData.memName}</td>
              <td>{memData.memPw}</td>
              <td>{memData.memTel}</td>
              <td>{memData.memIntro}</td>
              <td>{memData.joinDate}</td>
            </tr>
          </tbody>
        </table>
        <button
          onClick={(e) => {
            nav("/");
          }}
        >
          목록으로 가기
        </button>
        <button
          type="button"
          onClick={() => {
            nav(`/update/${id.id}`);
          }}
        >
          회원 수정
        </button>
        <button
          type="button"
          onClick={() => {
            ///confirm은 확인을 누르면 true
            ///confirm은 취소를 누르면 false

            if (!confirm("정말 삭제할까요?")) {
              return;
            }
            
            axios
              .delete(`/api/reacts/${memData.memId}`)
              .then((res) => {
                console.log(res.data);
                console.log("삭제완료");
              })
              .catch((error) => {
                console.log(error.data);
                console.log("에러발생");
              });
            nav("/");
          }}
        >
          선택 삭제
        </button>
      </div>
    </>
  );
};

export default MemberDetail;
