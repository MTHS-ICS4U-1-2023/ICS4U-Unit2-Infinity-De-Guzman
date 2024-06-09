/*
* This is the main code that runs with the Airplane and Jet class.
*
* @author  Infinity de Guzman
* @version 1.0
* @since   2024-06-08
*/

/**
* This is the FlyTest class.
*/
public final class FlyTest {
    /**
    * Constructor.
    */
    private FlyTest() {
        // Prevent instantiation
    }

    /**
    * Set jet speed.
    *
    * @param args no arguments
    */
    public static void main(String[] args) {
        final int speed1 = 212;
        final int speed2 = 422;
        final int iterations = 4;
        final int fivethousand = 5000;

        final Airplane biplane = new Airplane();
        biplane.setSpeed(speed1);
        System.out.println(biplane.getSpeed());
        final Jet boeing = new Jet();
        boeing.setSpeed(speed2);
        System.out.println(boeing.getSpeed());
        int iterator = 0;
        while (iterator < iterations) {
            boeing.accelerate();
            System.out.println(boeing.getSpeed());
            if (boeing.getSpeed() > fivethousand) {
                biplane.setSpeed(biplane.getSpeed() * 2);
            } else {
                boeing.accelerate();
            }
            iterator++;
        }
        System.out.println(biplane.getSpeed());
    }
}
