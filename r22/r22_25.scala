// Initial variable
var a = 0

// Generic map function that takes a List[A] and a function f: A => B
// Returns a List[B]
def map[A,B](l: List[A], f: A => B): List[B] = {
    val res = new ListBuffer[B]()
    for (e <- l) {
        res.addOne(f(e))
    }
    return res.toList
}

// Two functions that modify the global variable 'a'
def f(x: Int): Int = { a += 1; x + a }
def g(x: Int): Int = { a -= 1; x + a }

// Input list
val l = List(1, 2, 3)

// The value v is composed of two parts that are summed:
val v = (map(l, (x: Int) => g(f(x)))).sum,  // Part 1
        map(map(l,f), g).sum                 // Part 2

 What is the value of v?
 A (9,15)
 B (9,9)
 C (15,9)
 D (6,6)
 E (9,-9)

(A)
