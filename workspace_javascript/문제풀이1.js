const even = function(a){
  
  for(let i = 0; i < a.length; i++){
    if(a[i]%2===0){
      console.log(a[i]);
    }
  }
}
even([1,2,4,6,5,7,5,41,2,3,4,]);

// 정수로 이루어진 두 배열이 매개변수로 들어오면
// 두 배열의 모든 요소들의 평균을 리턴하는 함수를 함수표현식으로 구현하고 호출해보세요.
let sumB= 0 ;
let sumA = 0 ;

const div = (a,b)=> {
  for(let i = 0 ; i<a.length; i++){
    sumA = sumA+a[i]
  }
  for(let i = 0; i<b.length; i ++){
    sumB = sumB+b[i]
  }
  return (sumA+sumB)/(a.length+b.length);
};


div([2,4,2,5,4,6],[1,2,3,4,5,6,7,5,8,]);
console.log(div([2,4,2,5,4,6],[1,2,3,4,5,6,7,5,8,]));


//3. 문자열로 이루어진 배열이 매개변수로 전달되면 배열 각 요소의 글자 중 길이가 가장 긴 문자열을 리턴하는 함수를 화살표함수로 구현하고 호출해보세요.


const long =(a) => {
  let max=0;
  for(let i = 0; i <a.length; i++){
    if(a[i].length>a[max].length){
      max = i;
    }
  }
  return a[max];
};
console.log(max);
console.log(long(["45456.456","4546","45642313456"]));


//4. 첫번째 매개변수로 전달된 정수의 배수를 두번째 매개변수의 갯수만큼 갖는 배열을 리턴하는 함수를 선언하고 호출해보세요.

const dex = (a) => {
  let multi=[];

  for(let i = 0 ; i < a[1]; i++){
    multi[i]=[a[0]*(i+1)];
  }

  return multi
};

const result = dex([3,5,9,4,5]);
console.log(result);


