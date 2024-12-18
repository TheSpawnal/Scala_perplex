

which of the functions below implement foldLeft ? Select 0 or more

A: <-
def fl1[A,B](i:B)(f : (B,A) => B)(l : Seq[A]) : B = {
    var res = i
    for(e <- l)
        res = f(res, e)
    res
}

B:<-
@tailrec
def fl2[A,B](i:B)(f : (B,A) => B)(l : Seq[A]) : B = {
    if(l.isEmpty) i
    else fl2(f(i, l.head))(f)(l.tail)
}

C:
def fl3[A,B](i:B)(f : (B,A) => B)(l : Seq[A]) : B = {
    if(l.isEmpty)i
    else f(l.head, fl3(i)(f)(l.tail))
}

D:<-
def fl4[A,B](i:B)(f : (B,A) => B)(li : Seq[A]) : B = {
    var res = i
    var l = li
    while(!l.isEmpty){
        res = f(res, l.head)
        l = l.tail
    }
    res
}