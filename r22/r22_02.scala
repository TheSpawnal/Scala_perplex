class A(var b: B) {
    def increment(): Unit = 
        b = new B(b.g + 1)
}

class B(var g: Int) {
    def increment(x: Int): Unit = 
        g += x
}

object Test {
    def main(args: Array[String]): Unit = {
        val b = new B(0)       // Create B with g = 0
        val a = new A(b)       // Create A with reference to b
        var x = 3              // Initialize x = 3
        b.increment(3)         // b.g becomes 3
        a.increment()          // Creates new B with g = 4
        x -= b.g              // x = 3 - 3 = 0
        a.increment()         // Creates new B with g = 5
        x += b.g              // x = 0 + 3 = 3
        println(x)            // Prints 3
    }
}


 A 2
 B 3
 C 6
 D 7

 (B)