import "./App.css";

/* return문 안에 html은 반드시 하나의태그에 감싸져야한다. */

/* 컴포넌트는 반드시 대문자로 시작해야함 */

/* Header이라는 컴포넌트 */
function Header() {
  return (
    <div>
      <h3>header</h3>
    </div>
  );
}

/* Body이라는 컴포넌트 */
function Body() {
  return (
    <div>
      <h3>content</h3>
    </div>
  );
}

/* Footer이라는 컴포넌트 */
const Footer = () => {
  return (
    <div>
      <h3>footer</h3>
    </div>
  );
};

/* App이라는 컴포넌트 */
function App() {
  return (
    <>
      <Header />
      <Body />
      <Footer />
    </>
  );
}

export default App;
