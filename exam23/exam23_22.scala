
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

What types does the list have? 
Tip: Draw a diagram! Select 1 or more

 A List[A]
 B Any <-
 C List[D] <-
 D List[Any] <-
 E Nothing
 F List[C]
 G List[B]