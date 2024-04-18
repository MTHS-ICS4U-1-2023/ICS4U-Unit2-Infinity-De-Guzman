/*
* This is the standard Main.java starting point.
*
* @author  Infinity de Guzman
* @version 1.0
* @since   2024-04-05
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
        final String poppedString = "popped: ";
        final String pokemonString = "pokemon: ";
        final String coloursString = "colours: ";

        final InfinStack jewels = new InfinStack();
        jewels.push("garnet");
        jewels.push("amethyst");
        jewels.push("sapphire");
        System.out.println(jewelsString + jewels.showStack());
        System.out.println(poppedString + jewels.itemPop());
        System.out.println(jewelsString + jewels.showStack());
        System.out.println("");

        final InfinStack pokemon = new InfinStack();
        pokemon.push("oshawott");
        pokemon.push("pichu");
        pokemon.push("wobbuffet");
        System.out.println(pokemonString + pokemon.showStack());
        System.out.println(poppedString + pokemon.itemPop());
        System.out.println(poppedString + pokemon.itemPop());
        System.out.println(pokemonString + pokemon.showStack());
        System.out.println("");

        final InfinStack colours = new InfinStack();
        colours.push("aquamarine");
        colours.push("indigo");
        colours.push("teal");
        System.out.println(coloursString + colours.showStack());
        System.out.println(poppedString + colours.itemPop());
        System.out.println(poppedString + colours.itemPop());
        System.out.println(poppedString + colours.itemPop());
        System.out.println(poppedString + colours.itemPop());
        System.out.println(coloursString + colours.showStack());

        System.out.println("\nDone.");
    }
}

