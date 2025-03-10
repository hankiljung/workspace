import axios from "axios";
import React, { useEffect, useState } from "react";

const DeptJob = () => {
  const [jobList, setJobList] = useState([]);
  const [newJob, setNewJob] = useState({});
  const [dept, setDept] = useState([]);
  const [newDept, setNewDept] = useState({
    deptName: "",
  });
  const [cnt, setCnt] = useState(0);

  useEffect(() => {
    /* 부서 받아오는 쿼리 */
    axios
      .get("/api/emps/deptjob")
      .then((res) => setDept(res.data))
      .catch();
  }, [cnt]);

  /* 부서 받아오는 함수 */
  function setDeptData(e) {
    setNewDept({
      ...newDept,
      [e.target.name]: e.target.value,
    });
    console.log(newDept);
  }

  /* 부서를 저장하는 axios */
  function saveDept() {
    if (newDept.deptName === "") {
      /* 데이터가 빈값일때 */
      alert("부서를 입력하세요");
      setCnt(cnt + 1);
      return;
    }
    ///
    for (let i = 0; i < dept.length; i++) {
      /* 데이터가 겹칠때 */
      if (newDept.deptName === dept[i].deptName) {
        alert("부서가 이미 존재합니다");
        return;
      }
    }
    ///
    axios.post("/api/emps/deptjob", newDept);
  }

  /* 부서를 삭제하는 axios */
  function deleteDept(a) {
    if (!confirm("삭제하시겠습니까?")) {
      return;
    }
    setCnt(cnt + 1);
    console.log(cnt);
    console.log(a);
    ///
    axios.delete(`/api/emps/${a}`);
  }
  ///
  /* 여기서 부터 직급  */
  ///
  useEffect(() => {
    /* 직급 받아오는 쿼리 */
    axios
      .get("/api/emps/job")
      .then((res) => setJobList(res.data))
      .catch();
  }, [cnt]);

  function setJobData(e) {
    /* 직급을 받아오는 함수 */
    setNewJob({
      ...newJob,
      [e.target.name]: e.target.value,
    });
    console.log(newJob);
  }

  /* 직급를 저장하는 axios */
  function saveJob() {
    if (newJob.jobName === "") {
      /* 데이터가 빈값일때 */
      alert("직급 입력하세요");
      setCnt(cnt + 1);
      return;
    }
    ///
    for (let i = 0; i < jobList.length; i++) {
      /* 데이터가 겹칠때 */
      if (newJob.jobName === jobList[i].jobName) {
        alert("직급이 이미 존재합니다");
        return;
      }
    }
    ///
    axios.post("/api/emps/job", newJob);
  }

  /* 직급을 삭제하는 axios */
  function deleteJob(a) {
    if (!confirm("삭제하시겠습니까?")) {
      return;
    }
    setCnt(cnt + 1);
    console.log(a);
    ///
    axios.delete(`/api/emps/job/${a}`);
  }

  return (
    <>
      <div>
        <div>
          {/* 부서 등록 */}
          <div>
            <span>부서 등록</span>
            <input
              type="text"
              placeholder="등록할 부서명을 입력하세요"
              onChange={setDeptData}
              name="deptName"
            />
            <button
              type="button"
              onClick={(e) => {
                saveDept();
                setCnt(cnt + 1);
              }}
            >
              등록
            </button>
          </div>

          {/* 부서 목록 */}
          <div>부서 목록</div>
          <table>
            {/* 표 대가리 */}
            <thead>
              <tr>
                <td>No</td>
                <td>부서코드</td>
                <td>부서명</td>
                <td>삭제</td>
              </tr>
            </thead>

            {/* 표 몸통 */}
            <tbody>
              {dept.map((item, i) => {
                return (
                  <tr key={i}>
                    <td>{dept.length - i}</td>
                    <td>{item.deptNo}</td>
                    <td>{item.deptName}</td>
                    <td>
                      <button
                        type="button"
                        onClick={() => {
                          setCnt(cnt + 1);
                          deleteDept(item.deptNo);
                        }}
                      >
                        삭제
                      </button>
                    </td>
                  </tr>
                );
              })}
            </tbody>
          </table>
        </div>

        {/* 여기서부터 직급 */}
        <div>
          {/* 직급 등록 */}
          <div>
            <span>직급 등록</span>
            <input
              type="text"
              placeholder="등록할 직급명을 입력하세요"
              onChange={setJobData}
              name="jobName"
            />
            <button
              type="button"
              onClick={(e) => {
                saveJob();
                setCnt(cnt + 1);
              }}
            >
              등록
            </button>
          </div>

          {/* 직급 목록 */}
          <div>직급 목록</div>
          <table>
            {/* 표 대가리 */}
            <thead>
              <tr>
                <td>No</td>
                <td>직급코드</td>
                <td>직급명</td>
                <td>삭제</td>
              </tr>
            </thead>

            {/* 표 몸통 */}
            <tbody>
              {jobList.map((item, i) => {
                return (
                  <tr key={i}>
                    <td>{jobList.length - i}</td>
                    <td>{item.jobNo}</td>
                    <td>{item.jobName}</td>
                    <td>
                      <button
                        type="button"
                        onClick={() => {
                          deleteJob(item.jobNo);
                          setCnt(cnt + 1);
                        }}
                      >
                        삭제
                      </button>
                    </td>
                  </tr>
                );
              })}
            </tbody>
          </table>
        </div>
      </div>
    </>
  );
};

export default DeptJob;
