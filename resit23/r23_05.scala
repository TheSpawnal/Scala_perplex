

import scala.collection.immutable.Vector

def f(m: Vector[String]): Vector[String] = 
  m.updated(0, "Hi ").updated(1, "Everyone! ")

def main(args: Array[String]): Unit = { 
  var m1 = Vector("Hello ", "World ")
  val m2 = m1
  m1 = f(m2)
  print(m1(0) + m1(1))
  print(m2(0)+ m2(1))
}

what is printed when this program run ?

 A Hi Everyone! Hello World
 B Hello World Hello World
 C Hi Everyone! Hi Everyone!
 D Hi World Hello Everyone!
 E Hello World Hi Everyone!
