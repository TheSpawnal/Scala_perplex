

class GameLogic(val gridDims: Dimensions){
    var b = 0
    
    def step(): Unit = {
        b = 1 - b
    }

    def getCellType(p: Point): CellType = {
        if((p.x + p.y) % 2 == b){
            SnakeBody()//green snake cell
        }else {
            Empty()
        }
    }
}

When run in the Snake framework, what does this code display?

 A An alternating checkerboard pattern <-
 B The top-left corner and its neighbors swapping back and forth
 C Alternating rows
 D Alternating columns
 E The entire screen filled