import axios from "axios";
import React, { useEffect, useState } from "react";
import "./Axios_05.css";

const Axios_06 = () => {
  const [btn, btnSet] = useState(true);
  const [btn2, btn2Set] = useState(true);
  const [data, setData] = useState([]);

  const getData = () => {
    axios
      .get("/api/t6")
      .then((res) => {
        setData(res.data);
      })
      .catch((error) => {
        console.log("에러 발생");
      });
  };
  return (
    <>
      <div>
        <table>
          <colgroup>
            <col width={"500px"} />
            <col width={"500px"} />
          </colgroup>
          <tbody>
            <tr>
              <td>
                <button
                  type="button"
                  onClick={() => {
                    getData();
                    btnSet(btn ? false : true);
                  }}
                >
                  버튼
                </button>
                <table>
                  <colgroup>
                    <col width={"1%"} />
                  </colgroup>
                  <thead>
                    <tr>
                      <td>이름</td>
                    </tr>
                  </thead>
                  <tbody>
                    {btn ? (
                      <tr>
                        <td colSpan={3}>
                          버튼1을 클릭하면 데이터가 조회됩니다.
                        </td>
                      </tr>
                    ) : (
                      data.map((stu, i) => {
                        return (
                          <tr key={i}>
                            <td>{stu.name}</td>
                          </tr>
                        );
                      })
                    )}
                  </tbody>
                </table>
              </td>
              <td>
                <button
                  type="button"
                  onClick={() => {
                    getData();
                    btn2Set(btn2 ? false : true);
                  }}
                >
                  버튼
                </button>
                <table>
                  <colgroup>
                    <col width={"1%"} />
                    <col width={"1%"} />
                    <col width={"1%"} />
                    <col width={"1%"} />
                    <col width={"1%"} />
                  </colgroup>
                  <thead>
                    <tr>
                      <td>이름</td>
                      <td>국어 점수</td>
                      <td>영어 점수</td>
                      <td>수학 점수</td>
                      <td>총 점수</td>
                    </tr>
                  </thead>
                  <tbody>
                    {btn2 ? (
                      <tr>
                        <td colSpan={5}>
                          버튼2를 클릭하면 데이터가 조회됩니다.
                        </td>
                      </tr>
                    ) : (
                      data.map((stu, i) => {
                        return (
                          <tr key={i}>
                            <td>{stu.name}</td>
                            <td>{stu.korScore}</td>
                            <td>{stu.engScore}</td>
                            <td>{stu.mathScore}</td>
                            <td>{stu.engScore+stu.mathScore+stu.korScore}</td>
                          </tr>
                        );
                      })
                    )}
                  </tbody>
                </table>
              </td>
            </tr>
          </tbody>
        </table>
      </div>
    </>
  );
};
// {isShow ? <div className="ad">오늘 구매하시면 30% SALE</div> : null}
export default Axios_06;
