package src.main.scala.Weapon

import src.main.scala.Person.Person

/**
 * The `Sword` class represents a type of weapon called Sword in the game.
 *
 * @param name   The name of the Sword.
 * @param atk    The attack power of the Sword.
 * @param weight The weight of the Sword.
 * @param owner  An optional owner of the Sword, typed as `Option[Person]`.
 */
class Sword (name: String, atk: Int,
             weight: Int, owner: Option[Person])extends CommonWeapon(name, atk, weight, owner){
  //剑

}
