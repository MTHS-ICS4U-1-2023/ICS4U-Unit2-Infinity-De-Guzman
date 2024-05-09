/*
 * Airplane class.
 *
 * @author  Infinity de Guzman
 * @version 1.0
 * @since   2024-05-09
 */

export default class Airplane {
    private speed: number
  
    /*
    * constructor
    */
    constructor() {
      this.speed = 0
    }
  
    /*
    * This method sets the speed
    */
    public set setSpeed(newSpeed: number) {
        this.speed = newSpeed
    }

    /*
    * This method gets the speed
    */
    public get getSpeed(): number {
      return this.speed
    }
}

