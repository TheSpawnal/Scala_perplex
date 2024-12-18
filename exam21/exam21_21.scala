
l.map(p).filter(f).map(q)

Which of the following is equivalent to the above expression for all l, p,f and q? 
You can assume that p,f and q are pure functions. Select 0 or more.

 A l.filter(f(p(_)).map(q(p(_)) <-
 B (for(e <- l; if(f(p(e))) yield q(p(e))) <-
 C l.map(p).map(q).filter(f)
 D l.filter(f).map(p).map(q)
 E l.map(p(q(_))).filter(f)