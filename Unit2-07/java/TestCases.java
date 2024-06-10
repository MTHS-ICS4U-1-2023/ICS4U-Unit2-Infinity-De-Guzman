/*
* This is the TestCases class.
*
* @author  Infinity de Guzman
* @version 1.0
* @since   2024-06-08
*/

/**
* This is the TestCases class.
*/
public final class TestCases {
    /**
    * Constructor.
    */
    private TestCases() {
    }

    /**
    * Main.
    *
    * @param args no arguments
    */
    public static void main(String[] args) {
        // Constants
        final double speed1 = 10;
        final double speed2 = 15;
        final String speedText = "New speed: ";

        // Add BMX bike
        final Bike bmx = new Bike("Red", 40);
        System.out.println("Created Bmx bike.\nStatus:");
        System.out.println(bmx.getStatus());

        System.out.println("\nSet the cadense to 10");
        bmx.setCadence(speed1);
        System.out.println(bmx.getStatus());

        System.out.println("\nAccelerate by 15:");
        bmx.accelerate(speed2);
        System.out.println(bmx.getStatus());

        System.out.println("\nRinging bell.");
        bmx.ringBell();

        // Add big truck
        final Truck bigTruck = new Truck("Grey", 200, "HGC-3456F");

        System.out.println("Created a Truck.\nStatus:");
        System.out.println(bigTruck.getStatus());

        System.out.println("\nAccelerating, 10 of power for ten seconds:");
        bigTruck.accelerate(speed1, speed1);
        System.out.println(speedText + bigTruck.getSpeed());

        System.out.println("\nBreaking, 10 of power for 10 sec.");
        bigTruck.accelerate(speed1, speed1);
        System.out.println(speedText + bigTruck.getSpeed());

        System.out.println("\nApplyed air pressure of 10:");
        bigTruck.applyAir(speed1);
        System.out.println(speedText + bigTruck.getSpeed());

        System.out.println("\nDone.");
    }
}
