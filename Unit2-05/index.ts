/*
* This is the main code that runs with the Vehicle Class.
*
* @author  Infinity de Guzman
* @version 1.0
* @since   2024-05-7
*/

/**
* This is the Main program.
*/
class Main {
    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException if instantiation is attempted
    */
    private constructor() {
        throw new Error("Cannot be instantiated")
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static main(): void {
        // MultipleStringLiterals & MagicNumbers
        const statusString = "Status:"
        const newSpeedString = "New speed: "
        const newColourString = "New colour: "
        const changingColourString = "Changing colour:"
        const fourConst = 4
        const twoHundredEightyFourConst = 284
        const tenConst = 10
        const threeHundredTwentyConst = 320
        const oneHundredConst = 100
        const fortyFiveConst = 45
        const fiveConst = 5
        const twoConst = 2

        console.log("Created Ford focus")
        const fordFocus = new Vehicle("white", "B40-C4RR0",
            fourConst, twoHundredEightyFourConst)

        console.log(statusString)
        fordFocus.status()

        console.log("Accelerating, 10 of power for 10 sec.")
        fordFocus.accelerate(tenConst, tenConst)
        console.log(newSpeedString + fordFocus.getSpeed())

        console.log("Changing colour to black:")
        fordFocus.setColor("black")
        console.log(newColourString + fordFocus.getColor())

        console.log("")

        // New Ferrari
        console.log("Created a Ferrari")
        const ferrari = new Vehicle("red", "VHD-35HU", 2,
            threeHundredTwentyConst)

        console.log(statusString)
        ferrari.status()

        console.log("Accelerating, 100 of power for 4 sec.")
        ferrari.accelerate(oneHundredConst, fourConst)
        console.log(newSpeedString + ferrari.getSpeed())

        console.log("Breaking, 10 of power for 10 sec.")
        ferrari.brake(tenConst, tenConst)
        console.log(newSpeedString + ferrari.getSpeed())

        console.log(changingColourString)
        ferrari.setColor("racing red!")
        console.log(newColourString + ferrari.getColor())

        console.log("")

        // New Citroen Ami
        console.log("Created a Citroen Ami")
        const citroenAmi = new Vehicle("blue", "FS-695-DQ",
            twoConst, fortyFiveConst)

        console.log(statusString)
        citroenAmi.status()

        console.log("Accelerating, 5 of power for 10 sec.")
        citroenAmi.accelerate(fiveConst, tenConst)
        console.log(newSpeedString + citroenAmi.getSpeed())

        console.log("Breaking, 2 of power for 10 sec.")
        citroenAmi.brake(2, tenConst)
        console.log(newSpeedString + citroenAmi.getSpeed())

        console.log(changingColourString)
        citroenAmi.setColor("purple")
        console.log(newColourString + citroenAmi.getColor())

        console.log("\nDone.")
    }
}

/**
 * Class that defines a vehicle.
 */
class Vehicle {
    private _colour: string
    private _licensePlate: string
    readonly numberOfDoors: number
    readonly maxSpeed: number
    private _speed: number

    constructor(colour: string, licensePlate: string, numberOfDoors: number, maxSpeed: number) {
        this._colour = colour
        this._licensePlate = licensePlate
        this.numberOfDoors = numberOfDoors
        this.maxSpeed = maxSpeed
        this._speed = 0
    }

    public getSpeed(): number {
        return this._speed
    }

    public getColor(): string {
        return this._colour
    }

    public setColor(value: string): void {
        this._colour = value
    }

    public status(): void {
        console.log(" -> Speed: " + this._speed)
        console.log(" -> Max Speed: " + this.maxSpeed)
        console.log(" -> Number Of Doors: " + this.numberOfDoors)
        console.log(" -> License Plate: " + this._licensePlate)
        console.log(" -> Colour: " + this._colour)
    }

    public accelerate(accPower: number, accTime: number): void {
        this._speed = (accPower * accTime) + this._speed
        if (this._speed > this.maxSpeed) {
            this._speed = this.maxSpeed
        }
    }

    public brake(breakPower: number, breakTime: number): void {
        this._speed -= breakPower * breakTime
        if (this._speed < 0) {
            this._speed = 0
        }
    }
}

Main.main()

