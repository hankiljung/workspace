import { Route, Routes } from "react-router-dom";
import "./App.css";
import MemList from "./components/MemList";
import MemDetail from "./components/MemDetail";

function App() {
  return (
    <>
      <div></div>

      <Routes>
        <Route path="" element={<MemList />} />
        <Route path="/:id" element={<MemDetail />} />
        <Route path="" element />
      </Routes>
    </>
  );
}

export default App;
