given the following def: 
def replicate[A](n: Int, a : A) : Seq[A] =
  (0 until n).map(x => a)

what is type of f bellow: 
val f = x => x.flatten.flatMap(replicate(_,"g")).map(_+ "ood")

 A List[String] => List[Int]
 B List[String]
 C Int => List[List[String]]
 D List[Int] => List[String]
 E List[List[Int]] => List[String]

(E)
