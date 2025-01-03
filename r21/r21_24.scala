class MutVar[A](var x: A)
sealed class Maybe[+A]
case class Some[A](v: A) extends Maybe[A]
case object None extends Maybe[A]
class Animal
class Dog extends Animal

 Given the above definition, which of the following are subtypes of:

 List[Maybe[MutVar[Animal]]

 ? Select 0 or more.
 
 A List[Maybe[MutVar[Dog]]]
 B List[Some[MutVar[Animal]]]
 C Nothing
 D List[None]