
def ex[A](l: List[A], f : A => Boolean) : Boolean =
    l.exists(f)

Ex is defined as above, as a call to library function exists. 
Which of the following functions are equivalent to ex? 
You can assume that the argument f performs no side effects. 
Select zero or more.

A: <-
def ex1[A](l: List[A], f : A => Boolean) : Boolean ={
    for(e<-l) if(f(e)) return true
    return false
}

B: <-
def ex2[A](l: List[A], f : A => Boolean) : Boolean =
    l.filter(f).length > 0

C:
def ex4[A](l: List[A], f : A => Boolean) : Boolean =
    l.map(f).length > 0

D:
def ex3[A](l: List[A], f : A => Boolean) : Boolean =
    for(x <- l if f(x)) yield true
    