arr = [2,3,5,6,7];
function fact_number(arr1)
{
    fact_arr=[];
    for(let i=0;i<arr1.length;i++)
    {
        a = 1;
        for(let j=arr1[i];j>0;j--)
        {
            a=a*j;
        }
        fact_arr.push(a);
    }
    console.log(fact_arr);
}
fact_number(arr);