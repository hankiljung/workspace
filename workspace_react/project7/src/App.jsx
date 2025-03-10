import { useState } from "react";
import "./App.css";
import Counter from "./components/Counter";
import Header from "./components/Header";
import Head from "../Head";
import Lotto from "../Lotto";
import Lotto1 from "../Lotto1";

function App() {
  const [num, numSet] = useState([0, 0, 0, 0, 0, 0]);
  return (
    <>
      {/* <Header hobby={"react"} 
      name={"bob"}
      age ={20}/> */}
      {/* <Counter /> */}
      <Head />
      {/* <Lotto num ={num} numSet={numSet} /> */}
      <Lotto1 num={num} numSet={numSet} />
    </>
  );
}

export default App;
