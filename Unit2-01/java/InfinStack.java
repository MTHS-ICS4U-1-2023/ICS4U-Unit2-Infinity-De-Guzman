/*
 * This is the InfinStack.
 *
 * @author    Infinity de Guzman
 * @version   1.0
 * @since     2024-04-09
 */
import java.util.ArrayList;
import java.util.List;

/**
 * This is the class InfinStack.
 */
public class InfinStack {
    /**
     * Declares that the instance variable is private.
     */
    private List<String> stackAsList = new ArrayList<>();

    /**
     * The push method.
     *
     * @param input from Main.java
     */
    public void push(String input) {
        stackAsList.add(input);
    }

    /**
     * The showStack method.
     *
     * @return the stackValues as a string
     */
    public String showStack() {
        String stackValues = "";
        for (int counter = 0; counter < stackAsList.size(); counter++) {
            stackValues += stackAsList.get(counter);
            if (counter < stackAsList.size() - 1) {
                stackValues += ", ";
            }
        }
        return stackValues;
    }
}

