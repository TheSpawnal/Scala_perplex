
abstract class Pokemon {
    final def speak: String  = name + name
    def name : String = "poke"
}

class Pikatchu extends Pokemon {
    override def name : "pika"
}

class Raichu extends Pikatchu{
    override def name = "raichu"
}

def f(l: List[Pokemon]) = l.map(_.speak).foreach(print)

def g = {
    val p : List[Pikatchu] = List(new Pikatchu, new Raichu)
    f(p)
}

What does g print?
 A pokepokepokepoke
 B pikapikapikapika
 C pikapikaraichuraichu <-
 D pikapikapokepoke