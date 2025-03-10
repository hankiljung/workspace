import axios from "axios";
import React, { useEffect } from "react";
import { use } from "react";

const Text = ({ text, setText, tab, setTab, textDetail, setTextDetail }) => {
  useEffect(() => {
    axios
      .get("/api/t11")
      .then((res) => {
        setText((text = res.data));
        console.log(text);
      })
      .catch((error) => {
        console.log("오류발생");
      });
  }, []);
  function changeText(e){
    for(let i = 0; i<text.length; i++){
      if(e.target === text.title){
        console.log("true")
        setTextDetail()
      }
      else{
        console.log("false")
      }
    }
      
  }

  return (
    <>
      <div>
        <table>
          <tbody>
            <tr>
              <td>글번호</td>
              <td>제목</td>
              <td>글제목</td>
              <td>작성자</td>
              <td>조회수</td>
            </tr>
            {text.map((list, index) => {
              return (
                <tr key={index}>
                  <td>{text.length - index}</td>
                  <td onClick={(e)=>{
                    console.log(e.target)
                    changeText(e)
                  }
                  }>{list.title}</td>
                  <td>{list.name}</td>
                  <td>{list.writer}</td>
                  <td>{list.title}</td>
                </tr>
              );
            })}
          </tbody>
        </table>
      </div>
    </>
  );
};

export default Text;
