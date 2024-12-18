
def combl(l : (Int, Int),r : Int) : (Int, Int) =
    (l._1 + r, l._2 -r)

def combr(l : Int, r: (Int, Int)) : (Int, Int) =
    (l + r._1, l - r._2)

val L: List[Int] = List(1,2,3)

def ms: ((Int, Int), (Int, Int))=
    (L.foldLeft(0,1)(combl), L.foldRight(0,1)(combr))

What is the value of ms?
 A ((6,7),(6,7))
 B ((6,-5),(6,1)) <-
 C ((7,-5),(7,-5))
 D ((7,1),(7,1))