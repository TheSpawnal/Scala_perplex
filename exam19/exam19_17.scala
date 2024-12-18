

def bubblesort[A <: Ordered[A]](a: Array[A]) ={
    def swap(i: Int, j : Int) : Unit = {
        val tmp = a(i); a(i) = a(j); a(j) = tmp
    }
    def doBubblePassAndGiveIfSwapped(): Boolean = {
        var swapped = false
        for(i<-0 until(a.length-1)){
            if(a(i) > a(i+1)) {swap(i, i+1); swapped = true}
        }
        swapped
    }
    while(doBubblePassAndGiveIfSwapped()){}
}


Which statements are true of the above function? 
(0 or more answers possible)

 A bubblesort is a pure function
 B The nested functions in bubblesort can be copy-pasted outside of bubblesort: 
 The program would still work if we moved the nested function outside bubblesort 
 without changing their code.
 C bubblesort is a curried function
 D bubblesort works for any type A that has the Ordered[A] trait. <-
 E Nested functions in bubblesort inherit traits from the bubblesort-parent.