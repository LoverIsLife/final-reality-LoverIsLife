package Person

import Weapon.Weapon

/**
 * The `Person` trait represents an entity in the game (maybe in the future).
 */
/**trait Person {
  /**
   * The name of the person.
   */
  var name: String

  /**
   * The hit points (health) of the person.
   */
  var hp: Int

  /**
   * The armor value of the person.
   */
  var armor: Int

  /**
   * The weight of the person.
   */
  var weight: Int

  /**
   * An optional weapon held by the person, typed as `Option[Weapon]`.
   */
  var weapon: Option[Weapon]

  /**
   * Checks if the person has a weapon to initiate an attack on another person.
   *
   * @param person The target person to attack.
   * @return True if the person holds a weapon, false otherwise.
   */
 */
trait Person{
  var name: String
  var hp: Int
  var armor: Int
  var weight: Int
  var weapon: Option[Weapon]
  //var mp: Int
  //var atk: Int
  def  weapon_state(person: Person): Boolean
  //def  skill(): Unit
}
