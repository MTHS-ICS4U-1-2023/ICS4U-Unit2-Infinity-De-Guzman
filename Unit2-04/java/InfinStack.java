/*
* The Infinity Class.
*
* @author  Infinity de Guzman
* @version 1.0
* @since   2024-05-06
*/

import java.util.ArrayList;
import java.util.List;

/**
* The InfinStack() class.
*/
public class InfinStack {
    /**
    * Declares a private instance variable.
    */
    private List<String> stackAsList = new ArrayList<>();

    /**
    * Checks if stack is empty.
    *
    * @return true if the stack is empty, false otherwise
    */
    public boolean isEmpty() {
        return stackAsList.isEmpty();
    }

    /**
     * Returns top item of stack.
     *
     * @return the peaked string
     */
    public String peak() {
        final String peakedItem;
        if (!isEmpty()) {
            peakedItem = stackAsList.get(stackAsList.size() - 1);
        } else {
            peakedItem = null;
        }
        return peakedItem;
    }

    /**
    * Returns stack size.
    *
    * @return the size of the stack
    */
    public int size() {
        return stackAsList.size();
    }

    /**
    * The showStack() method.
    *
    * @return the values as a string
    */
    public String showStack() {
        String values = "";
        for (int counter = 0; counter < stackAsList.size(); counter++) {
            values += stackAsList.get(counter);
            if (counter < stackAsList.size() - 1) {
                values += ", ";
            }
        }
        return values;
    }

    /**
     * Clears the entire stack.
     */
    public void clear() {
        stackAsList.clear();
    }

    /**
    * The push() method.
    *
    * @param input from Main.java
    */
    public void push(String input) {
        stackAsList.add(input);
    }

    /**
    * This method pops a string from the stack.
    *
    * @return the popped string
    */
    public String itemPop() {
        final String popItem;
        if (!stackAsList.isEmpty()) {
            popItem = stackAsList.remove(stackAsList.size() - 1);
        } else {
            popItem = null;
        }
        return popItem;
    }
}

