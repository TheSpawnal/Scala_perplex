

class Point(var x: Int, var y : Int){
  def up(p: Point): Unit= {
    this.x += p.x
    this.y += p.y
  }
}

def main(args: Array[String]): Unit = {
  val array: Array[Point] = new Array(5)
  val point = new Point(0, -5)
  for( i <- array.indices) array(i) = point
  for( i <- array.indices) array(i).up(new Point(5, i))
  var sum = 0
  for( i <- array.indices)sum += array(i).y
  print(sum)
}

 What value will be printed by the following code?
 A-15
 B 25
 C 125
 D 50


(B)
