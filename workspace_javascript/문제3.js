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



const printFoodList = (a) =>{
  let b =[];
  for(let i = 0 ; i < a.length; i++){
    b[i] = a[i].name
  }
  return b;
};

console.log(printFoodList(foodList));

console.log('----------------------------');
console.log('2번 문제 정답');
console.log('----------------------------');

const printPrice = function(list){
  let sum = 0 ;
  for(let e of list){
    if(e.type === '한식'){
      sum += e.price;
    }
  }
  console.log(`한식 가격의 합은 ${sum}원 입니다.`);
};

printPrice(foodList);

console.log('----------------------------');
console.log('4번 문제 정답');
console.log('----------------------------');

const printMat = (list, foodName) =>{
  let isFind = false;
  for(let i = 0 ; i < list.length; i++){
    let foodMat = null;
    if(foodName === list[i].name){
        console.log(list[i].material);
        isFind = true;
        break;
      }
  }
  if(!isFind){
    console.log(`${foodName}(이)가 없습니다.`);
  }
};

printMat(foodList,'김치');

//매개변수가 5보다  큰 수자가 들어올때만 안녕 출력
//return 키워드 작성 후 데이터를 작성하지 않으면 return을 만나면 함수 종료

const aaa = (a) =>{
  if(a > 5){
    return;
  }

  console.log('안녕');
};
aaa(6);

const printMat2 = (list, foodName) =>{
  for(let i = 0 ; i < list.length; i++){
    let foodMat = null;
    if(foodName === list[i].name){
        console.log(list[i].material);
        return ;
      }
  }
  console.log(`${foodName}가 없습니다`);
};
printMat2(foodList,'김치');