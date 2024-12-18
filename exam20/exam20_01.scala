
object Fizzy {
    def isMultipleOf(n: Int, m: Int): Boolean = n % m == 0
    def fizzString(n: Int) : String =
        if(isMultipleOf(n, 5)) "fizz"
        else n.toString
    def fizzString : Seq[String] =
        (0 until 15).filter(!isMultipleOf(_,3)).map(fizzString)

    def main() : Unit =
        fizzyStrings.foreach(print)
}

What is the output of main?

 A 124fizz78fizz111314 <-
 B 12fizz4fizz78fizz11fizz1314
 C fizzfizzfizz
 D 12fizz4fizzfizz78fizzfizz11fizz1314