import React, { useState } from "react";

const Test02 = () => {
  const [data, setData] = useState({
    name: "",
    email: "",
    password: "",
    major: "select",
    gender: "male",
    intro: "",
  });

  function changeData(e) {
    setData({
      ...data,
      [e.target.name]: e.target.value,
    });
  }

  return (
    <>
      <div>
        <h2>Test02</h2>
      </div>
      <table>
        <thead></thead>
        <tbody>
          <tr>
            <td>이름</td>
            <td>
              <input
                type="text"
                name="name"
                value={data.name}
                onChange={changeData}
              />
            </td>
          </tr>

          <tr>
            <td>이메일</td>
            <td>
              <input
                type="text"
                name="email"
                value={data.email}
                onChange={changeData}
              />
            </td>
          </tr>

          <tr>
            <td>암호</td>
            <td>
              <input
                type="password"
                name="password"
                value={data.password}
                onChange={changeData}
              />
            </td>
          </tr>

          <tr>
            <td>전공</td>
            <td>
              <select name="major" value={data.select} onChange={changeData}>
                <option value="select">선택하세요</option>
                <option value="art">예술과</option>
                <option value="math">수학과</option>
                <option value="social">사회과</option>
              </select>
            </td>
          </tr>
          <tr>
            <td>성별</td>
            <td>
              <input
                type="radio"
                name="gender"
                value="male"
                onChange={changeData}
                checked={data.gender === "male"}
              />
              남성
              <input
                type="radio"
                name="gender"
                value="female"
                onChange={changeData}
                checked={data.gender === "female"}
              />
              여성
            </td>
          </tr>

          <tr>
            <td>자기 소개</td>
            <td>
              <textarea
                name="intro"
                value={data.intro}
                onChange={changeData}
              ></textarea>
            </td>
          </tr>
        </tbody>
      </table>
      <br />
      <br />
      <div>
        <h3>결과 출력</h3>
      </div>
      <table>
        <thead></thead>
        <tbody>
          <tr>
            <td>이름 : </td>
            <td>{data.name}</td>
          </tr>
          <tr>
            <td>이메일 : </td>
            <td>{data.email}</td>
          </tr>
          <tr>
            <td>암호 : </td>
            <td>{data.password}</td>
          </tr>
          <tr>
            <td>전공 : </td>
            <td>{data.major}</td>
          </tr>
          <tr>
            <td>성별 : </td>
            <td>{data.gender}</td>
          </tr>
          <tr>
            <td>자기 소개 : </td>
            <td>{data.intro}</td>
          </tr>
        </tbody>
      </table>
    </>
  );
};

export default Test02;
