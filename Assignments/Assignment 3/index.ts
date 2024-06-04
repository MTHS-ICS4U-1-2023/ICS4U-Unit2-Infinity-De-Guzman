/**
 * The main file to prompt user input and interact with the Triangle class.
 * By:      Infinity de Guzman
 * Version: 1.0
 * Since:   2024-05-30
 */

import { createPrompt } from 'bun-promptx'
import Triangle from './Triangle.ts'

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
const sideA = getInput("Enter side A (in mm): ")
const sideB = getInput("Enter side B (in mm): ")
const sideC = getInput("Enter side C (in mm): ")

// Creating a Triangle object
const triangle = new Triangle(sideA, sideB, sideC)

// Displaying the results
console.log('Created a triangle with sides: ', sideA, 'mm,', sideB, ' mm, and ', sideC, 'mm.')
console.log('Is the triangle valid? ', triangle.isValid())
console.log('Semi-perimeter: ', triangle.semiPerimeter(), 'mm.')
console.log('Area: ', triangle.area(), 'mm².')
console.log('Type: ', triangle.getType())
console.log('Angle 1: ', triangle.angle(1), 'rad')
console.log('Angle 2: ', triangle.angle(2), 'rad')
console.log('Angle 3: ', triangle.angle(3), 'rad')
console.log('Height from side A: ', triangle.height(sideA), 'mm.')
console.log('Height from side B: ', triangle.height(sideB), 'mm.')
console.log('Height from side C: ', triangle.height(sideC), 'mm.')
console.log('Circumcircle radius: ', triangle.circumcircleRadius(), 'mm.')
console.log('Incircle radius: ', triangle.incircleRadius(), 'mm.')
