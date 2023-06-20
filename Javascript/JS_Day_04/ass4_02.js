function Func() {
    let array = [23,1,42,4,23,5,4,21,67,8];
    let array1 = [];
    for (let i = 0; i < array.length; i++) {
      if (array[i] % 2 != 0) {
        array1.push(array[i]);
      }
    }
    console.log(array1);
}
Func();