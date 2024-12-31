// Tail recursive function
@tailrec
def alt[A](f: A => A, g: A => A, i: Int)(a: A): A = 
  if(i == 0) a
  else alt(g, f, i-1)(f(a))  // Note: f and g are flipped in recursive call

def after[A,B,C](f: B => C, g: A => B): A => C = x => f(g(x))

val f: Int => Int = alt(after[Int,Int,Int](_ + 1, _ * 2), _ - 2, 5)

val x = f(3)


 What is the value of x?
 A 19
 B 127
 C 1
 D 26


(A)
