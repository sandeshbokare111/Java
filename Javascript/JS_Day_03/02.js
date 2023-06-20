
document.getElementById('name').addEventListener('click', function () {
    let usrname = document.getElementById('name').value;
    let invalidMessage = document.getElementById('invalidMessage');
    for (let i = 0; i < usrname.length; i++) {
        if (usrname.charAt(i) == " " || usrname.toLowerCase() != "citiustech") {
            invalidMessage.innerHTML = "invalid credentials";
        }
        else {
            invalidMessage.innerHTML = "";
        }
    }
})
document.getElementById('password').addEventListener('click', function () {
    let password = document.getElementById('password').value;
    let invalidMessage1 = document.getElementById('invalidMessage1');
    for (let i = 0; i < password.length; i++) {
        if (password.charAt(i) == " " || password.toLowerCase() != "citiustech") {
            invalidMessage1.innerHTML = "invalid credentials";
        }
        else {
            invalidMessage1.innerHTML = "";
        }
    }
})

document.getElementById('name').addEventListener('focusout', function () {
    let usrname = document.getElementById('name').value;
    if (usrname.length > 2) {
        document.getElementById('button').disabled = false;
    }
})

function loginButton() {
    let Uname = document.getElementById('name').value;
    let Pssword = document.getElementById('password').value;

    let invalidMessage = document.getElementById('invalidMessage');
    let invalidMessage1 = document.getElementById('invalidMessage1');
    if (Uname.toLowerCase() == "citiustech" && Pssword.toLowerCase() == "citiustech") {
        window.open('https://www.google.co.in/');
    }
    else {
        invalidMessage.innerHTML = "Invalid credentials";
    }
}