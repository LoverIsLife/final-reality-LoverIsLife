import Person.Person

/**
 * The `Party` class represents a group of members in the game.
 *
 * @param members A list containing the members of the party, initially empty.
 */
class Party (var members: List[Any] = List()) {

  /**
   * Adds a member to the party if there are fewer than three members already.
   *
   * @param member An optional person to add to the party.
   */
  def add_member(member: Option[Person]): Unit={
    if (members.length < 3) {
      members = members :+ member
      println(s"Has been join to the party")
    }
    if (members.length == 3){
      println()
    }
  }

  /**
   * Checks if the party has been defeated.
   *
   * @return True if the party is still active, false if all members are defeated or if the party is empty.
   */
  def defeat_check(): Boolean={
    if (members.nonEmpty && members.forall(_.hp <= 0))  {
      println("You defeat")
      return false
    }
    if (members.isEmpty) {
      println("You have nobody to fight")
      return false
    }
    else{
      return true
    }
  }
}
