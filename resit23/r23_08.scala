class X(val x: Int) {
  def p(): Int = {
    print("Hello ")
    x + 2
  }

  lazy val q: Int = {
    print("Hiya ")
    x + 1
  }
}

def main(args: Array[String]): Unit = {
  val n = new X(1)
  val m = new X(2)
  var res = 0
  res += n.p()    // First access
  res += n.q      // First access of n.q
  res += n.p()    // Second access
  res += n.q      // Second access of n.q
  res += m.q      // First access of m.q
  print(res)
}

 What is the output of main?
 A Hello Hiya 13
 B Hello Hiya Hello Hiya Hiya 13
 C Hello Hiya Hiya 13
 D Hello Hiya Hello Hiya 13

(D)
