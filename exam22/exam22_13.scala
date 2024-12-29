
class A{
    def x: String = "A"
}

class B extends A{
    override def x: String = "B"
}

class C extends B{
    override def x: String = "C"
}

def over(a: Any) : String = "Anything"
def over(a: A) : String = "A" + a.x
def over(a : B) :String = "B" + a.x 
def over(a: C) : String = "C" + a.x

def main(args: Array[String]): Unit= {
    val x: B = new C
    print(over(x))
}    

 What does main print?            
 A BC 
 B AA
 C CA
 D AC
 E Anything
 F BB

(A)
