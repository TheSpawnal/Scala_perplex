

class Box(var content: Int)

def processBoxes(boxes: List[Box]): List[Int] = {
    boxes.foreach(box => box.content += 10)
    boxes.map(box => box.content)
}

def main(args: Array[String]) : Unit = {
    val originalBoxes = List(new Box(1), new Box(2), new Box(3))
    val processedOutput = processBoxes(originalBoxes)
    val afterProcessing = originalBoxes.map(box => box.content)
    println(processedOutput)
    println(afterProcessing)
}

what is the output of main:

List(1,2,3) \n List(11, 12, 13)
List(11,12,13) \n List(1, 2, 3)
List(11,12,13) \n List(11, 12, 13) <-
List(1,2,3) \n List(1, 2, 3)