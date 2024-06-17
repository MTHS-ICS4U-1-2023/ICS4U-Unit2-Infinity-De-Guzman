/*
 * Class that defines bike.
 *
 * @author  Infinity de Guzman
 * @version 1.0
 * @since   2024-06-13
 */

import { Vehicle } from "./Vehicle"

export class Bike extends Vehicle {
  private cadense: number

  // variables
  constructor(color: string, maxSpeed: number) {
    super(color, maxSpeed)
    this.cadense = 0
    this.numberOfTires = 2
  }

  //set current speed
  public set cadense(cadense: number) {
    this.cadense = cadense
  }

  //get current speed
  public get cadense() {
    return this.cadense
  }

  //get current speed
  public get speed() {
    return this.cadense * 2
  }

  // checks if stack is empty
  public status() {
    super.status()
    console.log(" -> Cadense: " + this.cadense)
  }

  // change speed via bike accelerating formula
  public accelerate (appliedPower: number) {
    this.cadense = this.cadense + appliedPower
  }

  public Ring_Bell() {
    console.log("Ding ding!\n")
  }
}
