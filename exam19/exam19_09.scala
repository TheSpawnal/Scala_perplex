
abstract class A {
    def v : String = a + "x" + a
    def a : String = "a"
}

class B extends A {
    override def a = "b"
}

class C extends A {
    override def v = "ccc"
}

def x = {
    val l : List[A] = List(new B, new C)
    for(e<-l) print(e.v)
}

What will running x print?
 A bxbaxa
 B bxbccc <-
 C axaaxa
 D cccccc
