

trait X {def x = "Yeah"}
trait Y extends X {
    override def x = "No"
    def y = "Cooo"}
trait Z {def z = "zzz"}
class A extends Z with Y {
    override def z = "ZZ"
}

val x : String = {
    val a : A = new A
    a.x + a.y + a.z
}

A "NoCoooZZ" <-
B "YeahCooozzz"
C "YeahCoooZZ"
D "NoCooozz"
