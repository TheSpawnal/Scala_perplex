
val l = (x => x.filter(_.length > 3).flatMap(_.map(_+1)).filter(_ <= 2))

what is the type of l ?

 A List[List[Int]] => List[Int] @
 B List[Int] => List[Int]
 C List[List[Int]] => Int
 D List[List[Int]]
 E List[Int]
 F
 List[Int] => Int