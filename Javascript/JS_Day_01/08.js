str = 'CITIUSTECH';
function vowel(str1)
{
    vowelDict={'A':false,'E':false,'I':false,'O':false,'U':false,}
    for(let i=0;i<str1.length;i++)
    {
        if(str1[i] in vowelDict)
        {
        vowelDict[str1[i]]=true;
        }
    }
    count=0;
    for(let key in vowelDict)
    {
        if(vowelDict[key]==true)
        {
            count=count+1;
        }
    }
    console.log(count)
}
vowel(str);