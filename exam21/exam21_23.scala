
l.filter(x => x.length > 10).flatMap(x => x.filter(y => y > 5).map(y => x.length * y))

Which of the following for-yield loops is equivalent (gives the same result) ?

A: <-
for(x <- l if x.length > 10; y <- x if y > 5) yield x.length * y

B: <-
for(x <-l; y <- x if x.length > 10 && y > 5) yield x.length * y

C: 
for(x <- l if x.length > 10)
    yield for(y <- x if y > 5) yield x.length * y

D:
for(x <- l; y <- x)
    yield if(x.length > 10 && y > 5) x.length * y
        else None