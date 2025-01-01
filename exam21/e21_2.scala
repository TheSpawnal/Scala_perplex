object Scope {
 var a: Int = 1
 var b: Int = 3 
 var c: Int = 0

 def m1(b: Int): Int = {
   a = 5
   c += a + b
   b + 3
 }

 def m2(a: Int, d: Int): Int = {
   b = c
   val bp = m1(a - d)
   c += b + bp
   b + c
 }

 def main(args: Array[String]): Unit = {
   b = m1(a)
   a = m2(b, a)
   c += a
   println(c)
 }
}

A 42
 B 28
 C 21
 D 50


 (A)
