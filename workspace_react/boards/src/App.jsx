import { Route, Routes } from "react-router-dom";
import "./App.css";
import BoardMain from "./components/BoardMain";
import Write from "./components/Write";
import Detail from "./components/Detail";
import Update from "./components/Update";
import Detail2 from "./components/Detail2";
import ChartPractice from "./components/ChartPractice";

function App() {
  return (
    <>
      <Routes>
        <Route path="" element={<BoardMain />} />
        <Route path="/write" element={<Write />} />
        <Route path="/delete" element={<BoardMain />} />
        <Route path="/:boardNum" element={<Detail />} />
        <Route path="/:title/:writer" element={<Detail2 />} />
        <Route path="/update/:boardNum" element={<Update />} />
      </Routes>
      <ChartPractice />
    </>
  );
}

export default App;
