
class Animal
class Mammal extends Animal
class Capybara extends Mammal

class SetFree[-A](a: A)

object FunkySub {
    def releaseFun(a : SetFree[Mammal => Mammal]) : Unit = ()
}
Which of the following calls will not result in a type error? Select 0 or more
A
FunkySub.releaseFun(new SetFree[Mammal=>Capybara](null)) 
B
FunkySub.releaseFun(new SetFree[Capybara=>Mammal](null)) 
C
FunkySub.releaseFun(new SetFree[Capybara=>Capybara](null))
D
FunkySub.releaseFun(new SetFree[Animal=>Animal](null))
E
FunkySub.releaseFun(new SetFree[Capybara=>Animal](null))
F
FunkySub.releaseFun(new SetFree[Animal=>Capybara](null))