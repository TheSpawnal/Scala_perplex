
abstract class A{
    final def x : String = v + "." + v
    def v : String = "v"
    def y : String = x + "?"
}

class B extends A{
    override def v = "b"
}

class C extends B {
    override def y = "see"
}

object DD {
    def f(a : A) : String = a.y + a.v
    def main(args: Array[String]) : Unit = {
        println(List(new B, new C).map(f))
    }
}




Output of DD.main?

 A List(b.b?b,seeb)
 B List(v.v?v, v.v?v)
 C List(v.v?v, seeb)
 D List(v.v?v, seev)
 E List(v.v?b, seeb)

(A)


