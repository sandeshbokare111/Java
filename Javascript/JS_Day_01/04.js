var s = [3,5,78,3,5,8,9];
var n1 = 0;//variable to store largest number
var n2 = 0;//variable to store second largest number
for (var i in s){
    var n3 = s[i];
    if(n1<n3){
        n2 = n1;
        n1=n3;
    }
    else if (n2<n3){
        n2=n3;
    }
}
document.write("array: "+s,"<br>");
document.write("The largest number is : "+n1,'<br>');
document.write("The second largest number is : "+n2,'<br>');