/*
* This is the standard Main.java starting point.
*
* @author  Infinity de Guzman
* @version 1.0
* @since   2024-05-06
*/

/**
* This is the Main program.
*/
final class Main {
    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException if instantiation is attempted
    */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(String[] args) {
        // constants
        final String jewelsString = "jewels: ";
        final String pokemonString = "pokemon: ";
        final String coloursString = "colours: ";
        final String poppedString = "popped: ";
        final String lengthString = "length: ";
        final String isEmptyString = "is empty: ";
        final String peakString = "peak: ";
        final String clearingStackString = "Clearing stack...";

        final InfinStack jewels = new InfinStack();
        jewels.push("garnet");
        jewels.push("amethyst");
        jewels.push("sapphire");
        System.out.println(jewelsString + jewels.showStack());
        System.out.println(peakString + jewels.peak());
        System.out.println(poppedString + jewels.popItem());
        System.out.println(jewelsString + jewels.showStack());
        jewels.clear();
        System.out.println(clearingStackString);
        System.out.println(jewelsString + jewels.showStack());
        System.out.println("");

        final InfinStack pokemon = new InfinStack();
        pokemon.push("oshawott");
        pokemon.push("pichu");
        pokemon.push("wobbuffet");
        System.out.println(pokemonString + pokemon.showStack());
        System.out.println(peakString + pokemon.peak());
        System.out.println(poppedString + pokemon.popItem());
        System.out.println(poppedString + pokemon.popItem());
        System.out.println(peakString + pokemon.peak());
        System.out.println(pokemonString + pokemon.showStack());
        pokemon.clear();
        System.out.println(clearingStackString);
        System.out.println(peakString + pokemon.peak());
        System.out.println("");

        final InfinStack colours = new InfinStack();
        colours.push("aquamarine");
        colours.push("indigo");
        colours.push("teal");
        System.out.println(coloursString + colours.showStack());
        System.out.println(peakString + colours.peak());
        colours.clear();
        System.out.println(clearingStackString);
        System.out.println(coloursString + colours.showStack());
        System.out.println("");

        System.out.println("\nDone.");
    }
}

