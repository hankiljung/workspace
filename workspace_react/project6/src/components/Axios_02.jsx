import axios from "axios";
import React, { useEffect, useState } from "react";

const Axios_02 = () => {
  const [data, setData] = useState({});

  function changeData(res) {
    setData({
      ...data,
      [res.data.name]: res.data.value,
    });
  }

  useEffect(() => {
    axios
      .get("./api/t4")
      .then((res) => {
        setData(res.data);
      })
      .catch((error) => {
        console.log("통신중 오류 발생");
        console.log(error);
      });
  }, []);
  return (
    <>
      <div>{data.name}</div>
    </>
  );
};

export default Axios_02;
