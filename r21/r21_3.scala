@tailrec
def reUntil[A](f: A => A, c: A => Boolean)(x: A): A = {
  if(c(x)) x
  else reUntil(f,c)(f(x))
}

def at(f: Int => Int, g: Int => Int)(x: Int): Int = g(f(x))

val y: Int = at(reUntil[Int](at(_ * 3, _ + 1), _ > 40), _ - 2)(3)

 Value of x?
 A 89
 B 92
 C 118
 D 66

 
 (B)