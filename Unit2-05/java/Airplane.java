/**
 * Airplane class.
 *
 * <p>This class represents an airplane with a speed attribute.
 * {@code null} is returned when no speed is set.
 *
 * @author Infinity de Guzman
 * @version 1.0
 * @since 2024-05-09
 */
public class Airplane {
    /**
     * The speed.
     */
    private int speed;

    /**
     * Constructor.
     * Sets the initial speed to 0.
     */
    public Airplane() {
        this.speed = 0;
    }

    /**
     * Sets the speed of the airplane.
     *
     * @param newSpeed the new speed to set
     */
    public void setSpeed(int newSpeed) {
        this.speed = newSpeed;
    }

    /**
     * Gets the speed of the airplane.
     *
     * @return the speed of the airplane, or {@code null} if not set
     */
    public int getSpeed() {
        return this.speed;
    }
}

