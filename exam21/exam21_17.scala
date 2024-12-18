

trait a 
trait b
trait h
trait i

class c extends h
class d extends c with a with b with i
class e extends c with i
class f extends e with a
class g extends e with b

val l = List(new g(), new f(), new d())

What types does l have? Select zero or more.
 A List[Any] @
 B List[A]
 C List[E]
 D Any @
 E List[C] @
 F List[B]
 G List[D]