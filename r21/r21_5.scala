

def foldLeft[A,B](f: (B, A) => B, z: B)(l: List[A]): B

// Options:
A: l.foldRight(z)(f)

B: { 
  var i = z
  for(a <- l) i = f(i,a)
  i 
}

C: l match {
  case List() => z
  case l => fold(f,f(z,l.head))(l.tail)
}

D: { 
  val n = l.length
  if(n == 0) z
  else if(n == 1) l.head
  else f(fold(f,z)(l.take(n / 2)), fold(f,z)(l.drop(n/2)))
}

(B,C)