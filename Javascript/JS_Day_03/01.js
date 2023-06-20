function Login() {
    let username = document.getElementById('name').value;
    let password = document.getElementById('password').value;
    let invalidMessege = document.getElementById('invalidMessege');

    if (username == ('citiustech') && password == ('citiustech')) {
        window.open('https://www.google.com/', '  ', 'toolbar=no', '_blank');//to disable the menu and adress bar.
    }
    else {
        invalidMessege.innerHTML = 'Invalid credentials <br>Username and Password';
    }
} 