object Fuzzy {
  // Returns true if n is a multiple of m
  def isMultipleOf(n: Int, m: Int): Boolean = n % m == 0
  
  // Returns 1 if n is multiple of 3, otherwise returns n
  def toTee(n: Int): Int = if(isMultipleOf(n,3)) 1 else n
  
  // Main function that processes numbers 0 to 9
  def main(args: Array[String]): Unit = {
    (0 until 10)          // Creates range [0,1,2,3,4,5,6,7,8,9]
      .map(toTee)         // Applies toTee to each number
      .filter(_ > 3)      // Keeps only numbers greater than 3
      .map(_ + 1)         // Adds 1 to each remaining number
      .foreach(print)     // Prints each number without spaces
  }
}

 What does Fuzzy.main print?
 A 45178110
 B 5689
 C 562892
 D 457810

(A)
