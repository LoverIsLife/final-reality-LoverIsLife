package src.main.scala.Weapon

import src.main.scala.Person.Person

/**
 * The `Staff` class represents a type of weapon called Staff in the game.
 *
 * @param name      The name of the Staff.
 * @param atk       The physical attack power of the Staff.
 * @param magic_atk The magical attack power of the Staff.
 * @param weight    The weight of the Staff.
 * @param owner     An optional owner of the Staff, typed as `Option[Person]`.
 */
class Staff (name: String, atk: Int, magic_atk: Int,
             weight: Int, owner: Option[Person])extends MagicWeapon(name, atk, magic_atk, weight, owner){
  //法杖

}
