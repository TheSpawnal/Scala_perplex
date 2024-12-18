

val x: Seq[Seq[Int]] = ...//ommitted

for(a <- x if a.nonEmpty)
    yield for(b <- a if b < 7)
        yield b + 7

 Which of the following expressions is equivalent?

 A: 
 x.filter(_.nonEmpty).map(a => a.map(_ + 7).filter(_ < 7))

 B: <-
 x.filter(_.nonEmpty).map(a => a.filter(_ < 7).map(_ + 7))

C:
 x.map(a => a.filter(_ < 7).map(_ + 7)).filter(_.nonEmpty)
 
 D:
 x.map(a => a.map(_ < 7).filter(_ + 7)).filter(_.nonEmpty)

