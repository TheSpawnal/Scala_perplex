
class Animal
class Mammal extends Animal
class Platypus extends Mammal

def f(a: Any) = "Its something"
def f(a: Animal) = "An ANimal"
def f(a: Mammal) = "A mammal"
def f(a: Platypus) = "A platypus"

def g = {
    val p : Mammal = new Platypus
    f(p)
}

What is the value of g?
 A "An animal!"
 B "A platypus!"
 C "A mammal!"<-
 D "Its something!"