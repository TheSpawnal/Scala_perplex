

l.map(f).map(g)

Which of the following are equivalent for any list l and functions f and g? 
(You can assume that f and g are pure functions) (Select 0 or more)
 Hint: Try out example f and g, for example with types Int => Int and Int => String
 A l.map(g).map(f)
 B l.map(f).map(f).map(g).map(g)
 C l.map(g(f(_))) <-
 D l.map(f(g(_))
