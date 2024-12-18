

class Fruit 
class Apple extends Fruit
class JonaGold extends Apple
class Pear extends Fruit

def gId[A](x: A): A = x
def gfId[A <; Fruit](x: A) : A = x
def nId(x: Any) : JonaGold = new JonaGold

val l = List(gfId(nId(new Pear)),
    gfId(new JonaGold),
    gId(new JonaGold))

What is the (most specific) type of l?
 A List[Fruit]
 B List[Any]
 C List[Apple]
 D List[JonaGold] <-
 E List[Pear]