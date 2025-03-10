import axios from "axios";
import React, { useEffect, useState } from "react";

const Catemanager = () => {
  const [cateList, setList] = useState([]);
  const [cateData, setCateData] = useState({
    /* 카테고리 등록 */ cateName: "",
  });
  const [newData, setnewData] = useState({
    /* 카테고리 수정 */ cateName: "",
  });
  const [trigger, setTrigger] = useState({});

  function saveCate() {
    /* 카테고리 저장 버튼 */

    axios
      .post("/api/categories", cateData)
      .then((res) => {
        if (res.data == 1) {
          alert("등록성공!");
          setTrigger({});
          setCateData({
            cateName: "",
          });
        } else {
          alert("등록실패!");
        }
      })
      .catch();
  }

  function ChangeData(e) {
    /* 카테고리 저장받을 함수 */
    setCateData({
      ...cateData,
      [e.target.name]: e.target.value,
    });
    console.log(cateData);
  }

  function ChangeNewData(e) {
    /* 카테고리 수정받을 함수 */
    setnewData({
      ...newData,
      [e.target.name]: e.target.value,
    });
    console.log(newData);
  }

  /* 카테고리 받아오는 axios */
  useEffect(() => {
    axios
      .get("/api/categories")
      .then((res) => setList(res.data))
      .catch((error) => console.log("에러발생"));
  }, [trigger]);

  function deleteData(e) {
    /* 카테고리 삭제 함수 */
    if (!confirm("삭제하시겠습니까?")) return;

    axios
      .delete(`/api/categories/${e}`)
      .then((res) => console.log("삭제완료"))
      .catch();
    alert("삭제완료");
    setTrigger({});
  }

  function updateData(e) {
    /* 카테고리 수정 함수 */
    if (newData.cateName === "") {
      alert("카테고리명은필수입니다");
      return;
    }
    for (let i = 0; i < cateList.length; i++) {
      if (newData.cateName === cateList[i].cateName) {
        alert("이름이 중복됩니다.");
        return;
      }
      setTrigger({});
    }

    axios
      .put(`/api/categories/${e}`, newData)
      .then((res) => console.log("수정 완료"))
      .catch();
    alert("수정");
  }

  const handleKey = (e) => {
    console.log(e.key);
    if (e.key === "Enter") {
      saveCate();
    }
  };

  return (
    <>
      <div>
        <div>
          <p>카테고리 등록</p>
          <input
            type="text"
            name="cateName"
            value={cateData.cateName}
            onChange={ChangeData}
            onKeyDown={handleKey}
          />
          <button type="button" onClick={saveCate}>
            카테고리 등록
          </button>
        </div>
        <div>
          <table>
            <tbody>
              <tr>
                <td>No</td>
                <td>카테고리 코드</td>
                <td>카테고리명</td>
                <td>수정</td>
                <td>삭제</td>
              </tr>
              {cateList.map((cate, i) => {
                return (
                  <tr key={i}>
                    <td>{cateList.length - i}</td>
                    <td>{cate.cateCode}</td>
                    <td>
                      <input
                        type="text"
                        name="cateName"
                        defaultValue={cate.cateName}
                        onChange={ChangeNewData}
                      />
                    </td>
                    <td>
                      <button
                        type="button"
                        onClick={() => {
                          updateData(cate.cateCode);
                        }}
                      >
                        수정
                      </button>
                    </td>
                    <td>
                      <button
                        type="button"
                        onClick={() => {
                          deleteData(cate.cateCode);
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

export default Catemanager;
