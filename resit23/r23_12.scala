class Animal
class Dog extends Animal
class Cat extends Animal

def speak(x: Animal) = "<sound>"
def speak(x: Dog) = "Woof"
def speak(x: Cat) = "Miauw"

def main(): Unit = {
  var x: Animal = new Cat
  print(speak(x))        // First print
  x = new Dog
  print(speak(x))        // Second print
  val y: Dog = new Dog
  print(speak(y))        // Third print
}

 What is the output of main?
 A <sound><sound><sound>
 B <sound><sound>Woof <-
 C MiauwWoofWoof
 D MiawWoof<sound>