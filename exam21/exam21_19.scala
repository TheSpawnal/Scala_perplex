

def main(args: Array[String]) : Unit = {
    val n: Array[Map[String, String]] =
        Array(Map(("hello","goodbye") , ("goedendag", "tot ziens")))
    val m = n
    f(n)
    print(m(0)("goedendag"))
}

What will this program print?

 A Depends on the definition of f <-
 B "tot ziens"
 C "good bye"
 D "empty string"