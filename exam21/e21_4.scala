class D(var f: Int => Int) {
 class B(var g: Int => Int) {
   def increase(): Unit = {
     val h = f
     f = x => h(g(x))
   }
 }
}

object Nested {
 def main(args: Array[String]): Unit = {
   val a: D = new D(_ + 1)
   val b: a.B = new a.B(_ * 2)
   b.increase()
   val c: a.B = new a.B(_ - 1) 
   c.increase()
   println(a.f(3))
 }
}

What does Nested.main() print?
 A 8
 B 4
 C 3
 D 5
 E 6

(D)
