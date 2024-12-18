val f = l => l.map(_.map(_ + 1).sum).filter(_ % 2 == 0).sum

 A List[List[Int]] => Int <-
 B List[Int] => Int
 C List[Int] => List[Int]
 D List[List[Int]] => List[Int]