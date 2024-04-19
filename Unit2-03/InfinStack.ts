/**
 * The InfinStack Class.
 *
 * author  Infinity de Guzman
 * version 1.0
 * since   2024-05-26
 */

export class InfinStack {

  /*
  * The constructor for the InfinStack string stack class.
  */
  constructor() {
    this.stackAsList = []
  }

  /*
  * Checks if stack is empty.
  */
  public get empty() {
    return this.stackAsList.length == 0
  }

  /*
  * returns stack size
  */
  public get size() {
    return this.stackAsList.length
  }
  
  /*
  * returns the stack as a string
  */
  public get showStack() {
    let stackValues = ""
    for (let counter = 0; counter < this.stackAsList.length; counter++) {
      stackValues = stackValues + this.stackAsList[counter] + ", "
    }
    stackValues = stackValues.substring(0, stackValues.length-2)
    return stackValues
  }

  /*
  * pushes a string onto the stack
  */
  public push(input) {
    this.stackAsList.push(input)
  }

  /*
  * pops a string from the stack
  */
  public popItem() {
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

