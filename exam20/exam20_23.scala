

trait LaysEggs
trait CanFly

class Animal
class Bird extends Animal with LaysEggs with CanFly
class Mammal extends Animal
class Platypus extends Mammalwith LaysEggs
class Bat extends Mammal with CanFly

val l = List(new Bat, new Platypus, new Bird)

What types does l have? Select 0 or more
 A List[Mammal]
 B List[CanFly]
 C List[LaysEggs]
 D List[Animal] <-
 E List[Bat,Platypus,Bird]
 F
 List[Any] <-
 G Any <-