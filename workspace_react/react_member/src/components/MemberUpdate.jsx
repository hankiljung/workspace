import axios from "axios";
import React, { use, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";

const MemberUpdate = () => {
  const param = useParams();
  const nav = useNavigate();
  const [memData, setMem] = useState({
    memName: "",
    memPw: "",
    memIntro: "",
    memTel: "",
  });

  const id = useParams();

  //데이터 유효성 검사(validation 처리)
  function onChange(e) {
    setMem({
      ...memData,
      [e.target.name]: e.target.value,
    });
    console.log(memData);
  }

  const validateData = () => {
    let isValid = true;

    if (memData.memName === "") {
      alert("이름은 필수 입력입니다.");
      isValid = false;
    }
    if (memData.memPw === "") {
      alert("암호 필수 입력입니다.");
      isValid = false;
    }

    if (memData.memTel === "") {
      alert("전화번호는 필수 입력입니다.");
      isValid = false;
    }

    return isValid;
  };
  function updateData(e) {
    if (!validateData()) {
      return;
    }
    axios
      .put(`/api/reacts/update/${id.id}`, memData)
      .then((res) => {
        console.log("업데이트 완료");
      })
      .catch((error) => {
        console.log(error);
      });
  }

  return (
    <>
      <div>
        <table>
          <thead>
            <tr>
              <td>회원 이름</td>
              <td>회원 암호</td>
              <td>회원 소개</td>
              <td>전화 번호</td>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td>
                이름 <input type="text" name="memName" onChange={onChange} />
              </td>

              <td>
                암호 <input type="password" name="memPw" onChange={onChange} />
              </td>
              <td>
                자기소개{" "}
                <input type="text" name="memIntro" onChange={onChange} />
              </td>
              <td>
                {" "}
                핸드폰 <input type="text" name="memTel" onChange={onChange} />
              </td>
            </tr>
          </tbody>
        </table>
        <button
          type="button"
          onClick={(e) => {
            nav(`/${param.id}`);
          }}
        >
          메뉴로
        </button>
        <button type="button" onClick={updateData}>
          수정하기
        </button>
      </div>
    </>
  );
};

export default MemberUpdate;
