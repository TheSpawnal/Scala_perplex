
abstract class Animal
abstract class Mammal extends Animal
class Mouse extends Mammal
class Dog extends Mammal
class Cat extends Mammal

def aId(x: Any): Any = x
def gId[A](x: A) : A = x
def bId[A <: Mammal](x: A) : A = x

val x = List(aId(new Nouse()), gId(new Dog()), bId(new Cat()))

 What is the most specific type of x?
 A List[Any] <-
 B List[Mammal]
 C List[Animal]
 D Any