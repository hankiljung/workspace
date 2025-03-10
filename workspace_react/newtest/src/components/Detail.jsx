import React from "react";

const Detail = ({ detail }) => {
  return (
    <>
      <div>
        <table className="detail-table">
          <colgroup>
            <col width={"20%"} />
            <col width={"*"} />
            <col width={"20%"} />
            <col width={"20%"} />
          </colgroup>
          <tbody>
            <tr>
              <td>글번호</td>
              <td>{detail.num}</td>
              <td>작성자</td>
              <td>{detail.writer}</td>
            </tr>
            <tr>
              <td>글제목</td>
              <td>{detail.title}</td>
              <td>조회수</td>
              <td>{detail.readCnt}</td>
            </tr>
            <tr>
              <td colSpan={1}>글 내용</td>
              <td colSpan={3}></td>
            </tr>
          </tbody>
        </table>
      </div>
    </>
  );
};

export default Detail;
