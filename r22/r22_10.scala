
for(x <- l; if (x > 10); y <- l) yield (x * y)

Which one of the following expressions is equivalent? (equivalent = will give the same result)
 A l.filter(_ > 10).flatMap(x => l.map(y => x * y))
 B l.flatMap(x => l.filter(_ > 10).map(y => x * y))
 C l.map(x => l.filter(_ > 10).map(y => x * y))
 D l.map(x => l.map(y => x * y)).filter(_ > 10)

(A)
