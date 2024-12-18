
We want to implement fold, with the following signature.

def fold[A](f: (A, A) => A, z : A)(l: List[A]): A =


Which of the following is a correct implementation?
You can assume that f is associative 
(f(f(x,y),z) = f(x,f(y,z)) forall x, y and z) and 
that z is a unit for f (f(x,z) = f(z,x) = x forall x)

A: 
l match {
    case List() => z 
    case l => fold(f,f(z,l.head))(l.tail)
}

B:
{
    var i = z 
    for(a <-l) i = f(i, a)
    i
}

C:
{val n = l.length
    if(n==0) z
    else if(n == 1) l.head
    else f(fold(f,z)(l.take(n/2)), fold(f,z)(l.drop(n/2)))
}

D: 
l.foldLeft(z)(f)

E: 
l.foldRight(z)(f)