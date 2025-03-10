//리턴타입이 없다.
//매개변수는 필요하면 넣는다
function printHello(){
  console.log('hello~');
}

printHello();

//매개변수로 두 정수
function twoSum(a, b){
 console.log(a+b);
}

twoSum(20,31);

//두 수를 전달 받아 두 수의 곱을 리턴하는 함수
function multi(a,b){
  return a*b;
}

console.log(multi(10,13));
let result = multi(10,13);

console.log(result);


//자바스크립트는 변수에 저장 가능

//기본 함수 선언 방식
function printData(){
  console.log('hello');
}

//함수 표현식
const printData2 = function(){

};

//화살표 함수 : 함수를 간략히 선언
const printData1 = (/* 매개변수 */) => {
  /* 함수의 내용 */
  console.log('hello!');
};

printData1();


function f1(a,b){
  console.log(a+b);
}

const f2 = function(a,b){
  console.log(a+b);
};

const f3 = (a,b) =>
  console.log(a+b);
