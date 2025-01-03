

import scala.collection.mutable

sealed abstract class RoShamBo
case object Rock extends RoShamBo
case object Paper extends RoShamBo  
case object Scissors extends RoShamBo

object MMap2 {
  def main(args: Array[String]): Unit = {
    val beatMap: mutable.Map[(RoShamBo,RoShamBo), RoShamBo] = mutable.Map()
    beatMap.update((Paper, Scissors), Scissors)
    val bMap = beatMap
    bMap.update((Paper,Scissors), Paper)
    beatMap.update((Paper,Scissors), Rock)
    println(bMap.get((Paper,Scissors)))
  }
}

What does MMap2.main() print?
 A Rock
 B Scissors
 C Paper


 (A)