import React from "react";
import styles from "./Header.module.css";
import { Link, NavLink } from "react-router-dom";
import DeptJob from "./DeptJob";

const Header = () => {
  return (
    <>
      <div className={styles.headerContainer}>
        <h3>
          <NavLink
            to="/deptjob"
            className={(data) => {
              return data.isActive && styles.active1;
            }}
          >
            부서&직급관리
          </NavLink>
        </h3>
        <h3>
          <NavLink
            to="/emp"
            className={(data) => {
              return data.isActive && styles.active1;
            }}
          >
            사원관리
          </NavLink>
        </h3>
        <h3>
          <NavLink
            to="/empsearch"
            className={(data) => {
              return data.isActive && styles.active1;
            }}
          >
            사원조회
          </NavLink>
        </h3>
        <h3>
          <NavLink
            to="/sal"
            className={(data) => {
              return data.isActive && styles.active1;
            }}
          >
            연봉조회
          </NavLink>
        </h3>
      </div>
    </>
  );
};

export default Header;
