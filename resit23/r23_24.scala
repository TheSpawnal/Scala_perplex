class A {
  def a : String = "a"
}

class B extends A {
  override def a : String = "b"
}

class E extends B {
  override def a : String = "e"
}

def f(l: List[B]): List[A] = l ++ List(new A)

val l = f(List(new B, new E))

 What is the value of l?
 A List("b","e","a")
 B List("b","b","a")
 C List("a","a","a")
 D List("b","b","b")

(A)
