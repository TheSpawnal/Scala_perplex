// Function composition with types A, B, C
def andThen[A,B,C](f: A => B, g: B => C): A => C = x => g(f(x))

// Iterates function f on input a, count times
def iter[A](f: A => A, count: Int)(a: A): A = {
  var result = a
  for (i <- 0 until count)
    result = f(result)
  result
}

// Subtract 1 from input
val sub: Int => Int = _ - 1

// Multiply input by 2
val mul: Int => Int = _ * 2

// The complex expression to evaluate
val x: Int = andThen(iter(andThen(sub, mul), 3), iter(sub, 3))(3)

 What is the value of x?
 A-6
 B-9
 C 12
 D 7


(D)
