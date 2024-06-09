/*
* This is the standard jet class.
*
* @author  Infinity de Guzman
* @version 1.0
* @since   2024-06-08
*/

/**
* This is the jet class.
*/
public class Jet extends Airplane {
    /** Jet speed change multiplier. */
    private static final int MULTIPLIER = 2;

    /**
    * Constructor.
    */
    public Jet() {
        // Default constructor
    }

    /**
    * Set jet speed.
    *
    * @param speed set speed
    */
    @Override
    public void setSpeed(int speed) {
        super.setSpeed(speed * MULTIPLIER);
    }

    /**
    * Double speed.
    */
    public void accelerate() {
        super.setSpeed(super.getSpeed() * 2);
    }
}
