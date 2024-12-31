object Immutable2 {
    class A(var x: Int) {
        override def toString: String = x.toString
    }
    
    def f(m: Map[String, A]): Map[String, A] = m.updated("B", new A(6))
    
    def main(args: Array[String]): Unit = {
        val a = new A(3)
        var m1 = Map(("A", a), ("B", a))
        var m2 = m1
        m1("B").x = 7
        m2 = f(m1)
        print(m1("A"))    // Prints 3
        print(" ")        // Prints space
        print(m1("B"))    // Prints 7
        print(" ")        // Prints space
        print(m2("B"))    // Prints 6
    }
}

 What does Immutable2.main print?
 A 7 7 6
 B 3 7 6
 C 7 7 7
 D 3 7 7

(A)
