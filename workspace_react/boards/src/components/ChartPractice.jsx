import React from "react";
import {
  CartesianGrid,
  Legend,
  Line,
  LineChart,
  Tooltip,
  XAxis,
  YAxis,
} from "recharts";

const ChartPractice = () => {
  const data = [
    {
      name: "24.12.31",
      muscle: 32,
      weight: 66,
      bodyfat: 14.5,
    },
    {
      name: "25.01.10",
      muscle: 33.9,
      weight: 68.7,
      bodyfat: 13.5,
    },
    {
      name: "25.01.17",
      muscle: 34.1,
      weight: 69.4,
      bodyfat: 13.9,
    },
    {
      name: "25.01.24",
      muscle: 34.9,
      weight: 70.1,
      bodyfat: 12.9,
    },
    {
      name: "25.02.07",
      muscle: 35.5,
      weight: 71.5,
      bodyfat: 13.2,
    },
    {
      name: "25.02.14",
      muscle: 35.9,
      weight: 73.1,
      bodyfat: 14,
    },
  ];

  return (
    <>
      <LineChart
        width={730}
        height={250}
        data={data}
        margin={{ top: 5, right: 30, left: 20, bottom: 5 }}
      >
        <CartesianGrid strokeDasharray="0" stroke="f1f3f5" /> 
        <XAxis dataKey="name" />
        <YAxis />
        <Tooltip />
        <Legend />
        <Line type="monotone" dataKey="muscle" stroke="#868e96" />
        <Line type="monotone" dataKey="weight" stroke="#343a40" />
        <Line type="monotone" dataKey="bodyfat" stroke="#212529" />
      </LineChart>
    </>
  );
};

export default ChartPractice;
