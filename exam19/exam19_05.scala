
trait Loud

class Animal
class Mammal extends Animal
class Dog extends Mammal
class GreatDane extends Dog with Loud
class Poodle extends Dog

val WoezelEnPip = List(new GreatDane, new Poodle)


What types does WoezelEnPip have? (you can select multiple)
 A List[Poodle]
 B List[GreatDane]
 C List[Loud]
 D Any <-
 E List[Any] <-
 F List[Dog] <-
 G List[Mammal] <-
 H List[Animal] <-