/*
 * Class that defines truck.
 *
 * @author  Infinity de Guzman
 * @version 1.0
 * @since   2024-06-01
 */

import { Vehicle } from "./Vehicle"

export class Truck extends Vehicle {
  private licencePlate: string

  // variables
  constructor(color: string, maxSpeed: number, licencePlate: string) {
    super(color, maxSpeed)
    this.licencePlate = licencePlate
    this.numberOfTires = 6
  }

  // get current speed
  public get licencePlate() {
    return this.licencePlate
  }

  // give status
  public status() {
    super.status()
    console.log(" -> Licence Plate: " + this.licencePlate)
  }

  // change speed via accelerating formula
  public brake(brakePower: number, brakeTime: number, airPressure: number): void {
    this._speed = this._speed - (brakePower * brakeTime) - (airPressure * brakeTime)
  }
}
