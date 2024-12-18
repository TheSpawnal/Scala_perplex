
trait hairy

class animal
class monkey extends animal with hairy

case class GBox[A](a: A)
case class hairyBox(a: hairy)
case class animalBox(a: animal)

val p = (GBox(new monkey).a, hairyBox(new monkey).a, animalBox(new monkey).a)

what types does p have ? select 1 or more

Any <-
Nothing
(monkey,hairy,animal) <-
(animal, hairy, animal) <-
(animal, monkey,animal)