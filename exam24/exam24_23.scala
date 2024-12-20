
class List[+A]
class Printer[-A]
class Animal
class Bird extends Animal
class Ostrich extends Bird

def transformPrinter(f: Printer[Bird] => List[Bird]) : Unit = ()

which of the following calls will not give a type error ? 1 or more

transformPrinter(null: Printer[Nothing]=>List[Nothing])
transformPrinter(null: Printer[Ostrich]=> List[Animal])
transformPrinter(null: Printer[Animal]=>List[Animal])
transformPrinter(null: Printer[Ostrich]=>List[Ostrich])
transformPrinter(null: Any => Nothing)
transformPrinter(null: Printer[Animal]=>List[Ostrich])

(A,D,E)
