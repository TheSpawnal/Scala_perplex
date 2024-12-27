
def increaseEm(arr: Array[Int]): List[Int] = {
  for(i <- arr.indices){
    arr(i) = arr(i) + 1
  }
  val res = new mutable.ListBuffer[Int]()
  for(e <- arr){
    res.addOne(e+1) //ad one to the end 
  }
  return res.toList
}
 Which of the following statements are true? Choose 1 or more
 A increasEm uses mutation
 B increasEm can be implemented using exists
 C increasEm changes the input array
 D increaseEm is a pure function

(A,C)
