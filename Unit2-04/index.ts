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
console.log("peak: " + jewels.peak)
console.log("popped: " + jewels.itemPop())
console.log("jewels: " + jewels.showStack)
jewels.clear()
console.log("Clearing stack...")
console.log("jewels: " + jewels.showStack)
console.log("")

let pokemon = new InfinStack()
pokemon.push("oshawott")
pokemon.push("pichu")
pokemon.push("wobbuffet")
console.log("pokemon: " + pokemon.showStack)
console.log("popped: " + pokemon.itemPop())
console.log("popped: " + pokemon.itemPop())
console.log("pokemon: " + pokemon.showStack)
console.log("peak: " + pokemon.peak)
console.log("pokemon: " + pokemon.showStack)
pokemon.clear()
console.log("Clearing stack...")
console.log("pokemon: " + pokemon.showStack)
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
console.log("peak: " + colours.peak)
console.log("colours: " + colours.showStack)
colours.clear()
console.log("Clearing stack...")
console.log("colours: " + colours.showStack)
console.log("")

console.log("\nDone.")

