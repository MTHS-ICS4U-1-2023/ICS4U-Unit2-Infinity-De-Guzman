/**
 * This is the standard index.ts starting point.
 *
 * author   Infinity de Guzman
 * version  1.0
 * since    2024-04-03
 */
import { InfinStack } from './InfinStack'

let jewels = new InfinStack()
jewels.push("garnet")
jewels.push("amethyst")
jewels.push("sapphire")
console.log("jewels: " + jewels.showStack)
console.log("popped: " + jewels.itemPop())
console.log("jewels: " + jewels.showStack)
console.log("length: " + jewels.size)
console.log("is empty: " + jewels.empty)
console.log("")

let pokemon = new InfinStack()
pokemon.push("oshawott")
pokemon.push("pichu")
pokemon.push("wobbuffet")
console.log("pokemon: " + pokemon.showStack)
console.log("popped: " + pokemon.itemPop())
console.log("popped: " + pokemon.itemPop())
console.log("pokemon: " + pokemon.showStack)
console.log("length: " + pokemon.size)
console.log("is empty: " + pokemon.empty)
console.log("")

let colours = new InfinStack()
colours.push("aquamarine")
colours.push("indigo")
colours.push("teal")
console.log("colours: " + colours.showStack)
console.log("popped: " + colours.itemPop())
console.log("popped: " + colours.itemPop())
console.log("popped: " + colours.itemPop())
console.log("popped: " + colours.itemPop())
console.log("colours: " + colours.showStack)
console.log("length: " + colours.size)
console.log("is empty: " + colours.empty)
console.log("")

console.log("\nDone.")

