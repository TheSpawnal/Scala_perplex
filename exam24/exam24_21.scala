

for (x <- List(1,2,3); y <- List(4,5)) yield x * y

what is the desugared form of this for loop ?

List(1,2,3).map(x=>List(4,5).map(y=>x*y))
List(1,2,3).map(x=>List(4,5).flatMap(y=>x *y))
List(4,5).flatMap(y=>List(1,2,3).map(x=>x*y))
List(1,2,3).flatMap(x=>List(4,5).map(y => x * y)) 

(D)
