async function sdd(a,b){
    let myPromise = new Promise(function(resolve){
    return a+b
    await (console.log('done'))
    })   
}
let ans = sdd(10,20)
console.log(ans)



/*========================*/

async function main(){
    let ans = await addEventListener(10,20);
    console.log(ans);
}
main();
console.log('addition started await')