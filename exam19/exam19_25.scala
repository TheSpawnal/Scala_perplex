

def m(l: List[List[Int]]) : List[Int] = {
    for(r <- l; if(r.lenght > 1) ; c <- r)
        yield c + 1
}

what is the desugared version of the above for loop ? 

l.filter(_.length > 1).flatMap(r => r.map(_+1)) <-
l.flatMap(r => r.filter(_.length > 1).map(_+1))
l.flatMap(r => r.map(_.+1).filter(_length > 1))
l.filter(r => flatMap(r => r.map(_+1) when (r.length) > 1))