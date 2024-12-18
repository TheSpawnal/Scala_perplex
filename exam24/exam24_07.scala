

def main(args : Array[String]): Unit = {
    var x = 0

    def incrementX(): Int = {
        x +=1; x
    }

    val a : Int = incrementX()
    lazy val b : Int = incrementX()
    def c: Int = incrementX()
    println(a+" "+b+" "+c)
    println(b+" "+c)
}

what is the output of main ?

1 1 2 2 3

1 2 3 2 4 <-

1 2 2 2 3

1 2 3 3 4
