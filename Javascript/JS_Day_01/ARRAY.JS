// //array as a parameter (array based on condition passed based on even or odd numbers depends on the new array should be returnde)
// let arr=[1,2,3,4,5,8,81];
// // let func = prompt('enter a function need to be excecuted!!')
// // function sdd(func) {
// //     if (func = 'yes')
// //      return even()
// //     else if (func = 'no')
// //      return odd()
// // }

// function even(arrs) {
//     result = 0
//     for (let i = 0; i < arr.length; i++) {
//         if(arr[i]%2==0)
//         {
//             for(let j = 0; j < arr.length; j++){
//             result[j]=arr[i]
//          }
//         }
//     console.log(result)
// }
// }
// even(arr)
/////////////////////////////////////////////////////////////////////
// function odd(arrs) {
//     result = 0
//     for (let i = 0; i < arr.length; i++) {
//         if(arr[i]%2 != 0)
//         {
//             result = result + arr[i]
//         }
//     }
//     console.log(oddresult)
// }
// even(arr)
// console.log(arr,even)
// var s = prompt('enter a function need to be excecuted!!','yes')
// function funcs (){
//     return even()
// }
var a = [1, 2, 3, 4, 5, 6, 7]
function odd(a) {
    for (let i = 0; i < a.length; i++) {
        if (a[i] % 2 != 0) {
            res.push(a[i])
        }
    }
}
console.log(main(a, odd))


// var a = [1, 2, 3, 4, 5, 6, 7]
// var res = []
// function main(a, callback) {
//     callback(a)
//     return res;
// }
// function even(a) {
//         for (let i = 0; i < a.length; i++) {
//         if (a[i] % 2 == 0) {
//             res.push(a[i])
//         }
//     }
// }
// function odd(a) {
//     for (let i = 0; i < a.length; i++) {
//         if (a[i] % 2 != 0) {
//             res.push(a[i])
//         }
//     }
// }
// console.log(main(a, even))    