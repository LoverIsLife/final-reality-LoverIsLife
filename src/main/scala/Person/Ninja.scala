package Person

import Weapon.Weapon

/**
 * The `Ninja` class represents a character of the Ninja profession in the game.
 *
 * @param name   The name of the Ninja.
 * @param hp     The hit points (health) of the Ninja.
 * @param armor  The armor value of the Ninja.
 * @param weight The weight of the Ninja.
 * @param weapon An optional weapon held by the Ninja, typed as `Option[Weapon]`.
 */
class Ninja (name: String, hp: Int, armor: Int,
             weight: Int, weapon: Option[Weapon])extends Jobs(name, hp, armor, weight, weapon){

}
