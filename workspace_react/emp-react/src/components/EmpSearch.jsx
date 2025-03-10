import axios from "axios";
import React, { useEffect, useState } from "react";

const EmpSearch = () => {
  const [dept, setDept] = useState([]);
  const [data, setData] = useState({
    empName: "",
    deptName: "",
    gender: "",
    hireDateStart: "",
    hireDateEnd: "",
  });
  const [emp, setEmp] = useState([]);
  useEffect(() => {
    /* 부서 받아오는 쿼리 */
    axios
      .get("/api/emps/deptjob")
      .then((res) => setDept(res.data))
      .catch();
  }, []);
  useEffect(() => {
    /* 사원 정보 받아오는 쿼리 */
    axios
      .get("/api/emps/emp")
      .then((res) => {
        setEmp(res.data);
        console.log(emp);
      })
      .catch();
  }, []);
  console.log(emp);

  function searchButton() {
    axios
      .get(
        `/api/emps/emp?empName=${data.empName}&deptName=${data.deptName}&gender=${data.gender}&hireDateStart=${data.hireDateStart}&hireDateEnd=${data.hireDateEnd}`
      )
      .then((res) => setEmp(res.data))
      .catch();
  }

  function searchData(e) {
    setData({
      ...data,
      [e.target.name]: e.target.value,
    });
    console.log(data);
  }
  return (
    <>
      <div>
        <table>
          <tbody>
            <tr>
              <td>사원명</td>
              <td colSpan={5}>
                <input type="text" name="empName" onChange={searchData} />
              </td>
              <td>
                <button type="button" onClick={searchButton}>
                  검색
                </button>
              </td>
            </tr>
            <tr>
              <td>부서</td>
              <td>
                <select
                  name="deptName"
                  value={dept.deptNo}
                  onChange={searchData}
                >
                  <option value="">선택하세요</option>
                  {dept.map((item, i) => {
                    return (
                      <option value={item.deptName} key={i}>
                        {item.deptName}
                      </option>
                    );
                  })}
                </select>
              </td>
              <td>성별</td>
              <td>
                <input
                  type="radio"
                  name="gender"
                  value="male"
                  onChange={searchData}
                />
                남
                <input
                  type="radio"
                  name="gender"
                  value="female"
                  onChange={searchData}
                />
                여
              </td>
              <td>입사일</td>
              <td>
                <input type="date" name="hireDateStart" onChange={searchData} />
              </td>
              <td>
                <input type="date" name="hireDateEnd" onChange={searchData} />
              </td>
            </tr>
          </tbody>
        </table>
        <table>
          <tbody>
            <tr>
              <td>No</td>
              <td>부서명</td>
              <td>직급</td>
              <td>사원명</td>
              <td>성별</td>
              <td>입사일</td>
            </tr>
            {emp.map((item, i) => {
              return (
                <tr key={i}>
                  <td>{i}</td>
                  <td>{item.deptName}</td>
                  <td>{item.jobName}</td>
                  <td>{item.empName}</td>
                  <td>{item.gender}</td>
                  <td>{item.hireDate}</td>
                </tr>
              );
            })}
          </tbody>
        </table>
      </div>
    </>
  );
};

export default EmpSearch;
