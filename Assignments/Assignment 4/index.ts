/**
 * The main file to prompt user input and interact with the Triangle class.
 * By:      Infinity de Guzman
 * Version: 1.0
 * Since:   2024-05-30
 */

import { createPrompt } from 'bun-promptx'

function printPatternRecursively(num: number, currentRow: number = 1, currentColumn: number = 1): void {
    if (currentRow > num) {
        return;
    }

    // Print the current number
    process.stdout.write(`${currentColumn} `);

    // Add a newline after each integer greater than 5
    if (currentColumn > 5) {
        console.log();
    }

    // Move to the next column
    if (currentColumn === currentRow || currentColumn === 1) {
        // Start a new row
        printPatternRecursively(num, currentRow + 1, 1);
    } else {
        // Continue the current row
        printPatternRecursively(num, currentRow, currentColumn + 1);
    }
}

// Function to print the pattern for a given positive integer n
function printPattern(num: number): void {
    if (num < 1) {
        console.log("Error: Input must be a positive integer greater than or equal to 1.");
        return;
    }

    // Print the pattern recursively
    printPatternRecursively(num);
}

// Example usage:
// Function to get valid user input
function getInput(promptText: string): number {
    const prompt = createPrompt(promptText)
    const value = parseFloat(prompt.value)
    if (isNaN(value) || value < 0) {
        console.log("Invalid input.")
        process.exit(1)  // Exit the program if the input is invalid
    }
    return value
}

// Prompting the user for the sides of the triangle
const userInput = getInput("Enter a number: ")
printPattern(userInput);
