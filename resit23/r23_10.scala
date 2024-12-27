class A(var x: Int) {
  final def a(y: Int): Unit = x += y   // final method in non-final class - this is allowed!
  def b(): Unit                        // abstract method without abstract class
  def c(): Unit = {
    b; b
  }
}

final class B(xi: Int) extends A(xi) {
  def b(): Unit = println("Hello!")    // Implements abstract method b()
}

abstract class C() extends B(5) {      // Cannot extend final class B
  override def b(): Unit = a(5)       
  override def c(): Unit = {
    b(); b(); b()
  }
}

object E {
  val x: A = new B(2)
  val y: A = new A(3)                 // Cannot instantiate class with abstract member
}

 Which errors will be reported on the above code? Choose 1 or more
 A Cannot call final method
 B Cannot subclass final class
 C Cannot override final member
 D Class A must either be declared abstract or implement abstract member
 E Cannot declare final method in non-final class

(B,D)
