package src.main.scala.Weapon

import src.main.scala.Person.{Ninja, Person, WhiteMage, BlackMage}

/**
 * The `MagicWeapon` abstract class represents a type of weapon that incorporates magical attributes in the game.
 *
 * @param name      The name of the magic weapon.
 * @param atk       The physical attack power of the magic weapon.
 * @param magic_atk The magical attack power of the magic weapon.
 * @param weight    The weight of the magic weapon.
 * @param owner     An optional owner of the magic weapon, typed as `Option[Person]`.
 */
abstract class MagicWeapon (var name: String, var atk: Int, var magic_atk: Int,
                            var weight: Int,var owner: Option[Person]) extends Weapon {

  /**
   * Checks if the magic weapon has an owner.
   *
   * @param weapon The magic weapon to check.
   * @return True if the magic weapon has an owner, false otherwise.
   */
  override def owner_check(weapon: Weapon): Boolean={
    if (weapon.owner.isDefined) {
      true
    }
    else false
  }

  /**
   * Checks if the person is eligible to wield the magic weapon based on their class.
   *
   * @param weapon The magic weapon to check.
   * @param person The person attempting to wield the magic weapon.
   * @return True if the person can wield the magic weapon based on their class, false otherwise.
   */
  override def job_check(weapon: Weapon, person: Person): Boolean = {
    (weapon, person) match {
      case (wand: Wand, ninja: Ninja) => true
      case (wand: Wand, blackmage: BlackMage) => true
      case (wand: Wand, whitemage: WhiteMage) => true
      case (staff: Staff, blackMage: BlackMage) => true
      case (staff: Staff, whitemage: WhiteMage) => true
      case _ => false
    }
  }
}
