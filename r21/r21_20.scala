

var p: Int = 4
var q: Int = 1
var c: Int = 0

def m1(p: Int): Int = {
  c += p + q   // modifies global c by adding p + q
  p - 3        // return value (not used)
}

def m2(q: Int): Int = {
  var p = q + 1  // local p, shadows global p
  m1(p)          // calls m1 with local p
}

def main(args: Array[String]): Unit = {
  val z = m2(p) + q + p  // m2(4) + 1 + 4
  c += z
  println(c)
}


 What does main print?
 A 7
 B 13
 C 11
 D 10

 (B)