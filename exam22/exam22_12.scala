

class a
class b extends a
class c extends b
class d extends b
class e extends c
 
What is the most specific type of?
(List(new b, new c, new d, new e), List(new e, new c))
(Tip: Draw a diagram!)

A (List[A], List[B])
B (List[B], List[C]) 
C (List[C], List[C])
D ( List[A], List[C])
E (List[B],List[B])

(B)
