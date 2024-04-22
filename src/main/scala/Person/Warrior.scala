package src.main.scala.Person

import src.main.scala.Weapon.Weapon

/**
 * The `Warrior` class represents a character of the Warrior profession in the game.
 *
 * @param name   The name of the Warrior.
 * @param hp     The hit points (health) of the Warrior.
 * @param armor  The armor value of the Warrior.
 * @param weight The weight of the Warrior.
 * @param weapon An optional weapon held by the Warrior, typed as `Option[Weapon]`.
 */
class Warrior (name: String, hp: Int, armor: Int,
               weight: Int, weapon: Option[Weapon])extends Jobs(name, hp, armor, weight, weapon){

}
