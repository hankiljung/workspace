import axios from "axios";
import "./Axios_04.css";
import React, { useEffect, useState } from "react";

const Axios_04 = () => {
  const [personList, setPerson] = useState([]);
  useEffect(() => {
    axios
      .get("/api/t4")
      .then((res) => {
        setPerson(res.data);
        console.log(res.data);
      })
      .catch((error) => {
        console.log("오류발생");
      });
  }, []);
  return (
    <>
      <table>
        <thead>
          <tr>
            <th>이름</th>
            <th>나이</th>
            <th>주소</th>
          </tr>
        </thead>
        <tbody>
          {personList.map((person, index) => {
            return (
              <tr key={index}>
                <td>{person.name}</td>
                <td>{person.age}</td>
                <td>{person.addr}</td>
              </tr>
            );
          })}
        </tbody>
      </table>
    </>
  );
};

export default Axios_04;
