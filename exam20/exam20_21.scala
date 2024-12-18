

class A {
    def x: String = "x"
    def y: String = x + "." + x
}

class B extends A{
    override def x = ">"
    override def y : String = super.y+x
}

class C extends B {
    override def x = "X"
    override def y: String = x + super.y
}

 What is the result of (new C()).y ?
 A Xx.x>
 B X>.>>
 C XX.XX <-
 D xx.xx
 E Xx.x