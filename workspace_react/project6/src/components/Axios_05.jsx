import React, { useEffect, useState } from "react";
import "./Axios_05.css";
import axios from "axios";

const Axios_05 = () => {
  const [stuList, setList] = useState([]);
  const [stuNameList, setNameList] = useState([]);

  // useEffect(() => {
  //   axios
  //     .get("/api/t5")
  //     .then((res) => {
  //       setList(res.data);
  //     })
  //     .catch((error) => {});
  // }, []);

  function changeList() {
    axios
      .get("/api/t5")
      .then((res) => {
        setList(res.data);
      })
      .catch((error) => {});
  }

  function changeNameList() {
    axios
      .get("/api/t5")
      .then((res) => {
        setNameList(res.data);
      })
      .catch((error) => {});
      
  }


  return (
    <>
      <div></div>
      <table className="t1">
        <colgroup>
          <col width={"50%"} />
          <col width={"50%"} />
        </colgroup>
        <tbody>
          <tr>
            <td>
              <button type="button" onClick={changeNameList}>
                버튼1
              </button>
              <table>
                <colgroup>
                  <col width={"1%"} />
                </colgroup>
                <tbody>
                  <tr>
                    <td>사람목록</td>
                  </tr>
                  {stuNameList.map((stu, i) => {
                    return (
                      <tr key={i}>
                        <td>{stu.name}</td>
                      </tr>
                    );
                  })}
                </tbody>
              </table>
            </td>

            <td>
              <button type="button" onClick={changeList}>
                버튼2
              </button>
              <table>
                <colgroup>
                  <col width={"1%"} />
                  <col width={"1%"} />
                  <col width={"1%"} />
                </colgroup>
                <tbody>
                  <tr>
                    <td>국어</td>
                    <td>영어</td>
                    <td>수학</td>
                  </tr>
                  {stuList.map((stu, i) => {
                    return (
                      <tr key={i}>
                        <td>{stu.korScore}</td>
                        <td>{stu.engScore}</td>
                        <td>{stu.mathScore}</td>
                      </tr>
                    );
                  })}
                </tbody>
              </table>
            </td>
          </tr>
        </tbody>
      </table>
    </>
  );
};

export default Axios_05;
