object Main {
  class A { def x: String = "A" }
  class B extends A { override def x: String = "B" }
  class C extends B { override def x: String = "C" }

  def over(a: Any) = "Anything"
  def over(a: A) = "A"
  def over(a: B) = "B"
  def over(a: C) = "C"

  def main(args: Array[String]): Unit = {
    val a: A = new C
    val r = (over(a), a.x)
    println(r)
  }
}


What does main print?
 A (A,C)
 B (C,C)
 C (B,B)
 D (C,A)
 E (A,A)

(A)
