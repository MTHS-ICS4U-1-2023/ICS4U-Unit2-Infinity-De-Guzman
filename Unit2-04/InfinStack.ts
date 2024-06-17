/**
 * The InfinStack Class.
 *
 * author  Infinity de Guzman
 * version 1.0
 * since   2024-03-26
 */

export class InfinStack {

  /*
  * The constructor for the InfinStack string stack class.
  */
  constructor() {
    this.stackAsList = []
  }

  /*
  * checks if stack is empty.
  */
  public get isEmpty() {
    return this.stackAsList.length == 0
  }

  /*
  * return top item of stack
  */
  public get peak():string {
    let peakedItem = ""
    if (this.stackAsList[0]) {
      peakedItem = this.stackAsList[this.stackAsList.length - 1]
    } else {
      peakedItem = "nothing to peak"
    }
    return peakedItem
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
    let values = ""
    for (let counter = 0; counter < this.stackAsList.length; counter++) {
      values = values + this.stackAsList[counter] + ", "
    }
    values = values.substring(0, values.length-2)
    return values
  }

  /*
  * clears the entire stack
  */
  public clear() {
    this.stackAsList = []
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
  public itemPop() {
    let itemPop = ""
    if (this.stackAsList[0]) {
      itemPop = this.stackAsList[this.stackAsList.length - 1]
    } else {
      itemPop = "nothing to remove"
    }
    this.stackAsList.splice(-1)
    return itemPop
  }
}

