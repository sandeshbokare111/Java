//JS code to sort the array created in assignment 4 in a reverse order by using the reverse() method.
// s = [2,6,4,42,5,6];
// a = s.reverse();//By using reverse method.
// document.write(a);
let s = [3,5,78,3,5,8,9];
for (let i=0;i<s.length;i++)
{
    for(let j=i+1;j<s.length;j++)
    {
        let temp = 0;
        if(s[i]<=s[j])
        {
            temp=s[i];
            s[i]=s[j];
            s[j]=temp;
        }
    }
}
document.write(s)