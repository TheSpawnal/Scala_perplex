

case class Point(x : Int, y: Int){
    def +(p: Point): Point = Point(x + p.x , y + p.y)
}

def main(args: Array[String]): Unit = {
    var array: Array[Point] = new Array(5)
    val point = Point(5, -5)

    for(i <- array.indices) array(i) = point
    for(i <- array.indices) array(i) = array(i) + Point(i, 7)

    var sum = 0

    for(i <- array.indices) sum += array(i).y
    print(sum)
}

 What does this code print?
 A 35 
 B 150
 C 10 
 D 75

(C)
