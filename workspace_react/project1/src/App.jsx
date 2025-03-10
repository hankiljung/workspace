import "./App.css";
import Footer from "./components/Footer";
import SideMenu from "./components/SideMenu";
import StateTest from "./components/StateTest";

function Header() {
  return (
    <>
      <div>header</div>
    </>
  );
}

function Body() {
  return (
    <>
      <div>body</div>
    </>
  );
}

function App() {
  let title = "오늘의 제목";
  let arr = [1, 2, 3, 45, 56];
  let person = {
    name: "kim",
    age: 20,
  };

  let num = 4;

  return (
    <>
      <StateTest />
      <div className="title">{title}</div>
      {num >= 3 ? <div>3 이상입니다.</div> : ""}
      <div>{arr}</div>
      <div>{person.name}</div>
      <Header />
      <Body />
      <SideMenu />
      <Footer />
    </>
  );
}

export default App;
