
object FizzBuzz {
    def isMultipleOf(n: Int, m: Int) = n % m == 0

    def fizzbuzz(m: Int): String = 
        if(isMultipleOf(m,15))"fb"
        else if(isMultipleOf(m,3))"f"
        else if(isMultipleOf(m,5))"b"
        else m.toString
    
    def fizzbuzzes: Seq[String] =
        (1 to 15) map fizzbuzz

    def main(args: Array[String]) =
        fizzbuzzes.foreach(print)
}


What does main() print?
 A 1f34f6bf910fb13ffb
 B 12fb45f7bf1011fb14f
 C f4bf78fb11f1314fb1617
 D 12f4bf78fb11f1314fb <-