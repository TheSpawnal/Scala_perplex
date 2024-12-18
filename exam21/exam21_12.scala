

case class Point(x: Int,y: Int){
    def +(rhs: Point) : Point = Point(x+rhs.x , y + rhs.y)
}

object ArrayM{
    def main(args: Array[String]) : Unit = {
        val a = new Array[Point](8)
        for(i <- a.indices)a(i) = Point(2,1)
        val b = a 
        for(i <- a.indices) a(i) = a(i) + Point(1,i)
        var sum = 0
        for( p <- b) sum += p.y
        println(sum)
    }
}

 What does ArrayM.main print?
 A 36 <-
 B 8
 C 232
 D 42