import axios from "axios";
import React, { useState } from "react";
import { useParams } from "react-router-dom";

const MemDetail = () => {
  const linkId = useParams();
  console.log(linkId);
  const [MemDetail, setDetail] = useState({});
  useState(() => {
    axios
      .get(`/api/mans/${linkId.id}`)
      .then((res) => {
        setDetail(res.data);
      })
      .catch();
  }, []);
  return (
    <>
      <div>이름 : {MemDetail.memName}</div>
      <div>아이디 : {MemDetail.memId}</div>
      <div>전화번호 : {MemDetail.memTel}</div>
      <div>이름 : {MemDetail.memName}</div>
    </>
  );
};

export default MemDetail;
