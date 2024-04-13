package Weapon
import Person.{BlackMage, Ninja, Paladin, Person, Warrior, WhiteMage}

/**
 * The `CommonWeapon` abstract class represents a common type of weapon in the game.
 *
 * @param name   The name of the weapon.
 * @param atk    The attack power of the weapon.
 * @param weight The weight of the weapon.
 * @param owner  An optional owner of the weapon, typed as `Option[Person]`.
 */
abstract class CommonWeapon (var name: String, var atk: Int,
                             var weight: Int, var owner: Option[Person]) extends Weapon {

  /**
   * Checks if the weapon has an owner.
   *
   * @param weapon The weapon to check.
   * @return True if the weapon has an owner, false otherwise.
   */
  override def owner_check(weapon: Weapon): Boolean = {
    if (weapon.owner.isDefined) {
      true
    }
    else false
  }

  //override def job_check(weapon: Weapon, person: Person): Boolean ={
  //  if weapon.isInstanceOf[Sword] && (person.isInstanceOf[Paladin] || person.isInstanceOf[Warrior] ||
  //    person.isInstanceOf[Ninja] || person.isInstanceOf[BlackMage]) {
  //    return true
  //  }
  //  if weapon.isInstanceOf[Axe] && (person.isInstanceOf[Paladin] || person.isInstanceOf[Warrior]) {
  //    return true
  //  }
  //  if weapon.isInstanceOf[Bow] && (person.isInstanceOf[Ninja] || person.isInstanceOf[Warrior] || person.isInstanceOf[WhiteMage]) {
  //    return true
  //  }
  //  else {return false}
  //}

  /**
   * Checks if the person is eligible to wield the weapon based on their class.
   *
   * @param weapon The weapon to check.
   * @param person The person attempting to wield the weapon.
   * @return True if the person can wield the weapon based on their class, false otherwise.
   */
  override def job_check(weapon: Weapon, person: Person): Boolean = {
    (weapon, person) match {
      case (sword: Sword, paladin: Paladin) => true
      case (sword: Sword, warrior: Warrior) => true
      case (sword: Sword, ninja: Ninja) => true
      case (sword: Sword, blackMage: BlackMage) => true
      case (axe: Axe, paladin: Paladin) => true
      case (axe: Axe, warrior: Warrior) => true
      case (bow: Bow, ninja: Ninja) => true
      case (bow: Bow, warrior: Warrior) => true
      case (bow: Bow, whiteMage: WhiteMage) => true
      case _ => false
    }

  }
}
