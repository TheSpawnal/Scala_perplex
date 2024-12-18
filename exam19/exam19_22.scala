
trait A {
    def a: String = "A"
    def b: String = a + a
}
trait B extends A{
    override def a = "B"
}
trait C extends A{
    override def a = "C"
}
class D extends B with C

val d: String = (new D).b

what is the value of d ?

A  "AA"
 B "BB"
 C "CC" <-