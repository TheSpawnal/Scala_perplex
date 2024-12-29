
case class Point(x: Int, y: Int){
    def +(rhs: Point): Point = Point(x+ rhs.x, y + rhs.y)
}

def main(args: Array[String]): Unit = {
    val a : Array[Point] = new Array(5)
    val p : Point = Point(5,-2)
    for(i <- a.indices)a(i)=p
    for(i <- a.indices)a(i)=a(i)+Point(2,i)
    var sum = 0
    for(p<-a) sum += p.y
    print(sum)
}

What does main print?
 A-20
 B 40
 C 0 
 D 10
 E-10
