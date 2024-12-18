

abstract class A(var x: Int){
    def a(y : Int): Unit = x += y
    def b() : Unit
    final def c() : Unit = {b ; b}
}

final class B(xi: Int) extends A(xi){
    override def a(y : Int) : Unit = x -= y
    override def c() : Unit = {b (); b(); b() }
}

class C() extends B(5){
    def b() : Unit = println("Hello!")
}

object E {
    val x: A = new B()
    val y :A = new A()
}


Which errors will be reported on the above code? Select 1 or more
 A Cannot declare final method in non-final class 
 B Class A must either be declared abstract or implement abstract member
 C Cannot override final member <-
 D Cannot instantiate final class
 E Class B must either be declared abstract or implement abstract member<-
 F Cannot subclass final class <-
 G Cannot instantiate abstract class <-