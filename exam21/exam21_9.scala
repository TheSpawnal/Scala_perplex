

abstract class Err {
    final def v : String = "hello"
    def w : String
}

class E extends Err

final class F extends E {
    val v = new Err()
}

object E {
    val w = new F()
}


Which errors will the above code give?

 A Cannot instantiate abstract class 
 B Cannot subclasss final class
 C Class E must either be declared abstract or implement abstract member 
 D Cannot instantiate final class
 E Cannot declare final method in non-final class

(A,C)
