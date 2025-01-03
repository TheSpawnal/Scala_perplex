

class A(var x: Int) {
  def f(): () => Int = {
    var y: Int = 1
    () => {y = y + 2; y + x}
  }
}

object ClosureM2 {
  def main(args: Array[String]): Unit = {
    var a = new A(2)  
    var p = a.f()     
    println(p())      
    a.x = 3          
    println(p())      
    a = new A(4)     
    println(p())      
    p = a.f()        
    println(p())      
  }
}

 What will ClosureM2.main print?
 A 5 8 10 7
 B 5 8 11 13
 C 5 5 5 5
 D 5 6 6 7

 

 (A)