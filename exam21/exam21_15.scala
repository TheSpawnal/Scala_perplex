

class GameLogic(val random: RandomGenerator, val gridDims: Dimensions){
    val w : Int = gridDims.width / 2
    var x : Int = -w

    def step() : Unit = {
        x = (x+1)
        if(x == gridDims.width) x = -w
    }

    def getCellType(p : Point): cellType =
        if(x <= p.x && p.x < x +w) SnakeBody(p.y.toFloat/(gridDims.height -1))
        else Empty()
}

When run in the snake framework of assignment 2, what does this code do?
 A A wide colum moving to the right @
 B A blinking screen
 C Empty screen
 D A single cell moving to the right
 E A cell traversing the borders of the screen
 F
 A blinking row
 G A cell moving diagonally