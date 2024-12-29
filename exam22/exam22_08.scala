
class A{
    def x: String = y + "- A"
    def y: String = "A"
}

class B extends A{
    override def x: String = super.x + "- B"
    override def y: String = "B"
}

class C extends B{
    override def x: String = super.x
    override def y: String = "C"
}

def main(args: Array[String]): Unit = {
    print(new B().x)
    print(",")
    print(new C().x)
}


What does main print?
 A/ B-A-B, C-A-B  
 B/ A-A-B, A-B-A
 C/ A-A-A, A-A-A
 D/ A-A-B, B-A-B
