<>import React from 'react'</>;

// localList를 사용하여 selectbox를 그리세요
const Map_03 = () => {
  const localList = ["경기도", "강원도", "경상도", "전라도"];

  return (
    <>
      <div>Map_03</div>
      <div>
        <select>
          {localList.map((local, i) => {
            return <option key={i}>{local}</option>;
          })}
        </select>
      </div>
    </>
  );
};

export default Map_03;
