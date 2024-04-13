package Person

import Weapon.Weapon
/**
 * Abstract class `Jobs` represents the professions in the game, extending the `Person` class.
 *
 * @param name   The name of the profession.
 * @param hp     The hit points (health) of the profession.
 * @param armor  The armor value of the profession.
 * @param weight The weight of the profession.
 * @param weapon An optional weapon held by the profession, typed as `Option[Weapon]`, indicating the possibility of having a weapon or not.
 */
abstract class Jobs (var name: String,var hp: Int,var armor: Int,
                     var weight: Int, var weapon: Option[Weapon]) extends Person{

  /**
   * Checks if the profession has a weapon to initiate an attack.
   *
   * @param person The target person to attack.
   * @return True if the profession holds a weapon, false otherwise.
   */
  def weapon_state(person: Person): Boolean = {
    if (person.weapon.isDefined) {
      true
    } else {
      println("Couldn't attack because doesn't have weapon yet")
      false
    }
  }

}
  def weapon_state(person: Person): Boolean= {
    if (person.weapon.isDefined) {
      return true
    }
    else {
      println("Couldn't attack because doesn't have weapon yet")
      return false
    }
  }

}
