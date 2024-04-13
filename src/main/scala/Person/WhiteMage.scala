package Person

import Weapon.Weapon

/**
 * The `WhiteMage` class represents a character of the White Mage profession in the game.
 *
 * @param name   The name of the White Mage.
 * @param hp     The hit points (health) of the White Mage.
 * @param armor  The armor value of the White Mage.
 * @param weight The weight of the White Mage.
 * @param weapon An optional weapon held by the White Mage, typed as `Option[Weapon]`.
 * @param mp     The magic points (mana) of the White Mage.
 */
class WhiteMage (name: String, hp: Int, armor: Int,
                 weight: Int, weapon: Option[Weapon], var mp: Int) extends Jobs(name, hp, armor, weight, weapon){

}
