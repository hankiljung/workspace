
///배열 생성 문법
const arr = new Array(); //빈 배열 생성
const arr2 = []; //빈 배열 생성
const arr3 = [1,2,3]; // 촉기값이 세팅된 배열 생성
const arr4 = [1, 4.4, 'java']; //자료형 다른 데이터 추가 가능
const arr5 = [1,5,1,[1,3,5]];

//배열에 데이터 추가
const arr6 = [];
arr6[0] = 5;
arr6[3] = 7;
arr6.push(10); //배열의 마지먹 요소에 데이터 추가

//배열 데이터 출력
console.log(arr6);//배열 객처 출력하면 다나옴


const arr7 =[5,1,[1,4,7]];
console.log(arr7[2][2]);