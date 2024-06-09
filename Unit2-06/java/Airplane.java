/*
* This is the standard airplane class.
*
* @author  Infinity de Guzman
* @version 1.0
* @since   2024-06-08
*/

/**
* This is the airplane class.
*/
public class Airplane {
    /** The internal variable that stores speed. */
    private int speed;

    /**
    * Constructor.
    */
    public Airplane() {
        // Default constructor
    }

    /**
    * Set an airplane speed.
    *
    * @param speed set speed
    */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
    * Get speed.
    *
    * @return current speed
    */
    public int getSpeed() {
        return speed;
    }
}
