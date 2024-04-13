package Weapon

import Person.Person

/**
 * The `Wand` class represents a type of weapon called Wand in the game.
 *
 * @param name      The name of the Wand.
 * @param atk       The physical attack power of the Wand.
 * @param magic_atk The magical attack power of the Wand.
 * @param weight    The weight of the Wand.
 * @param owner     An optional owner of the Wand, typed as `Option[Person]`.
 */
class Wand (name: String, atk: Int, magic_atk: Int,
            weight: Int, owner: Option[Person])extends MagicWeapon(name, atk, magic_atk, weight, owner){
  //法杖

}
