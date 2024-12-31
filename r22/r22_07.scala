object ArrayMutable {
    class Point(var x: Int, var y: Int) {
        def move(x: Int, y: Int): Unit = {
            this.x += x
            this.y += y
        }
    }

    def main(args: Array[String]): Unit = {
        val a: Array[Point] = new Array(5)
        val p: Point = new Point(5, -2)
        for(i <- a.indices) a(i) = p
        for(i <- a.indices) a(i).move(3,i)
        var sum = 0
        for(p <- a) sum += p.y
        print(sum)
    }
}

What does ArrayMutable.main print?
 A 40
 B-20
 C 0
 D-10

(A)
