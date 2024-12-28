trait A
trait B
trait C
trait D
trait E extends A
trait F extends C with D
class G extends E with F
class H extends B with D
class I extends F with B

val l = List(new G, new H, new I)

What types does the list l have? Tip: Draw a diagram! Choose ​1 or more.
 A List[D]
 B List[Any]
 C List[A]
 D List[B]
 E List[C]
 F Any
 G Nothing

(A,B,F)
