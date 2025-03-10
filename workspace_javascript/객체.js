//객체 : key와 value한 쌍의 데이터로 이루어진 데이터 집합

//객체 선언
const obj1 = {}; //빈 객체 생성

const person = {
  name : 'kim', /* 왼쪽은 key 오른쪽은 value */
  age : 20,
  addr : '울산',
  age : 34 // 키가 중복이면 마지막으로 넣은 데이터만 유효하다
  
}; //빈 객체 생성

person.hobby = '공부';
//kim 이란 문자열을 출력
console.log(person.name);
console.log(person['name']);
console.log(person);
let abc = 'name';
console.log(person[abc]);

//새로운 데이터 추가 방법

//키가 있으면 바꾸고 없으면 새로 키를 만듦
