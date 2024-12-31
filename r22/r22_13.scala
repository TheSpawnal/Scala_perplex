class A
class B extends A
class C extends B 
class D extends B
class E extends C

val l = (List(new C, new D, new E), List(new E, 3))

 What is the most specific type of l? (Tip: draw a diagram of the class hierarchy)
 A (List[A], List[B])
 B (List[B], List[Any])
 C (List[C], List[C])
 D (List[A], List[C])
 E (List[B],List[B])

(B)
