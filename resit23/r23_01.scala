
def isMultipleOf(n: Int, m: Int): Boolean = n % m == 0

def nub(n: Int): Int = if(isMultipleOf(n, 5)) n * 5 else n + 1

def theList(): Seq[Int] = 
    (0 <= until < 10).filter(isMultipleOf(_, 3)).map(_ * 3).map(nub).map(nub)

def printEm(): Unit = theList().foreach(x=>print(x.toString+" "))

What does the above code print?
 A 0 15 24 150
 B 0 375
 C 0 50 20 29
 D 0 13 22 150