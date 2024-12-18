

sealed abstract class Animal{
    def kingdom : String = "Animalia"
}

abstract class Mammal extends Animal{
    def speak() : String
    final def className : String = "Mammalia"
}

final class Dog extends Mammal {
    override def speak(): String = "Woof"
}

class Cat extends Mammal{}

final class Parrot extends Animal

which are true ? 0 or more

the class Cat can be extended outside this file

the class Animal could have concrete methods <-

the class Cat must implement the speak method <-

the class Parrot can be subclassed in this file

Parrot could override kingdom <-

Cat can override className