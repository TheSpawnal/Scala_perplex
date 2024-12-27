class A {
  def f(x: Int): Int = x - 4
  def g(x: Int): Int = x - 3
}

class B extends A {
  override def g(x: Int): Int = x - 1
}

class C extends B {
  override def f(x: Int): Int = x + 5
}

def main(args: Array[String]): Unit = {
  var x: A = new C()
  print(x.g(2) + " ")    // First print
  x = new A()
  print(x.g(4) + " ")    // Second print
  x = new B()
  print(x.f(1))          // Third print
}


 What does main print?
 A 1 1 -3
 B-1 1 -3
 C 1 0 -3
 D 1 1 -2