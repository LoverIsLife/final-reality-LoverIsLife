package src.main.scala



/**
 * The `src.main.scala.Enemy` class represents an enemy character in the game.
 *
 * @param name   The name of the enemy.
 * @param hp     The hit points (health) of the enemy.
 * @param armor  The armor value of the enemy.
 * @param weight The weight of the enemy.
 * @param atk    The attack power of the enemy.
 */
class Enemy (var name: String,var hp: Int, var armor: Int,var weight: Int,var atk: Int) extends Enemies {
  def enemy_team(enemies: List[Enemy]): Unit ={
    var enemy_list = enemies
    var team = List[Enemy]()
    if (enemy_list.length > 5) {
      team = enemy_list.take(5)
      enemy_list.drop(5)
    }else{
      team = enemy_list.take(5)
    }
    while(team.length <5 && enemy_list.nonEmpty){
        val nextEnemy = enemy_list.head
        team = team :+ nextEnemy
        enemy_list = enemy_list.tail
    }
  }
}

