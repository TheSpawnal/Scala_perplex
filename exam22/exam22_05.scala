

class GameLogic(val gridDims: Dimensions){
    var b: Int = 0

    def step(): Unit =
        b = 1 - b
    
    def getCellType(p: Point) : CellType = {
        if(p.x % 2 == b) SnakeBody(0.0f)
        else Empty()
    }
}

When ran in the framework of the snake game, what does this code do?
 A  blinking row
 B cell moving to the left, and starting on the next line when leaving the screen
 C wide column moving to the right
 D Columns blinking alternately 
E blinking screen
 F Empty screen

(D)
