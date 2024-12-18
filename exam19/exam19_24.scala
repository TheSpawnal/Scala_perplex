

abstract class Animal {
    def makeSound: String
}
class Dog extends Animal{
    def makeSound = bark
    def bark = "woof"
}
val someAnimal: Animal = new Dog

def m : String = {
    someAnimal.bark
}

the above program will:
 A Give a type error in m: "bark is not defined on type Animal"<-
 B Give a type error in make sound in Dog: "cannot call subclass method bark from Dog in method makeSound inherited from Animal"
 C Result in m="woof"