
def b(l: list[Int])=
    for(x <- l; y <- l; if(x+y)>1) yield x * y

 What is the desugared form of this for loop?
 A l.flatMap(x => l.filter(y => x + y > 1).map(y => x * y))<-
 
 B l.map(x => l.filter(y => x + y > 1).flatMap(y => x * y))
 C l.map(x => l.map(x => x * y).filter(y => x + y > 1))
 D l.flatMap(x => l.map(x => x * y).filter(y => x + y > 1))