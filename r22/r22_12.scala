var l: List[Int] = List(1,2)

def f(): Int => Int = {
   (x: Int) => {
       val h = l.head
       l = l.tail :+ x  // appends x at the end of l.tail
       h
   }
}

def main(args: Array[String]): Unit = {
   var v: Int => Int = f()
   print(v(3))    // prints 1
   print(v(4))    // prints 2  
   print(v(5))    // prints 3
   v = f()        // reassign v but l remains same
   print(v(6))    // prints 4
   print(v(7))    // prints 5 
   print(v(8))    // prints 6
}

What does main print?
 A 123126
 B 123123
 C 111111
 D 123456
 E 345678


(D)
