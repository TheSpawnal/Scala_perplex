
trait X
trait Y
trait Z
trait P extends Y with Z

class A extends X
class B extends A with Z
class C extends A with P
class D extends P with X

val l = List(new B, new C, new D)

what types does l have ? 1 or more. tip : draw a diagram !

List[P]
List[Z]
List[Any]
List[Y]
List[A]
List[X] 


(B,C,F)
