

trait A
trait B
trait G

class C extends G
class D extends C with A with B
class E extends C with A
class F extends C with B

val l = List(new D, new E, new F)


 What types does l have? Select 0 or more.
 (Tip: Draw a diagram!)

 A List[Any] 
 B Any  
 C List[C] 
 D List[G] 
 E List[D]
 F List[A]
 G List[B]
 H Nothing
 I Null

(A,B,C,D)
