const test = () =>{
  const ul_tag = document.querySelector('.my-ul');

  for(let i = 0 ; i< 50; i++){
    ul_tag.innerHTML +=`<li>${i}</li>`;
  }
};


