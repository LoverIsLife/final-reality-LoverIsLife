package Weapon

import Person.Person

/**
 * The `Weapon` trait represents a weapon in the game.
 */
/**trait Weapon {
  /**
   * The name of the weapon.
   */
 */
trait Weapon {
  var name: String

  /**
   * The physical attack power of the weapon.
   */
  var atk: Int

  /**
   * The weight of the weapon.
   */
  var weight: Int

  /**
   * An optional owner of the weapon, typed as `Option[Person]`.
   */
  var owner: Option[Person]
  //var magic_atk: Int

  /**
   * Checks if the weapon has an owner.
   *
   * @param weapon The weapon to check.
   * @return True if the weapon has an owner, false otherwise.
   */
  def owner_check(weapon: Weapon): Boolean

  /**
   * Checks if the person is eligible to wield the weapon based on their class.
   *
   * @param weapon The weapon to check.
   * @param person The person attempting to wield the weapon.
   * @return True if the person can wield the weapon based on their class, false otherwise.
   */
  def job_check(weapon: Weapon, person: Person): Boolean

}
