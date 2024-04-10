/*
 * Starting point for the standard Main.java
 *
 * @author    Infinity de Guzman
 * @version   1.0
 * @since     2024-04-09
 */

/**
 * This is the main program.
 */
final class Main {
    /**
     * To prevent instantation.
     * Throw an exception IllegalStateException
     * when called.
     *
     * @throws IllegalStateException if this is attempted.
     */
    private Main() {
        throw new IllegalStateException("You cannot instantiate this.");
    }

    /**
     * The starting main function.
     *
     * @param args no args will be used
     */
    public static void main(String[] args) {
        final InfinStack jewels = new InfinStack();
        jewels.push("garnet");
        jewels.push("amethyst");
        jewels.push("sapphire");
        System.out.println("jewels: " + jewels.showStack());

        final InfinStack pokemon = new InfinStack();
        pokemon.push("oshawott");
        pokemon.push("pichu");
        pokemon.push("wobbuffet");
        System.out.println("pokemon: " + pokemon.showStack());

        final InfinStack colours = new InfinStack();
        colours.push("aquamarine");
        colours.push("indigo");
        colours.push("teal");
        System.out.println("colours: " + colours.showStack());

        System.out.println("\nDone.");
    }
}

