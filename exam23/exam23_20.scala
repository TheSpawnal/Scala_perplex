

class A {def a : String = "a"}
class B extends A {override def a : String = "b"}
class E extends B {override def a : String = "e"}

def f(l: List[A], r : List[B]): List[String] =
    l.map(_.a) ++ r.map(_.a)

val l = f(List(new B, new E), List(new B, new E))

 What is the value of l? 
 (l ++ r means the list where l and r are concatenated)
 A List("b","e","b","e") <-
 B List("a","a","a","a")
 C List("a","a","b","b")
 D List("a","a","b","e")