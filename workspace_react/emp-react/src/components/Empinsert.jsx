import axios from "axios";
import React, { useEffect, useState } from "react";

const Empinsert = () => {
  const [jobList, setJob] = useState([]);
  const [deptList, setDept] = useState([]);
  const [data, setData] = useState({
    jobNo: "",
    deptNo: "",
    empName: "",
    gender: "",
    hireDate: "",
  });

  useEffect(() => {
    /* 부서 받아오는 api */
    axios
      .get("/api/emps/deptjob")
      .then((res) => setDept(res.data))
      .catch();
  }, []);

  useEffect(() => {
    /* 직급 받아오는 api */
    axios
      .get("/api/emps/job")
      .then((res) => setJob(res.data))
      .catch();
  }, []);

  /* 사원 데이터를 받아오는 함수 */
  function changeData(e) {
    setData({
      ...data,
      [e.target.name]: e.target.value,
    });
    console.log(data);
  }

  /* 직급을 저장하는 함수 */
  function saveData() {
    if (data.deptName === "") {
      /* 데이터가 빈값일때 */
      alert("부서를 선택하세요");
      return;
    }
    if (data.jobName === "") {
      /* 데이터가 빈값일때 */
      alert("직급을 선택하세요");
      return;
    }
    if (data.empName === "") {
      /* 데이터가 빈값일때 */
      alert("이름을 입력하세요");
      return;
    }
    if (data.gender === "") {
      /* 데이터가 빈값일때 */
      alert("성별을 선택하세요");
      return;
    }
    if (data.hireDate === "") {
      /* 데이터가 빈값일때 */
      alert("입사일을 선택하세요");
      return;
    }
    axios
      .post("/api/emps/emp", data)
      .then((res) => console.log("등록 완료"))
      .catch();
  }
  return (
    <>
      <div>
        <table>
          {/* 사원추가 테이블 */}
          <tbody>
            {/*  */}
            {/* 부서 컬럼 */}
            {/*  */}
            <tr>
              <td>소속 부서</td>
              <td>
                <select
                  name="deptNo"
                  value={deptList.deptName}
                  onChange={changeData}
                >
                  <option value="">부서를 선택하세요</option>
                  {deptList.map((item, i) => {
                    return (
                      <option value={item.deptNo} key={i}>
                        {item.deptName}
                      </option>
                    );
                  })}
                </select>
              </td>
            </tr>
            {/*  */}
            {/* 직급 컬럼 */}
            {/*  */}
            <tr>
              <td>직급</td>
              <td>
                <select
                  name="jobNo"
                  value={jobList.jobName}
                  onChange={changeData}
                >
                  <option value="">직급을 선택하세요</option>
                  {jobList.map((item, i) => {
                    return (
                      <option value={item.jobNo} key={i}>
                        {item.jobName}
                      </option>
                    );
                  })}
                </select>
              </td>
            </tr>
            {/*  */}
            {/* 사원명 컬럼 */}
            {/*  */}
            <tr>
              <td>사원명</td>
              <td>
                <input
                  type="text"
                  name="empName"
                  placeholder="사원명"
                  onChange={changeData}
                />
              </td>
            </tr>
            {/*  */}
            {/* 성별 컬럼 */}
            {/*  */}
            <tr>
              <td>성별</td>
              <td>
                <input
                  type="radio"
                  name="gender"
                  value="male"
                  onChange={changeData}
                />
                남
                <input
                  type="radio"
                  name="gender"
                  value="female"
                  onChange={changeData}
                />
                여
              </td>
            </tr>
            {/*  */}
            {/* 입사일 */}
            {/*  */}
            <tr>
              <td>입사일</td>
              <td>
                <input type="date" name="hireDate" onChange={changeData} />
              </td>
            </tr>
          </tbody>
        </table>
        <button type="button" onClick={saveData}>
          등록
        </button>
      </div>
    </>
  );
};

export default Empinsert;
