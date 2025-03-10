let num1 =5;
//num1이 3이상이면 '3이상입니다'를 출력하는 코드

if(num1>=3){
  console.log('3이상 입니다.');

}

for(let i = 0; i < 10; i++){
  console.log(i);
}

//자바스크립트는 배열 생성시 크기 지정x
//크기가 알아서 늘어남
let arr = [];
let arr2 = [1,2,3,'java'];

for(let i = 0; i<arr2.length; i++){
  console.log(arr2[i]);
}
console.log(arr2);

for(let e of arr2){
    console.log(e);
}