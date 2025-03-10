import axios from "axios";
import React, { useState } from "react";

const Axios_09 = () => {
  const [food, setFood] = useState({
    name: "",
    su: 1,
    topping: "bob",
    yogu: "요청사항을 입력하세요.",
    date: "2025-01-17",
  });

  function sendData() {
    axios
      .post("/api/t9", food)
      .then((res) => {
        alert("전송완료");
      })
      .catch((error) => {
        console.log("전송실패");
      });
  }

  function changeData(e) {
    setFood({
      ...food,
      [e.target.name]: e.target.value,
    });
  }

  return (
    <>
      <div>
        <table>
          <tbody>
            <tr>
              <td>음식선택</td>
              <td>
                <select name="name" value={food.name} onChange={changeData}>
                  <option value="">선택하세요</option>
                  <option value="chicken">치킨</option>
                  <option value="pizza">피자</option>
                  <option value="jokbal">족발</option>
                </select>
              </td>
            </tr>
            <tr>
              <td>수량</td>
              <td>
                <input
                  name="su"
                  type="number"
                  value={food.su}
                  onChange={changeData}
                />
              </td>
            </tr>
            <tr>
              <td>추가선택</td>
              <td>
                <input
                  type="radio"
                  value="top"
                  name="topping"
                  checked={food.topping === "top"}
                  onChange={changeData}
                />
                토핑 추가
                <input
                  type="radio"
                  value="water"
                  name="topping"
                  checked={food.topping === "water"}
                  onChange={changeData}
                />
                음료 추가
                <input
                  type="radio"
                  value="bob"
                  name="topping"
                  checked={food.topping === "bob"}
                  onChange={changeData}
                />
                공기밥 추가
              </td>
            </tr>
            <tr>
              <td>요청사항</td>
              <td>
                <textarea
                  name="yogu"
                  value={food.yogu}
                  rows={5}
                  cols={20}
                  onChange={changeData}
                ></textarea>
              </td>
            </tr>
            <tr>
              <td>주문일시</td>
              <td>
                <input
                  type="date"
                  name="date"
                  value={food.date}
                  onChange={changeData}
                />
              </td>
            </tr>
          </tbody>
        </table>
        <button
          type="button"
          onClick={(e) => {
            changeData(e);
            sendData();
            console.log({ food });
          }}
        >
          전송
        </button>
      </div>
    </>
  );
};

export default Axios_09;
