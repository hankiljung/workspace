
//배열의 데이터를 다른 변수에 저장하는 일반적 방법
const arr1 = [1,2,3];
let a = arr1[0];
let b = arr1[1];
let c = arr1[2];

let [aa,bb,cc] = arr1;
console.log(aa,bb,cc);

let[aaa,bbb] = arr1;
console.log(aaa,bbb);

let[a1,b1,c1,d1] = arr1;//변수명은 마음대로 설정 가능하다.
console.log(a1,b1,c1,d1);

const person ={
  name : 'kim',
  age : 20,
  hobby : '공부'
}

const {name, age, hobby} =person;
console.log(name,age,hobby);

const {name : name1, age1, hobby1} =person;//객체의 key값과 같아야한다.
console.log(name1, age1, hobby1);


//배열은 순서에 따라 마음대로 하기 때문에 매개변수명을 아무렇게 정해도된다.
//객체는 key값으로 들어와야한다.

const student ={
  name : 'jim',
  age : 30,
  korScore : 80,
  engScore : 70,
  
}

const totalScore = (s) =>{
  return s.korScore + s.engScore;
};

const getSum =({korScore, engScore}) =>{
  return korScore+ engScore;
};

console.log(totalScore(student));
console.log(getSum(student));

const phone ={
  modelName : 's5',
  price : 10000,
};

//매개변수로 폰을 전달하면 폰 객체의 모델명과 가격을 출력하는 함수
const printPhone = ({modelName, price}) =>{
  console.log(`핸드폰의 모델은 ${modelName}이며 가격은 ${price}원입니다.`);
};

printPhone(phone);
