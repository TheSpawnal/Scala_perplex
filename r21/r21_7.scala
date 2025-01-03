
def count[A](l : List[A], f: A => Boolean): Int = {
    var res = 0
    for(e <- l)
        if(f(e)) res += 1
    res
}


Which of the implementations below are equivalent to the body of implementation above? Assume that f is a pure function.
 Select 0 or more.

 A
 l.map(f).map(x => if(x) 1 else 0).fold(0)(_+_)
 
 B
  l.filter(f).length
 
 C
 {var x = 0
  l.filter(f).foreach(_ => x += 1)
  x
 }

 D
  (for(e<-l; if(f(e))) yield 1).sum


(A,B,C,D)