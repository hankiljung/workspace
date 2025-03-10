import React from "react";
import "./map_04.css";
const Map_04 = () => {
  const studentList = [
    {
      name: "김자바",
      age: 20,
      korScore: 70,
      engScore: 80,
    },
    {
      name: "이자바",
      age: 30,
      korScore: 90,
      engScore: 90,
    },
    {
      name: "박자바",
      age: 40,
      korScore: 60,
      engScore: 100,
    },
  ];

  return (
    <>
      <div>Map_04</div>
      <table>
        <thead>
          <tr>
            <th>학생이름</th>
            <th>나이</th>
            <th>국어점수</th>
            <th>영어점수</th>
          </tr>
        </thead>
        <tbody>
          {studentList.map((student, i) => {
            return (
              <tr key={i}>
                <td>{student.name}</td>
                <td>{student.age}</td>
                <td>{student.korScore}</td>
                <td>{student.engScore}</td>
              </tr>
            );
          })}
        </tbody>
      </table>
    </>
  );
};

export default Map_04;
