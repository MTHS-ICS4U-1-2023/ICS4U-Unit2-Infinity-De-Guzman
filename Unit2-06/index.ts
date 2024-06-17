/*
* This is the main code that runs with the Airplane and Jet class.
*
* @author  Infinity de Guzman
* @version 1.0
* @since   2024-06-08
*/
import { Airplane } from "./Airplane"
import { Jet } from "./Jet"

/**
* This is the flytest class.
*/
class FlyTest {
    // Constructor -> setter
    private FlyTest() {
    }

    // Set jet speed.
    public static main() {
        let biplane = new Airplane()
        biplane.setSpeed(212)
        console.log(biplane.getSpeed())
        let boeing = new Jet()
        boeing.setSpeed(422)
        console.log(boeing.getSpeed())
        for (let counter = 0; counter < 4; counter++) {
            boeing.accelerate()
            console.log(boeing.getSpeed())
            if (boeing.getSpeed() > 5000) {
                biplane.setSpeed(biplane.getSpeed() * 2)
            } else {
                boeing.accelerate()
            }
        }
        console.log(biplane.getSpeed())
    }
}

FlyTest.main()
