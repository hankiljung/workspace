import axios from "axios";
import React, { useEffect, useState } from "react";
import styles from "./Header.module.css";

const ItemAdd = () => {
  const [item, setItem] = useState({});
  function saveData() {
    axios
      .post("./api/shops", item)
      .then((res) => console.log("전송 완료"))
      .catch((error) => console.log("오류 발생"));
  }
  const onChange = (e) => {
    setItem({ ...item, [e.target.name]: e.target.value });
    console.log(item);
  };
  return (
    <>
      <div className={styles.itemListBox3}>
        <table>
          <tbody>
            <tr>
              <td>상품명</td>
              <td>
                <input
                  type="text"
                  name="itemName"
                  onChange={onChange}
                  placeholder="상품명"
                />
              </td>
            </tr>
            <tr>
              <td>상품가격</td>
              <td>
                <input
                  type="text"
                  name="itemPrice"
                  onChange={onChange}
                  placeholder="상품가격"
                />
              </td>
            </tr>
            <tr>
              <td>판매자</td>
              <td>
                {" "}
                <input
                  type="text"
                  name="seller"
                  onChange={onChange}
                  placeholder="판매자"
                />
              </td>
            </tr>
            <tr>
              <td>상품 설명</td>
              <td>
                <input
                  type="text"
                  name="itemIntro"
                  onChange={onChange}
                  placeholder="상품설명"
                />
              </td>
            </tr>
          </tbody>
        </table>
        <button type="button" onClick={saveData}>
          상품 등록
        </button>
      </div>
    </>
  );
};

export default ItemAdd;
