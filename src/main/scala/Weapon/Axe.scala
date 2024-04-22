package src.main.scala.Weapon

import src.main.scala.Person.Person

/**
 * The `Axe` class represents a type of weapon called Axe in the game.
 *
 * @param name   The name of the Axe.
 * @param atk    The attack power of the Axe.
 * @param weight The weight of the Axe.
 * @param owner  An optional owner of the Axe, typed as `Option[Person]`.
 */
class Axe (name: String, atk: Int,
           weight: Int, owner: Option[Person])extends CommonWeapon(name, atk, weight, owner){
  //斧

}
