
class Animal {def speak: String = "<sound>"}
class Dog extends Animal { override def speak : String = "Woof"}
class Cat extends Animal { override def speak : String = "Miauw"}

def speak(x: Animal) : String = x.speak
def speak(x: Dog) : String = x.speak
def speak(x: Cat) : String = x.speak

def main(args: Array[String]): Unit = {
    var x : Animal = new Cat
    print(speak(x))
    x = new Dog
    print(speak(x))
    val y : Dog = new Dog
    print(speak(y))
    val z: Cat = new Cat
    print(speak(z))
}

What does main print?
 A <sound><sound><sound><sound>
 B <sound><sound>WoofMiauw
 C MiauwWoofWoofMiauw <-
 D MiauwWoof<sound><sound>