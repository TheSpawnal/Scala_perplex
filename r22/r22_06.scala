consider the following function 
def b[A,B](a: A => B, b: Any): Nothing = throw new Error("bla")
and classes 
class A
class B extends A
 Which of the following calls to b would NOT give a type error? 
(Tip: Fill in type arguments first, then check subtyping.)
 A b[Int,Int](x => x, 3)
 B b[B,A]((x : A) => x, false)
 C b[A,A]((x : B) => x, "foo") b 
D b[A,B]((x : A) => x, 3.0)


(A,B)
