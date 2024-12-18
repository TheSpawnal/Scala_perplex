

def increaseAll(l : immutable.List[Int]) : immutable.List[Int] = {
    val res = new mutable.ListBuffer[Int]()
    for(e<-l){
        res.addOne(e+1)//add elem to end of res
    }
    return res.toList
}

Which of the following statements about increaseAll are true? 
Select 1 or more
 A increaseAll is a pure function <-
 B increaseAll changes the input list
 C increaseAll can be implemented using exists
 D increaseAll uses mutation internally <-