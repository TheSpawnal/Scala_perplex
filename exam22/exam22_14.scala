

class A 
class B extends A

def b[A, B](a: A => B, b : Nothing): Any = 3

Which of the following calls will not give a type error?
 A b[Int,Int](x => x, 3)
 B b[B,A]((x : A) => x, false)
 C b[A,A]((x : B) => x, "foo")
 D b[A,B]((x : A) => x, 3.0)
 E b[A,A]((x : A) => x, throw new Error("")) <-