trait P {def x: String = "hullo!"}
trait Q { def y : String = "yo!"}

class A extends P
class B extends A
class C extends P
class D extends C with Q

def c( b: Boolean) : String = {
    var p:      T       = (new A, new D)
    if(b){
        p = (new B, p._2)
    }
    p._1.x + p._2.y
}

what types can in fill in for T so that there is no error ? select 1 or more

(P,Q)
(A,C)
(Any,Any)
Any
(A,D)



(A,E)
