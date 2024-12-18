
class A(var a: Int)

def main(args: Array[String]): Unit = {
    val arr: Array[A] = new Array[A](8)

    for(i <- arr.indices){
        if(i > 3){
            arr(i) = arr( i - 4)
            arr(i).a += 1
        }
        else arr(i) = new A(i)
    }
    print(arr.map(_.a).sum)
}

what does main print:
20 <-
16
32
10