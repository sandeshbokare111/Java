s = [2,36,5,42,34,57,62,23,24]
function sumEven(arr){
    result=0;
    for(let i=0;i<arr.length;i++)
    {
        if(arr[i]%2==0)
        {
            result=result+arr[i];
        }
    }
    if(result == 0)
    {
        console.log("No even numbers found");
    }
        return result
}
console.log(sumEven(s));


