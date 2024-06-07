/**
 * The main file to print a recursive pattern.
 * By:      Infinity de Guzman
 * Version: 1.0
 * Since:   2024-05-30
 */

import { createPrompt } from 'bun-promptx';

// Recursive function to calculate the nth Tribonacci number
function tribonacci(num, first, second, third) {
    if (num === 0) return first
    if (num === 1) return second
    if (num === 2) return third
    return tribonacci(num - 1, second, third, first + second + third)
}

// Function to print the first num Tribonacci numbers
function printTribonacci(num) {
    for (let counter = 0; counter < num; counter++) {
        process.stdout.write(tribonacci(counter, 0, 1, 1) + " ")
    }
    console.log()
}

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

    const userInput = getInput("Enter a number: ")
    printTribonacci(userInput)

