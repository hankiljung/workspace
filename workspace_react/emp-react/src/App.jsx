import { Route, Routes } from "react-router-dom";
import "./App.css";
import Header from "./components/Header";
import DeptJob from "./components/DeptJob";
import Empinsert from "./components/Empinsert";
import EmpSearch from "./components/EmpSearch";
import Sal from "./components/Sal";

function App() {
  return (
    <>
      <Header />
      <Routes>
        <Route path="/deptjob" element={<DeptJob />} />
        <Route path="/emp" element={<Empinsert />} />
        <Route path="/empsearch" element={<EmpSearch />} />
        <Route path="/sal" element={<Sal />} />
      </Routes>
    </>
  );
}

export default App;
