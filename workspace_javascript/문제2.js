const emp = 
  {
  name : '길동',
  dept : '컴푸터',
  power : '부장',
  money : 10
}

const emp2 = 
{
  name : '홍길',
  dept : '컴푸터',
  power : '부장',
  money : {
    lower : 10,
    mid : 15,
    high : 20

  }
}

console.log(emp2.money.lower);


const print =(a) =>
{
  if(a.dept==='개발부'){  
    console.log(a.money);
  }
  else{
    console.log('부서가 잘못되었습니다.');
  }
}
print(emp);

// emp객체 두 개를 매개변수로 받아, 매개변수로 전달된 두 객체 중 급여가 높은 객체의 이름을 리턴하는 함수를 함수표현식으로 구현하고 호출해보세요.
const aaa = (a,b) =>{
  if(a.money<b.money){
    return b.name;
  }
  else{
    return a.name;
  }
};
console.log(aaa(emp,emp2));


const foodList = [
  {
    name : '김치찌개',
    price : 12000,
    type : '한식',
    material : ['김치','두부', '돼지고기']
  }, 
  {
    name : '짜장면',
    price : 8000,
    type : '중식',
    material : ['춘장','밀가루', '양파', '오이']
  }, 
  {
    name : '불고기',
    price : 15000,
    type : '한식',
    material : ['소고기','양파', '대파']
  }, 
  {
    name : '탕수육',
    price : 25000,
    type : '중식',
    material : ['돼지고기','밀가루']
  }
];


/* 음식 함수 */
const printFood = (a) =>{
  for(let i = 0; i<a.length; i++){
      console.log(a[i].type);
  }
}
printFood(foodList);



let sum = 0;
const printPrice = (a) =>{
  for(let i = 0; i<a.length; i++){

    if(a[i].type == '한식'){
      sum += a[i].price;
    }
  }
  console.log(sum);
}

printPrice(foodList);

//매개변수로 foodList가 전달되면 음식재료가 3개 이상인 음식정보만 새로운 배열에 담아 리턴하는 함수를 구현하고 호출하세요.

const printMat = (a) =>{
  const arr1 =[];
  let index=0;
  for(let i = 0; i<a.length; i++){
    if(a[i].material.length >=3){
      arr1[index++]=a[i].name;
    }
  }
  return arr1
}

console.log(printMat(foodList));


//첫번째 매개변수로 foodList, 두번째 매개변수로 음식명이 전달되면 전달된 음식명의 모든 요리재료를 출력하는 함수를 화살표함수로 구현하고 호출하세요. 만약, 두번째 매개변수로 전달된 음식명이 없다면 '정보없음'을 출력하세요.

const printFname = (a, b) =>{
  let fodE = false; //발견 유무
  let findData = null;
  for(let i = 0; i<a.length; i++){
    if(a[i].name === b){
      fodE = true;
      findData = a[i];
      break;
    }
  }
  if(fodE){
    console.log(findData.material);
  }  
  else{
    console.log('음식이 없습니다.');
  }
  
}

printFname(foodList,'탕수육');