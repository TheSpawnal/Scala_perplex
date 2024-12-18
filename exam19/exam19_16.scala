
def deflazyval() : Unit = {
    lazy val l : Int = {print("l") ; 5}
    def d : Int = {print("d"); 7}
    val v : Int = {print("v"); 3}

    var s: Int = d
    s += l
    s += v
    s += l
    s += d
}

 What will deflazyval print?
 A vdld <-
 B ldv
 C dlv
 D dlvld