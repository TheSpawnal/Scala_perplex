
 sets are implemented as functions that tell if an element is in the set or not. Here,
 we do the same, but we implement Maps as functions, using the following definition:

type Map[A,B] = A => Option[B]

 What would be an implementation of a union on two maps? (merge all key value pairs, prefer the value from the left, if key
 occurs in both maps). Choose 1 or more

A: 
def merge3[A,B](l: Map[A, B], r: MapF[A, B]): MapF[A, B] =
  l.compse(r)

B:
def merge2[A, B](l: MapF[A, B], r: MapF[A,B]): MapF[A, B] = {
  val res = MapF()
  for( k <- l.keys + r.keys){
    val v = l(k) match {
      case None => r(x)
      case Some(v) => Some(v)
    }
    res.addOne(k, v)
  }
  res
  }

C:
def merge4[A, B](l: MapF[A, B], r: MapF[A,B]): MapF[A, B] =
  x => if(l(x) == None) r(x) else l(x)

D:
def merge1[A, B](l: MapF[A, B], r: MapF[A,B]): MapF[A, B] =
  x => l(x) match {
    case None => r(x)
    case Some(v) => Some(v)
  }
