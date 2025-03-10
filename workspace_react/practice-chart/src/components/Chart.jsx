import axios from "axios";
import React, { use, useEffect, useRef, useState } from "react";
import {
  CartesianGrid,
  Legend,
  Line,
  LineChart,
  Tooltip,
  XAxis,
  YAxis,
} from "recharts";

export const Chart = () => {
  const [data, setData] = useState([]);
  const [chart, setChart] = useState({
    name: "",
    bodyfat: "",
    bodyweight: "",
    mucsle: "",
  });

  useEffect(() => {
    axios
      .get("/api/charts")
      .then((res) => setData(res.data))
      .catch();
  }, []);

  function onChange(e) {
    setChart({
      ...chart,
      [e.target.name]: e.target.value,
    });
    console.log(chart);
  }

  function saveChart(e) {
    if (data.name === "") {
      console.log("필수입력값입니다");
      return;
    }
    if (data.bodyfat === "") {
      console.log("필수입력값입니다");
      return;
    }
    if (data.bodyweight === "") {
      console.log("필수입력값입니다");
      return;
    }
    if (data.mucsle === "") {
      console.log("필수입력값입니다");
      return;
    }

    axios
      .post("/api/charts", chart)
      .then((res) => console.log("데이터 전송 완료"))
      .catch();
  }
  return (
    <>
      <LineChart
        width={800}
        height={250}
        data={data}
        margin={{ top: 5, right: 30, left: 20, bottom: 5 }}
      >
        <XAxis dataKey="name" />
        <YAxis />
        <Tooltip />
        <Legend />

        <Line
          type="monotone"
          dataKey="bodyweight"
          stroke="#343A40"
          strokeWidth={5}
        />
        <Line
          type="monotone"
          dataKey="muscle"
          stroke="#495057"
          strokeWidth={5}
        />
        <Line
          type="monotone"
          dataKey="bodyfat"
          stroke="#212529"
          strokeWidth={5}
          onClick={(e) => {
            console.log(e);
          }}
          cursor="pointer"
        />
      </LineChart>
      <div>
        <table>
          <tbody>
            <tr>
              <td>날짜</td>
              <td>
                <input type="text" name="name" onChange={onChange} />
              </td>
            </tr>
            <tr>
              <td>체중</td>
              <td>
                <input type="number" name="bodyweight" onChange={onChange} />
              </td>
            </tr>
            <tr>
              <td>골격근</td>
              <td>
                <input type="number" name="muscle" onChange={onChange} />
              </td>
            </tr>
            <tr>
              <td>체지방률</td>
              <td>
                <input type="number" name="bodyfat" onChange={onChange} />
              </td>
            </tr>
          </tbody>
        </table>
        <button type="button" onClick={saveChart}>
          데이터 저장
        </button>
      </div>
    </>
  );
};
