
l.map(f).filter(g).exists(h)

Which of the following expressions are equivalent for all l,f,g and h? You can assume that f, g and h are pure functions. Select 0 or more.
 A l.exists(x => g(f(x)) && h(f(x))) <-
 B l.map(f).exists(x => g(x) && h(x)) <-
 C l.forall(x => g(f(x)) || h(f(x)))
 D l.flatMap(h(g(f(_)))
 E (for(e<-l; if(g(f(e))))yield f(e)).exists(h) <-