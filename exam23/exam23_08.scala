

class A { 
    def x : String = "ax" + y
    def y : String = "ay"
}

class B extends A {
    override def x: String = "b" + super.x
    override def y: String = "by"
}

class C extends B {
    override def y : String = "cy"
}

def main(args: Array[String]): Unit = {
    var v : A = new B()
    print(v.x + " ")
    v = new C()
    print(v.x)
}

What does main print?
 A axay axay
 B axby axcy
 C b:axay b:axay
 D b:axby b:axcy <-