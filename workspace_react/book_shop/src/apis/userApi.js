import axios from "axios";

export const insertUser = (a) => {
  const res = axios.post("/api/users", a);
  return res;
};
