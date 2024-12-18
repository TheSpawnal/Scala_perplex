
def id[A](x : A) : A = x
def andThen[A,B,C](f: A=>B, g : B => C) : A => C =x => g(f(x))

def applyEm(l: List[Int => Int]) : Int => Int = {
    if(l.isEmpty) id
    else andThen(l.head, applyEm(l.tail))
}

val l: List[Int => Int] = LIst(_*2, _-2, _*3)
val f : Int => Int = andThen(applyEm(l), (_: Int) -1)

def main(args: Array[String]) : Unit = println(f(2))

what is the output of main:

5 <-
0
1
7
2
