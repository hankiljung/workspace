import React, { useState } from "react";

const Controllerjsx = ({ cnt, cntSet }) => {
  return (
    <>
      <div>
        <br />
        <button
          type="button"
          onClick={() => {
            cntSet(cnt - 1);
          }}
        >
          -1
        </button>
        <button
          type="button"
          onClick={() => {
            cntSet(cnt - 10);
          }}
        >
          -10
        </button>
        <button
          type="button"
          onClick={() => {
            cntSet(cnt - 100);
          }}
        >
          -100
        </button>
        <button
          type="button"
          onClick={() => {
            cntSet(cnt + 100);
          }}
        >
          +100
        </button>
        <button
          type="button"
          onClick={() => {
            cntSet(cnt + 10);
          }}
        >
          +10
        </button>
        <button
          type="button"
          onClick={() => {
            cntSet(cnt + 1);
          }}
        >
          +1
        </button>
      </div>
    </>
  );
};

export default Controllerjsx;
