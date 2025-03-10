import { useState } from "react";
import "./App.css";
import Text from "./components/Text";
import TextDetail from "./components/TextDetail";

function App() {
  const [text, setText] = useState([]);
  const [tab, setTab] = useState(true);
  const [textDetail, setTextDetail] = useState({});
  return (
    <>
      <Text
        text={text}
        setText={setText}
        setTab={setTab}
        textDetail={textDetail}
        setTextDetail={setTextDetail}
      />
      {tab ? <TextDetail textDetail={textDetail} /> : null}
    </>
  );
}

export default App;
