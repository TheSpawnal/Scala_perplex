
object Foos{
    val r : Range = 0 until 15
    def isMultipleOf(n: Int, m: Int): Boolean = n % m == 0
    def nub(n: Int) : Int = if(isMultipleOf(n,4)|| isMultipleOf(n,3)) 1 else n

    def theList() : Seq[Int] =
        r.map(_ + 1).map(nub).filter(_ > 3).map(_ - 1)
    
    def printEm(): Unit = theList().foreach(x=>print(x + " "))
}

what is the output of printEm
A 4 6 9 10 12 13
 B 5 7 10 11 13 14
 C 5 1 7 1 1 10 11 1 13 14
 D 2 6 2 8 2 2 11 12 2 14