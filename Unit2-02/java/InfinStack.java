/*
* T'is the InfinStack Class.
*
* @author  Infinity de Guzman
* @version 1.0
* @since   2024-04-05
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
    * The push() method.
    *
    * @param input from Main.java
    */
    public void push(String input) {
        stackAsList.add(input);
    }

    /**
    * The showStack() method.
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

