

val l: Seq[Seq[(Int,Int)]] =
    for(x <- 0 until 10 if x % 3 != 0)
        yield for(y <- 0 until 10)
            yield((x,y))

Which of the expressions gives the same result as the value of l?
 A (0 until 10).filter(_ % 3 != 0).flatMap(x => (0 until 10).map(y => (x,y)))
 B (0 until 10).filter(_ % 3 != 0).map(x => (0 until 10).map(y => (x,y))) <-
 C (0 until 10).map(x => (0 until 10).map(y => (x,y))).filter(_ % 3 != 0)
 D (0 until 10).map(x => (0 until 10).filter(_ % 3 != 0).map(y => (x,y)))