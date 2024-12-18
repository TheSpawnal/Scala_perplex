
case class Person(name : String, age: Int)
def m(): Unit = {
    val m: T = (Person("Joe",22), "42")
    m = (m._2,m._1)
    m._2.name
}


What is the most specific type we can fill in for T 
(such that there is no type error in m())?

 A (Person,Person)
 B <Always type error> <-
 C (Any,Any)
 D (Person,String)
 E (String,Person)
