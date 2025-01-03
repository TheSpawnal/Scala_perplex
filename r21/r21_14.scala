class P(var x: Int) {
  class Q(var y: Int) {
    class R(var z: Int) {
      def addEm(): Int = {
        y += z    // Q's y is incremented by R's z
        x += y    // P's x is incremented by Q's y
        x         // Returns P's x
      }
    }
  }
}

object Nest {
  def main(args: Array[String]): Unit = {
    val p = new P(1)          // P with x = 1
    val q = p.Q(2)           // Q with y = 2
    val z = q.R(3)           // R with z = 3
    println(z.addEm())       // First call
    println(z.addEm())       // Second call
    val z2 = q.R(4)          // New R with z = 4
    println(z2.addEm())      // Third call
    val q2 = p.Q(5)          // New Q with y = 5
    val z3 = q2.R(6)         // New R with z = 6
    println(z3.addEm())      // Fourth call
  }
}


 What will Nest.main print?
 A 6 6 7 12
 B 6 14 26 37
 C 6 15 15 26
 D 6 12 17 20

 (B)