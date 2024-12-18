

def test : Seq[Int] = {
    for(i<- 1 to 4;
        j<-1 to 4;
        if i + j > 6;
        z <- (i - j) to ((i-j)+1))
        yield z
}

 Value of test? (remember that to is inclusive: 1 to 2 =Vector(1,2))

 A Vector(-1, 0, 1, 2, 0, 1) <-
 B Vector(1, 2,-1, 0, 0, 1)
 C Vector(-2, -1, 0, 1, -1, 0, 2, 3, 1, 2, 0, 1)
 D Vector(2, 3, 0, 1, 1, 2, -2, -1, -1, 0, 0, 1)