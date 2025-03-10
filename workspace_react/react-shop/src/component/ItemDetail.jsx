import axios from "axios";
import dayjs from "dayjs";
import React, { useEffect, useState } from "react";
import { useParams } from "react-router-dom";
import styles from "./Header.module.css";

const ItemDetail = ({ detail, setDetail }) => {
  function onChange(e) {
    setDetail({
      ...detail,
      [e.target.name]: e.target.value,
    });
    console.log(detail);
  }

  function changeData() {
    axios
      .put(`/api/shops/${detail.itemNum}`, detail)
      .then((res) => console.log("전송 완료"))
      .catch((error) => console.log("전송 완료"));
  }

  return (
    <>
      <div className={styles.itemListBox2}>
        <table>
          <colgroup>
            <col width="%" />
            <col width="%" />
          </colgroup>
          <tbody>
            <tr>
              <td>상품번호</td>
              <td>
                <input
                  type="text"
                  name="itemNum"
                  value={detail.itemNum}
                  readOnly
                />
              </td>
            </tr>

            <tr>
              <td>상품명</td>
              <td>
                <input
                  type="text"
                  name="itemName"
                  placeholder={detail.itemName}
                  onChange={onChange}
                />
              </td>
            </tr>

            <tr>
              <td>상품가격</td>
              <td>
                <input
                  type="text"
                  name="itemPrice"
                  placeholder={detail.itemPrice}
                  onChange={onChange}
                />
              </td>
            </tr>

            <tr>
              <td>판매자</td>
              <td>
                {" "}
                <input type="text" value={detail.seller} readOnly />
              </td>
            </tr>

            <tr>
              <td>판매시작일</td>
              <td>
                {" "}
                <input
                  type="text"
                  value={dayjs(detail.regDate).format("YY년MM월")}
                  readOnly
                />
              </td>
            </tr>

            <tr>
              <td>상품 설명</td>
              <td>
                <input
                  type="text"
                  placeholder={detail.itemIntro}
                  onChange={onChange}
                />
              </td>
            </tr>
          </tbody>
        </table>
        <button type="button" onClick={changeData}>
          수정하기
        </button>
      </div>
    </>
  );
};

export default ItemDetail;
