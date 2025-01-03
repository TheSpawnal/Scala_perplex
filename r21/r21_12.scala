trait LaysEggs
trait CanFly
class Animal
class Bird extends Animal with LaysEggs
class Hawk extends Bird with CanFly
class Dinosaur extends Animal with LaysEggs
class Velociraptor extends Dinosaur
class Giganotosaurus extends Dinosaur

sealed abstract class Maybe[+A]
case class Some[A](v: A) extends Maybe[A]
case object None extends Maybe[Nothing]

object LubEm {
  def v(b: Boolean) = {
    val la = List(None, Some(new Hawk))
    val lb = List(new Velociraptor, new Giganotosaurus)
    if (b) (la, Some(new Hawk))
    else (lb.map(Some(_)), None)
  }
}

 Which return types does v have (which types can you fill in as a return type for v without the compiler complaining)? Select 0
 or more
 A (List[Maybe[LaysEggs]], Maybe[CanFly]])
 B (List[Maybe[Dinosaur]]], Maybe[Bird])
 C (List[Maybe[LaysEggs]]], Maybe[LaysEggs])
 D (List[Maybe[Animal]], Maybe[Animal])
 E (List[Maybe[CanFly]]], Maybe[CanFly])
 F (List[Maybe[Any]]], Maybe[Any])