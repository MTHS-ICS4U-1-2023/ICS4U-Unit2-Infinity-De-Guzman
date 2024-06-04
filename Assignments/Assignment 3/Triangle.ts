/**
 * Triangle class definition.
 * By:      Infinity de Guzman
 * Version: 1.0
 * Since:   2024-05-30
 */

class Triangle {
    // Private data members (fields)
    private sideA: number
    private sideB: number
    private sideC: number

    // Constructor
    constructor(sideA: number, sideB: number, sideC: number) {
        this.sideA = sideA
        this.sideB = sideB
        this.sideC = sideC
    }

    // Getters
    public getSideA(): number {
        return this.sideA
    }

    public getSideB(): number {
        return this.sideB
    }

    public getSideC(): number {
        return this.sideC
    }

    // Private function to calculate perimeter
    private perimeter(): number {
        return this.sideA + this.sideB + this.sideC
    }

    // Public function to calculate semi-perimeter
    public semiPerimeter(): number {
        return this.perimeter() / 2
    }

    // Public function to check if the triangle is valid.
    // A triangle is valid if the sum of two sides is
    // greater than the third side.
    public isValid(): boolean {
        return (
            this.sideA + this.sideB > this.sideC &&
            this.sideA + this.sideC > this.sideB &&
            this.sideB + this.sideC > this.sideA
        )
    }

    // Public function to calculate the area using Heron's formula
    public area(): number {
        if (!this.isValid()) {
            return -1
        }
        const semi = this.semiPerimeter()
        return Math.sqrt(semi * (semi - this.sideA) * (semi - this.sideB) * (semi - this.sideC))
    }

    // Public function to get the type of the triangle
    public getType(): string {
        if (!this.isValid()) {
            return "Invalid triangle"
        }

        const aSquared = this.sideA ** 2
        const bSquared = this.sideB ** 2
        const cSquared = this.sideC ** 2

        if (this.sideA === this.sideB && this.sideB === this.sideC) {
            return "Equilateral triangle"
        } else if (
            aSquared + bSquared === cSquared ||
            aSquared + cSquared === bSquared ||
            bSquared + cSquared === aSquared
        ) {
            return "Right angle triangle"
        } else if (this.sideA === this.sideB || this.sideA === this.sideC || this.sideB === this.sideC) {
            return "Isosceles triangle"
        } else {
            return "Scalene triangle"
        }
    }

    // Public function to calculate an angle given the angle number (1, 2, or 3)
    public angle(angleNumber: number): number {
        if (!this.isValid()) {
            return -1
        }

        let angle: number

        switch (angleNumber) {
            case 1:
                angle = this.calculateAngle(this.sideB, this.sideC, this.sideA)
                break
            case 2:
                angle = this.calculateAngle(this.sideA, this.sideC, this.sideB)
                break
            case 3:
                angle = this.calculateAngle(this.sideA, this.sideB, this.sideC)
                break
            default:
                return -1
        }

        return angle
    }

    // Private function to calculate an angle using the cosine rule
    private calculateAngle(side1: number, side2: number, oppositeSide: number): number {
        return Math.acos((side1 ** 2 + side2 ** 2 - oppositeSide ** 2) / (2 * side1 * side2))
    }

    // Public function to calculate the height of the triangle from a given side
    public height(fromSide: number): number {
        const area = this.area()
        if (area === -1) {
            return -1
        }
        return (2 * area) / fromSide
    }

    // Public function to calculate the radius of the circumcircle
    public circumcircleRadius(): number {
        if (!this.isValid()) {
            return -1
        }
        return (this.sideA * this.sideB * this.sideC) / (4 * this.area())
    }

    // Public function to calculate the radius of the incircle
    public incircleRadius(): number {
        if (!this.isValid()) {
            return -1
        }
        return this.area() / this.semiPerimeter()
    }
}

export default Triangle
