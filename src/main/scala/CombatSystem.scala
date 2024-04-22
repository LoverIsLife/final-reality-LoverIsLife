package src.main.scala

import src.main.scala.Party
import src.main.scala.Enemy
import src.main.scala.Person.{Person, WhiteMage, BlackMage}
class CombatSystem{
  def battleOrder(party: Party, enemies: List[Enemy]): Unit = {
    //var the_enemy = enemy_team(enemies)
    var action_bar = Person.weight + 0.5 * Weapon.weight


  }

  //Deberia estar en Person
  def attack(attacker: Person): Unit ={
    if (attacker.isInstanceOf[Enemy]) {
      var target =
        target.hp -= (attacker.atk - target.armor)
    }else{
      if ((attacker.isInstanceOf[WhiteMage] && (attacker.weaponState(attacker))) {
        var target =

      } else{
        if (attacker.weaponState(attacker)){
          var target =
        }
      }
    }
  }

  def myTurn(person: Person): Unit= {
    println("$(Person.name) 's turn")
    //Enhancements & Enfeeblements: statusSettlement
    while (person.hp > 0) {
      if (person.isInstanceOf[Enemy]) {


      } else {


      }
    }
  }

  def resultCheck(party: Party, enemies: List[Enemy]): Unit={
    party.defeatCheck()
    if (enemies.forall(_.hp <= 0)){
      println("You won")
    }
  }

}
