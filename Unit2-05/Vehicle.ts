/*
* Class that defines a vehicle.
*
* @author  Infinity de Guzman
* @version 1.0
* @since   2024-05-05
*/

export default class Vehicle {
    // variables
    private _colour: string
    private _licensePlate: string
    readonly numberOfDoors: number
    readonly maxSpeed: number
    private _speed: number
   
    /*
    * Constructor
    */
    // apparently, it's good practice to reclassify the variables in the constructor's parameters
    constructor(colour: string, licensePlate: string, numberOfDoors: number, maxSpeed: number) {
      this._colour = colour
      this._licensePlate = licensePlate
      this.numberOfDoors = numberOfDoors
      this.maxSpeed = maxSpeed
      this._speed = 0
    }
   
    /*
    * This method gets the colour
    */
    public get colour() {
      return this._colour
    }
   
    /*
    * This method gets the license plate
    */
    public get licensePlate() {
      return this._licensePlate
    }
   
    /*
    * This method gets the speed
    */
    public get speed() {
      return this._speed
    }
   
    /*
    * This method sets the colour
    */
    public set colour(value: string) {
      this._colour = value
    }
   
    /*
    * This method sets the license plate
    */
    public set licensePlate(value: string) {
      this._licensePlate = value
    }
   
    /*
    * This method shows the status of the vehicle
    */
    public status() {
      console.log(" -> Speed: " + this._speed)
      console.log(" -> Max Speed: " + this.maxSpeed)
      console.log(" -> Number Of Doors: " + this.numberOfDoors)
      console.log(" -> License Plate: " + this._licensePlate)
      console.log(" -> Colour: " + this._colour)
    }
   
    /*
    * This method changes the speed via the accelerating formula
    */
    public accelerate(accPower: number, accTime: number) {
      this._speed = (accPower * accTime) + this._speed
      // check if speed exceeds max speed
      if (this._speed > this.maxSpeed) {
        this._speed = this.maxSpeed
      }
    }
   
    /*
    * This method changes the speed via the braking formula
    */
    public brake(breakPower: number, breakTime: number) {
      this._speed -= breakPower * breakTime
      // check if speed is less than 0, because speed can't be negative!
      if (this._speed < 0) {
        this._speed = 0
      }
    }
}

