//9.Write a JS function which takes 3 arguments, namely arg1, arg2 and arg3. Call the function by passing an array of 3 elements to it. The function must return the maximum value from the array passed to it.
function args(arg1,arg2,arg3){
    // console.log(Math.max(arg1, arg2, arg3));
    if (arg1>arg2 && arg1>arg3) {

        console.log(`largerst value is : ${arg1}`);
    }
    else if(arg2>arg3)
    {
        console.log(`largerst value is : ${arg2}`);
    }
    else
    {
        console.log(`largerst value is : ${arg3}`);
    }
}
let x = [6,9,90];
args(...x);
// args.apply(this,x)



