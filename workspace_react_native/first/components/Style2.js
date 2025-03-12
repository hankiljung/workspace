import {
  Pressable,
  SafeAreaView,
  StyleSheet,
  Text,
  TextInput,
  View,
} from "react-native";
import React from "react";

const Style2 = () => {
  const [text, onChangeText] = React.useState("");

  return (
    <SafeAreaView style={styles.mainCon}>
      <View>
        <Text style={styles.text}>아이디</Text>
        <TextInput style={styles.input} onChange={onChangeText} value={text} />
      </View>
      <View>
        <Text style={styles.text}>비밀번호</Text>
        <TextInput style={styles.input} onChange={onChangeText} value={text} />
      </View>
      <View style={styles.c}>
        <Pressable style={styles.button}>
          <Text>로그인</Text>
        </Pressable>
      </View>
    </SafeAreaView>
  );
};

export default Style2;

const styles = StyleSheet.create({
  mainCon: {
    flex: 1,
    borderWidth: 1,
    justifyContent: "center",
    padding: 25,
  },

  text: {
    marginBottom: 6,
    fontSize: 20,
    fontWeight: "bold",
  },

  input: {
    marginBottom: 12,
    borderBottomWidth: 1,
    fontSize: 20,
  },

  button: {
    padding: 10,
    width: "100%",
    alignItems: "center",
    backgroundColor: "lightgray",
    color: "#ffffff",
  },
  c: {
    flexDirection: "row",
    width: "100%",

    justifyContent: "space-between",
  },
});
