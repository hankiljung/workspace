import axios from "axios";
import React, { use, useEffect, useState } from "react";

// 상품 등록 컴포넌트
const ItemForm = () => {
  const [book, setBook] = useState({
    /* 도서 등록 데이터 */ cateCode: "",
    bookName: "",
    bookPrice: "",
    publisher: "",
  });

  const [cate, setCate] = useState([]); /* 도서 카테고리 */

  function sendData() {
    /* 저장시 axios post 호출 함수 */
    if (book.cateCode === "") {
      alert("카테고리는 필수입니다.");
      return;
    }

    if (book.bookName === "") {
      alert("책 제목은 필수입니다.");
      return;
    }

    if (book.bookPrice === "") {
      alert("책 가격은 필수입니다.");
      return;
    }

    if (book.publisher === "") {
      alert("출판사는 필수입니다.");
      return;
    }

    axios
      .post("/api/books", book)
      .then((res) => console.log("전송완료"))
      .catch();
  }

  const onChange = (e) => {
    /* 책 정보 저장하는 함수 */
    setBook({
      ...book,
      [e.target.name]: e.target.value,
    });
    console.log(book);
  };

  useEffect(() => {
    axios
      .get("/api/categories")
      .then((res) => {
        setCate(res.data);
      })
      .catch((error) => console.log("error accur"));
  }, []);

  return (
    <>
      <div>ItemForm</div>
      <div className="item-form-container">
        <div>도서 등록</div>
        <div>
          <div>
            {/* 카테고리 map으로 받아올것 */}
            <div>
              <p>카테고리</p>
              <select
                name="cateCode"
                id=""
                value={book.cateCode}
                onChange={onChange}
              >
                <option value="">선택하세요</option>
                {cate.map((cate, i) => {
                  return (
                    <option value={cate.cateCode} key={i}>
                      {cate.cateName}
                    </option>
                  );
                })}
              </select>
            </div>
            {/* 도서명 */}
            <div>
              <p>도서명</p>
              <input type="text" name="bookName" onChange={onChange} />
            </div>
          </div>

          {/* 출판사 */}
          <div>
            <p>출판사</p>
            <input type="text" name="publisher" onChange={onChange} />
          </div>

          {/* 도서가격 */}
          <div>
            <p>도서 가격</p>
            <input
              type="text"
              name="bookPrice"
              pattern="[0-9]+"
              onChange={onChange}
            />
          </div>

          {/* 도서 소개 */}
          <div>
            <p>도서 소개</p>
            <textarea name="bookIntro" onChange={onChange}></textarea>
          </div>
        </div>

        <div>
          <button type="button" onClick={sendData}>
            저장
          </button>
          <button type="button">취소</button>
        </div>
      </div>
    </>
  );
};

export default ItemForm;
