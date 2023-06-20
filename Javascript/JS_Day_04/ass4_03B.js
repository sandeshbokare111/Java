const arr1=[1,2,3,4,5,6,7,8,9,10,15,17,19];
const primeNumber=arr1.filter(number=>{
    for(let i=2;i<number;i++){
        if(number%i===0)
        return false;
    }
    return number!==1;
});
console.log(primeNumber);