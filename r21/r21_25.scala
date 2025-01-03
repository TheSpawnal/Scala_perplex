class X(var b: Boolean) {
  def this() = this(true)
  def value: Int = if(b) 6 else 3
  def increase(): Unit = b = !b
}
object Identity {
  def main(args: Array[String]): Unit = {
    val arr = new Array[X](8)
    val b = new X()
    for(i <- arr.indices) {   
      arr(i) = if(i % 2 == 0) b else new X()
    }
    for(a <- arr) a.increase()
    println(arr(6).value + arr(7).value)
  }
}

What does Identity.main() print?
 A 6
 B 13
 C 9
 D 12


(C)