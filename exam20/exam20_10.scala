
class GameLogic {
    def width = 10
    var dir = 1
    var x = 0
    def step() : Unit = {
        x = x + dir
        if(x == 0 || x == width -1) dir = -dir
    }
    final def getCellType(x: Int, y: Int) : CellType =
        if( x == this.x ) SnakeBody(1.0f)
        else Empty()
}

When run in the snake framework used in the exercises, what will the above code do?
 A Display a blinking diagonal line.
 B Show a column moving to the right across the screen and then moving to the left across the screen.<-
 C Show a row of green rectangles moving downwards across the screen and then upwards across the screen.
 D Display a blinking screen full of green rectangles.
 E Show a single cell moving diagonally down across the screeen and then diagonally up across the screen