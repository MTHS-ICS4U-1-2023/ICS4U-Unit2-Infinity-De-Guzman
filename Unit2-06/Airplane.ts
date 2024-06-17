/*
* This is the standard airplane class.
*
* @author  Infinity de Guzman
* @version 1.0
* @since   2024-06-08
*/


// This is the airplane class.
export class Airplane {
    /** The internal variable that stores speed. */
    private speed: number

    // Constructor.
    public Airplane() {
    }

    // Set an airplane speed.
    public setSpeed(speed: number) {
        this.speed = speed
    }

    // Get speed.
    public getSpeed(): number {
        return this.speed
    }
}
