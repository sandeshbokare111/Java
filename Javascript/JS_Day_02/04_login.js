//4.Write a JS arrow function named Login() which takes a username and password. In case any of the arguments or both are not passed, the default values must be CT and CT respectively. 

let login = (a = "CT", b = "CT") => console.log(`Username : ${a} password : ${b}`);
login("Sandesh Bokare","S@ndesh1234");//When we entered the login details'a'
login('sandesh')
login();//If there are no login details it will automatically diplay the given values i.e('CT').