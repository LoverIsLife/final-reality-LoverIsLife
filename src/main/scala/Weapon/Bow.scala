package src.main.scala.Weapon

import src.main.scala.Person.Person

/**
 * The `Bow` class represents a type of weapon called Bow in the game.
 *
 * @param name   The name of the Bow.
 * @param atk    The attack power of the Bow.
 * @param weight The weight of the Bow.
 * @param owner  An optional owner of the Bow, typed as `Option[Person]`.
 */
class Bow (name: String, atk: Int,
           weight: Int, owner: Option[Person])extends CommonWeapon(name, atk, weight, owner){
  //弓

}
