class A {
    def f(x: Int): Int = x - 1
}

class B extends A {
    override def f(x: Int): Int = x * 3
}

class C extends B {
    override def f(x: Int): Int = x * 2
}

class D extends C {
    // inherits f from C
}

val x: List[Int] = {
    val l: List[A] = List(new B, new C, new D)
    for(e <- l) yield e.f(5)
}


What is the value of x ?
 A List(15, 10, 3)
 B List(4, 4, 4)
 C List()
 D List(15,10,10)

(D)
