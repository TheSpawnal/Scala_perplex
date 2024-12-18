

def andThen[A, B, C](f: A => B, g: B => C) : A => C = x => g(f(x))

def sum[A](f: A => Int, List: Seq[A]) : Int = {
    var sum = 0
    for (element <- List)
        sum += f(element)

    sum
}

val add : Int => Int = _ + -2
val mul: Int => Int = _ * 3

val x: Int = add(sum(andThen(add, mul), Seq(1,2,3)) * 3)

 What is the value of x?
 A-62
 B-74
 C-2 <-
 D-38
 E 16