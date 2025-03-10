import { useEffect, useState } from "react";
import "./MemberList.css";
import axios from "axios";
import { useNavigate, useParams } from "react-router-dom";

//REACT_MEMBER 테이블에 저장된 모든 회원정보를 조회하여
//MEMBERLIST 컴포넌트에 table 형식으로 표현하세요
//테이블의 컬럼 : No(행번호), 회원id, 회원명, 회원연락처, 가입일

const MemberList = () => {
  const nav = useNavigate();

  const [memList, setList] = useState([]);

  useEffect(() => {
    axios
      .get("/api/reacts")
      .then((res) => {
        setList(res.data);
      })
      .catch((error) => {
        console.log("오류 발생");
      });
  }, []);

  return (
    <>
      <div >게시글 목록 페이지</div>
      <div>
        <table>
          <thead>
            <tr>
              <td>No</td>
              <td>회원id</td>
              <td>회원명</td>
              <td>회원연락처</td>
              <td>회원가입일</td>
            </tr>
          </thead>
          <tbody>
            {memList.map((list, i) => {
              return (
                <tr key={i}>
                  <td>{i + 1}</td>
                  <td
                    onClick={(e) => {
                      nav(`/${list.memId}`);
                    }}
                  >
                    {list.memId}
                  </td>
                  <td>{list.memName}</td>
                  <td>{list.memTel}</td>
                  <td>{list.joinDate}</td>
                </tr>
              );
            })}
          </tbody>
        </table>
        <button
          type="button"
          onClick={(e) => {
            nav("/join");
          }}
        >
          회원가입
        </button>
      </div>
    </>
  );
};

export default MemberList;
