

trait A 
trait B

class D extends A with B
class E extends D

class Printer[-A]

def pintPrinter(p : Printer[D]) : Unit = ()

Which of the following calls will not cause a type error? 
Select 1 or more

A:
printPrinter(new Printer[E])

B:
printPrinter(new Printer[Nothing])

C:
printPrinter(new Printer[A])

D:
printPrinter(new Printer[B])

E:
printPrinter(new Printer[Any])

(C,D,E)
