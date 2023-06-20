//3.Write a standard JS function which takes variable number of arguments and prints each argument on the screen and also the number of arguments passed.
function args(...a){ //spread operator.
    for (const e of a){
        console.log(e)
    }
    console.log('Total number of arguements passed : '+a.length)
}
console.log(args(2,3,45,6,'sandy',7,8));
