
class SnakeLogic(val gridDims : Dimensions){
    val center : Point = Point(gridDims.width/2, gridDIms.height/2)
    var size : Int = 4

    def abs(x: Int) : Int = if(x<0) -x else x

    def getCellType(p: Point): CellType = {
        val distx = abs(p.x - center.x)
        val disty = abs(p.y - center.y)
        if(distx == size && disty <= size ||
            disty == size && distx <= size) Snakebody()
        else Empty()
    }
}

when run in snake framework, what does this code display ?

the outline of a square <-

A checkerboard pattern

Every other row and every other column filled 

A filled circle

The entire screen filled