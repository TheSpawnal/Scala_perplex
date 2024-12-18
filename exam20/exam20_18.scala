
def myForall[A](f: A=>Boolean, l: List[A]) : Boolean = l.forall(f)

myForall is defined as above, as a call to library function forall. 
Which of the following functions are equivalent to myForall? You can assume
 that the argument f performs no side effects. Select zero or more

A:
def myForall[A](f: A => Boolean, l : List[A]): Boolean = {
    for(i <- l; if(!f(i))) return false
    return true
}

B: 
def myForall2[A](f: A => Boolean, l: List[A]) : Boolean =
    l.map(f).fold(true)(_ && _)

C: 
def myForall3[A](f: A => Boolean, l: List[A]): Boolean =
    l.filter(f).length == l.length

D:
def myForall4[A](f: A => Boolean, l: List[A]) : Boolean =
    l.filter(!(f(_))).length == 0
