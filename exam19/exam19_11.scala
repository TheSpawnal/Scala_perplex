
abstract class Animal
abstract class Mammal extends Animal
abstract class Pouched extends Mammal
class Kangaroo extends Pouched
class Koala extends Pouched
abstract class CatLike extends Mammal
class Puma extends CatLike
class Tiger extends CatLike

def x(c: Boolean) =
    if(c) (new Kangaroo, new Tiger)
    else(new Koala, new Kangaroo)

 What is the most specific return type of x?
 A (Mammal,Mammal)
 B (Animal,Animal)
 C (Pouched, Animal)
 D (Pouched,Mammal) <- 