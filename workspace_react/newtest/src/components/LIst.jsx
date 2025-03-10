import axios from "axios";
import React, { useEffect, useState } from "react";

const LIst = ({ detail, setDetail, setShow }) => {
  const [list, setList] = useState([]);
  useEffect(() => {
    axios
      .get("/api/t11")
      .then((res) => {
        setList(res.data);
      })
      .catch();
  }, []);



  function changeShow() {
    detail != null ? setShow(true) : setShow(false);
  }
  
  return (
    <>
      <div>
        <table className="list-table">
          <colgroup>
            <col width={"10%"} />
            <col width={"*"} />
            <col width={"20%"} />
            <col width={"20%"} />
          </colgroup>
          <thead>
            <tr>
              <td>No</td>
              <td>제목</td>
              <td>작성자</td>
              <td>조회수</td>
            </tr>
          </thead>
          <tbody>
            {list.map((detail, i) => {
              return (
                <tr key={i}>
                  <td>{(list.num = list.length - i)}</td>
                  <td>
                    <span
                      className="cursor"
                      onClick={() => {
                        for (let i = 0; i < list.length; i++) {
                          if (list[i].num == detail.num) {
                            setDetail((detail = list[i]));
                            changeShow();  
                            //클릭한 제목의 게시글에서 글번호를 찾아야함
                            //반복하면서

                          }
                        }
                      }}
                    >
                      {detail.title}
                    </span>
                  </td>
                  <td>{detail.writer}</td>
                  <td>{detail.readCnt}</td>
                </tr>
              );
            })}
          </tbody>
        </table>
      </div>
    </>
  );
};

export default LIst;
