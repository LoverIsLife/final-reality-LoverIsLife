package Person

import Weapon.Weapon

/**
 * The `Paladin` class represents a character of the Paladin profession in the game.
 *
 * @param name   The name of the Paladin.
 * @param hp     The hit points (health) of the Paladin.
 * @param armor  The armor value of the Paladin.
 * @param weight The weight of the Paladin.
 * @param weapon An optional weapon held by the Paladin, typed as `Option[Weapon]`.
 */
class Paladin (name: String, hp: Int, armor: Int,
               weight: Int, weapon: Option[Weapon])extends Jobs(name, hp, armor, weight, weapon){

}
