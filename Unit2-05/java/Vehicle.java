public class Vehicle {
    private String colour;
    private String licensePlate;
    private final int numberOfDoors;
    private final int maxSpeed;
    private int speed;

    public Vehicle(String colour, String licensePlate, int numberOfDoors, int maxSpeed) {
        this.colour = colour;
        this.licensePlate = licensePlate;
        this.numberOfDoors = numberOfDoors;
        this.maxSpeed = maxSpeed;
        this.speed = 0;
    }

    public String getColour() {
        return colour;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public int getSpeed() {
        return speed;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public void status() {
        System.out.println(" -> Speed: " + speed);
        System.out.println(" -> Max Speed: " + maxSpeed);
        System.out.println(" -> Number Of Doors: " + numberOfDoors);
        System.out.println(" -> License Plate: " + licensePlate);
        System.out.println(" -> Colour: " + colour);
    }

    public void accelerate(int accPower, int accTime) {
        int acceleration = accPower * accTime;
        if (speed + acceleration <= maxSpeed) {
            speed += acceleration;
        } else {
            speed = maxSpeed;
        }
    }

    public void brake(int brakePower, int brakeTime) {
        int deceleration = brakePower * brakeTime;
        if (speed - deceleration >= 0) {
            speed -= deceleration;
        } else {
            speed = 0;
        }
    }
}

