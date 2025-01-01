
def tl : (Int, Int) => Int = _ + _
def cl : Int => Int => Int = x => y => x + y
def atl(x: Int, y: Int) : Int = x + y

def curry[A,B,C](f: (A,B) => C) : A => B => C = x => y => f(x, y)
def uncurry[A, B,C](f : A=> B => C) (x : A, y : B) : C = f(x)(y)
 

Which of the following equivalences are true 
(where :=: means is equivalent to)? (Select zero or more)

A curry(tl) :=: cl 
B uncurry(cl) :=: (x,y) => x + y 
C atl :=: uncurry(tl)
D curry(atl) :=: curry(tl) 
E curry(uncurry(tl)) := atl
F curry(cl) :=: x => y => x + y

(A,B,D)
