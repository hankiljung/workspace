import { StyleSheet, Text, View } from "react-native";
import React from "react";
import { Pressable } from "react-native";
import Style1 from "../components/Style1";
import Style2 from "./../components/Style2";

/* view -> div */
/* 모든 글자는 text로 감싸야한다. */
/* 버튼 대신 프레서블을 사용한다 */
const MainScreen = () => {
  return <Style2 />;
};

export default MainScreen;

const styles = StyleSheet.create({});
