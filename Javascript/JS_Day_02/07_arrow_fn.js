//7.	Pass the object created in assignment 5 to an arrow function. The function must return a string which contains the vehicleid, brand, ,model, variant & speed.
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
const details = (vehicle) => {
}
console.log(JSON.stringify(vehicle));
details();
