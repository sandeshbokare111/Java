/*5.	Create a JS object which stores the following details about a vehicle:
vehicleid        :        a number
brand            :        a string
model            :        a string
variant          :       a string
specifications             an object containing the following members:
firstGear    function which lmessage
secondGear     a which logs some message
maxSpeed       a number
changeGear    a which calls “firstGear” and 
    “secondGear” functions 
Print the vehicleid, brand, model, variant on the browser console. Invoke the changeGear function & display the speed on the browser console.
*/
let vehicle = {
    vehicleid: 111,
    brand: 'TATA',
    model: '2022',
    variant: 'one year',
    specifications:{
        firstGear: function(){
            console.log('vehicle is in First Gear')
            speedOfVehicle = 10;
            console.log(`speed of vehicle is ${speedOfVehicle}`)
        },
        secondGear: function(){
            console.log('vehicle is in Second Gear');
            speedOfVehicle = 30;
            console.log(`speed of vehicle is ${speedOfVehicle}`);
        },
        speedOfVehicle : 70,
        changeGear: function(){
            return(this.firstGear(),this.secondGear())
        }
    }
};
const details = (vehicle)=>{
    console.log(`vehicle id is ${vehicle.vehicleid}`)
    console.log(`vehicle brand is ${vehicle.brand}`)
    console.log(`vehicle model is ${vehicle.model}`)
    console.log(`vehicle varient is ${vehicle.variant}`)
    vehicle.specifications.changeGear();
    console.log(vehicle.specifications.speedOfVehicle);
  //  console.log('inside details function');
  //  console.log(Object.values(vehicle));
}
details(vehicle);
