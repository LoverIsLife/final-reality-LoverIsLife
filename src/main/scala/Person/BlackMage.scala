package src.main.scala.Person

import src.main.scala.Weapon.Weapon
/**
 * The `BlackMage` class represents a character of the Black Mage profession in the game.
 *
 * @param name   The name of the Black Mage.
 * @param hp     The hit points (health) of the Black Mage.
 * @param armor  The armor value of the Black Mage.
 * @param weight The weight of the Black Mage.
 * @param weapon An optional weapon held by the Black Mage, typed as `Option[Weapon]`.
 * @param mp     The magic points (mana) of the Black Mage.
 */
class BlackMage (name: String, hp: Int, armor: Int,
                 weight: Int, weapon: Option[Weapon], var mp: Int) extends Jobs(name, hp, armor, weight, weapon){
}
