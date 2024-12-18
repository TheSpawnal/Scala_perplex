

trait Winged{
    def flap(): Unit = println("Weee")
}

final abstract class Animal{
    final def speakTwice : String = speak + speak
    def speak: String
}

class Bird(val x: Int) extends Animal with Winged { 
    override def speakTwice = "tjislp" * x
    def upSpeak() : Unit = x += 1
}

class Penguin extends Bird(3){
    def speak = "so cold!"
}


What errors will be reported on the above code?
 A Cannot extend final class <-
 B Cannot override final method <-
 C Class must be declared or implement abstract member <-
 D Reassignment to val <-
 E Class cannot implement multiple traits
 F Class must implement abstract member from Trait
 G Class cannot extend Trait with Class