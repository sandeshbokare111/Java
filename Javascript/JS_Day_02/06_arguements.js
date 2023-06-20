// //6.Rewrite the function created in assignment 1 as an arrow function.
// let fact = (n)=>{
// let f=1;
// for(let i=1;i<=n;i++)
// {
//  f=f*i;
// }
// return console.log(`factorial of ${n} is ${f}`);
// }
// fact(8)
let fact = (n) =>
{
    if (n == 0)
        return 1;
    else {
        return (n*fact(n - 1));
}
}
console.log(fact(10))