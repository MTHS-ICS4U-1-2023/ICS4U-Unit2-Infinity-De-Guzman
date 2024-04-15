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
console.log("jewels: " + jewels.showStack())

let pokemon = new InfinStack()
pokemon.push("oshawott")
pokemon.push("pichu")
pokemon.push("wobbuffet")
console.log("pokemon: " + pokemon.showStack())

let colours = new InfinStack()
colours.push("aquamarine")
colours.push("indigo")
colours.push("teal")
console.log("colours: " + colours.showStack())

console.log("\nDone.")

