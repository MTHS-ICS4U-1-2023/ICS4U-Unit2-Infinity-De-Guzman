/**
 * author   Infinity de Guzman
 * version  1.0
 * since    2024-04-03
 */
export class InfinStack {
  // constructor
  constructor() {
    this.stackAsList = []
  }

  // This method returns the stack as a string.
  public get showStack() {
    let stackValues = ""
    for (let counter = 0; counter < this.stackAsList.length; counter++) {
      stackValues = stackValues + this.stackAsList[counter] + ", "
    }
    stackValues = stackValues.substring(0, stackValues.length-2)
    return stackValues
  }

  // This method pushes a string onto the stack.
  public push(input) {
    this.stackAsList.push(input)
  }
  
  // This method pops a string from the stack.
  public itemPop() {
    let popItem = ""
    if (this.stackAsList[0]) {
      popItem = this.stackAsList[this.stackAsList.length - 1]
    } else {
      popItem = "nothing to remove"
    }
    this.stackAsList.splice(-1)
    return popItem
  }
}

