
for(a <- x ; if a > 5 ; b <- x)
  yield (a,b)

Which ​of the following expressions is ​equivalent 
(will always ​give the same result as the above ​expression)?

 A x.filter(_ > 5).map(a => x.map((a, _)))
 B x.flatMap(a => x.filter(_ > 5).map((a, _)))
 C x.map(a => x.filter(_ > 5).map((a, _)))
 D x.filter(_ > 5).flatMap(a => x.map((a, _)))

(D)
