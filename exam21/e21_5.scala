import scala.collection.immutable.Map

sealed abstract class Truthy
case object True extends Truthy
case object False extends Truthy
case object Maybe extends Truthy

object MMap {
 def truths: List[Truthy] = List(False, Maybe, True)
 
 def and(a: Truthy, b: Truthy): Truthy = {
   if(a == False || b == False) False
   else if(a == Maybe || b == Maybe) Maybe
   else True
 }

 def main(args: Array[String]): Unit = {
   val andM: Map[(Truthy,Truthy), Truthy] = 
     (for(i <- truths; j <- truths) yield ((i,j),and(i,j))).toMap
   var andN = andM
   andN = andM.updated((Maybe,Maybe), False)
   val andP = andN.updated((Maybe,Maybe), True)
   println(andM((Maybe,Maybe)))
 }
}

 What does MMap.main print?
 A True
 B Maybe
 C False

(B)
