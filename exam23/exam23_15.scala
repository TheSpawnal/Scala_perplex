


class List[+A]
class Printer[-A]
class Animal
class Bird extends Animal
class Ostrich extends Bird

what are subtypes of type : (select 1 or more)

List[Bird] => Printer[Bird]

 A List[Ostrich] => Printer[Ostrich]
 B List[Animal] => Printer[Ostrich]
 C List[Any] => Printer[Any] <-
 D List[Any] => Nothing <-
 E List[Animal] => Printer[Animal] <-

