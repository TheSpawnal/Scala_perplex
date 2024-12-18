

 In this exercise, we implement sets by using first-class functions: 
 a set is a function that says if the given element is in the Set or not.

 type Set[A] = A => Boolean

 Which of the following are valid implementations of a union function? 
 (select 0 or more)
 The union function has the following signature:

 def union[A] : (Set[A], Set[A]) => Set[A]

 A: <-
 {
    def giveBoth[C](f: C => Boolean, g : C => Boolean)(x:C) = f(x) || g(x)
    giveBoth
 }

 B:
 x => a(x) || b(x)

 C: <-
 (f,g) => x => f(x) || g(x)

 D:
 (a,b) => {
    var c = Set()
    for(x <- a) c += a
    for(x <- b) c += a
    c
 }

 E: 
 (a,b) => a compose b

 F: <-
 {
    def v(a : Set[A], b: Set[A]) = x => if (a(x)) true else b(x)
    v
 }