function GetVideo() {
    return new Promise((resolve) => {
      setTimeout(() => {
        resolve("Got video");
      }, 3000)
    })
  }
  function AddIntro() {
    return new Promise((resolve) => {
      setTimeout(() => {
        resolve("Intro Added");
      }, 3000)
    })
  }
  function AddSummary() {
    return new Promise((resolve) => {
      setTimeout(() => {
        resolve("Summary Added");
      }, 3000)
    })
  }
  
  GetVideo().then((result)=>{
      console.log(result);
  });
  
  AddIntro().then((result)=>{
      console.log(result);
  });
  
  AddSummary().then((result)=>{
      console.log(result);
  });