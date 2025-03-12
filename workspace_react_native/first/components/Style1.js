import {
  SafeAreaView,
  StyleSheet,
  Text,
  TextInputBase,
  View,
} from "react-native";
import React from "react";
import { TextInput } from "react-native-web";

/* react native의 컴포넌트들은 모두 flex가 기본값이다 */
/* flexDirection은 컬럼이다 */

const Style1 = () => {
  return (
    <SafeAreaView style={styles.container}>
      <View style={styles.v1}>
        <Text>text1</Text>
      </View>
      <View style={styles.v2}>
        <Text>text2</Text>
      </View>
      <View style={styles.v3}>
        <Text>text3</Text>
      </View>
    </SafeAreaView>
  );
};

export default Style1;

const styles = StyleSheet.create({
  container: {
    // flexDirection: "row",
  },
  v1: {
    backgroundColor: "lightgray",
  },
  v2: {
    backgroundColor: "#999999",
  },
  v3: {
    backgroundColor: "yellow",
    alignItems: "center",
  },
});
