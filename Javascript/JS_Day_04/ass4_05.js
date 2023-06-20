async function Func(){
    function getVideo(){
    console.log("Got video");
}
function AddIntro(){
    console.log("Intro Added");
}
function AddSummary(){
    console.log("Summary Added");
}
getVideo();
await AddIntro();
AddSummary();
}
Func();
console.log("the await function checking");