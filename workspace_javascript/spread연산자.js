
const arr1 = [1,2,3];
const arr2 = [4,5];

let arr3 = [1,2,3,...arr2];
console.log(arr3);

const sum = (a,b) =>{
  let c = [...a,...b];
  let sum1 = 0;
  for(let i = 0; i<c.length; i++){
    sum1+=c[i];
    }
    console.log(sum1);
};
sum(arr1,arr2);

// ...arr은 박스를 벗긴다

const person ={
  name : 'kin',
  age : 20,
}

const score ={
  korScore : 80,
  engScore : 90
}

const student ={
  ...person,
  ...score
}
