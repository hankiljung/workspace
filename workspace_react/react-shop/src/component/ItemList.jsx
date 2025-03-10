import axios from "axios";
import React, { useEffect, useState } from "react";
import styles from "./Header.module.css";
import ItemDetail from "./ItemDetail";
import ItemAdd from "./ItemAdd";
import { useNavigate, useSearchParams } from "react-router-dom";

const ItemList = () => {
  const nav = useNavigate();
  const [detail, setDetail] = useState(null);
  const [itemList, setList] = useState([]);
  const [data, setData] = useState({
    age: "",
    name: "",
  });

  const [search, setSearch] = useState({
    searchKeyword: "ITEM_NAME",
    searchValue: "",
  });

  function changeData(e) {
    setData({ ...data, [e.target.name]: e.target.value });
  }

  function searchList() {
    axios
      .get(
        `/api/shops?searchKeyword=${search.searchKeyword}&searchValue=${search.searchValue}`
      )
      .then((res) => setList(res.data))
      .catch((error) => console.log(error));
  }

  useEffect(() => {
    axios
      .get("/api/shops")
      .then((res) => setList(res.data))
      .catch((error) => console.log(error));
  }, []);

  //검색창에 입력한 데이터를 저장할 변수
  function searchData(e) {
    setSearch({
      ...search,
      [e.target.name]: e.target.value,
    });
    console.log(search);
  }
  return (
    <>
      {/* 검색창 */}
      <div className={styles.itemListBox1}>
        <select
          name="searchKeyword"
          value={search.searchKeyword}
          onChange={searchData}
        >
          <option value="ITEM_NAME">상품명</option>
          <option value="SELLER">판매자</option>
        </select>
        <input type="text" name="searchValue" onChange={searchData} />
        <button type="button" onClick={searchList}>
          검색
        </button>
      </div>

      {/* 상품 목록 */}
      <div className={styles.itemListBox}>
        <table>
          <colgroup>
            <col width="10%" />
            <col width="30%" />
            <col width="20%" />
            <col width="10%" />
          </colgroup>
          <thead>
            <tr>
              <td>No</td>
              <td>상품명</td>
              <td>상품가격</td>
              <td>판매자</td>
            </tr>
          </thead>
          <tbody>
            {itemList.map((item, i) => {
              return (
                <tr
                  key={i}
                  onClick={(e) => {
                    setDetail(item);
                    console.log(item);
                  }}
                >
                  <td>{item.itemNum}</td>
                  <td>{item.itemName}</td>
                  <td>{item.itemPrice}</td>
                  <td>{item.seller}</td>
                </tr>
              );
            })}
          </tbody>
        </table>

        {/* 상품 상세정보 */}
        {detail && <ItemDetail setDetail={setDetail} detail={detail} />}
      </div>
      
      <div>Querry string 실습</div>
      <div>
        나이 :{" "}
        <input type="text" name="age" value={data.age} onChange={changeData} />
      </div>
      <div>
        이름 :{" "}
        <input
          type="text"
          name="name"
          value={data.name}
          onChange={changeData}
        />
      </div>
      <button
        type="button"
        onClick={(e) => {
          nav(`/test?age=${data.age}&name=${data.name}`);
        }}
      >
        Query string실행
      </button>
    </>
  );
};

export default ItemList;
