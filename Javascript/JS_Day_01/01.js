//prime number
function isPrime(n)
{
    if (n<=1)return false;
    for (var i=2;i<n;i++)
    {
        if(n%i==0) return false;
    }
    return true;
}
var start_number = 5 ;//start_number=prompt("Enter the starting number");5
var end_number = 50 ;//end_number=prompt("Enter the starting number");50
 for(var i=start_number;i<=end_number;i++){
    if(isPrime(i)){
        console.log(i);
    }
 }
