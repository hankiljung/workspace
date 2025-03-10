import axios from "axios";
import React, { useEffect, useState } from "react";
import { data } from "react-router-dom";
import {
  CartesianGrid,
  Legend,
  Line,
  LineChart,
  Tooltip,
  XAxis,
  YAxis,
} from "recharts";

const Sal = () => {
  const [data1, setData] = useState([]);
  useEffect(() => {
    axios.get("/api/empsals").then((res) => {
      setData(res.data);
      console.log(data1);
    });
  }, []);
  return (
    <>
      <div>
        <LineChart
          width={730}
          height={250}
          data={data1}
          margin={{ top: 30, right: 30, left: 20, bottom: 5 }}
        >
          <CartesianGrid strokeDasharray="3 3" />
          <XAxis dataKey="empName" />
          <YAxis />
          <Tooltip />
          <Legend />
          <Line type="monotone" dataKey="sal" stroke="#8884d8" />
        </LineChart>
      </div>
    </>
  );
};

export default Sal;
