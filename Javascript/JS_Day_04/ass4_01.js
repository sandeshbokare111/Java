function sum(){
   var a = 10;
   var b = 20;
    console.log(a+b) 
}
function sub(a,b){
    var a = 10;
    var b = 20;
    console.log(a-b) 
}
var prom=new Promise(function(resolve,reject){
    var p=3
    if(p=2){
    resolve();
    }
    else{
    reject()
    }
})
prom.catch(sub)
prom.then(sum)