/*
* This is the standard jet class.
*
* @author  Infinity de Guzman
* @version 1.0
* @since   2024-06-08
*/

import { Airplane } from "./Airplane"

/**
* This is the jet class.
*/
export class Jet extends Airplane {
    /** Jet speed change multiplier. */
    private MULTIPLIER: number = 2

    // Constructor.
    public Jet() {
        // super()
    }

    // Set jet speed.
    public setSpeed(speed: number) {
        super.setSpeed(speed * this.MULTIPLIER)
    }

    // Double speed.
    public accelerate() {
        super.setSpeed(super.getSpeed() * 2)
    }
}
