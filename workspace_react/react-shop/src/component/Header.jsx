import React from "react";
import styles from "./Header.module.css";
import { Link } from "react-router-dom";
const Header = () => {
  return (
    <>
      <div className={styles.HeaderMainBox}>
        <div className={styles.innerBox}>
          <span>
            <Link to="">상품정보</Link>
          </span>
          <Link to="/itemadd">상품등록</Link>
          <span>
            <Link to="/order">주문하기</Link>
          </span>
          <span>
            <Link to="/orderList">주문목록</Link>
          </span>
        </div>
      </div>
    </>
  );
};

export default Header;
