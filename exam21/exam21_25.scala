
class fruit
class citrus extends fruit
class lemon extends citrus
class grapefruit extends citrus

object gentype {
    def gfid[A <: citrus](x : A): A = x
    def cfid(x : citrus) : grapefruit = new grapefruit
    def fid(x : citrus) : citrus = x
    def gid[A](x: A) : A = x

    val v = gfid(gid(fid(cfid(new lemon))))
}

What is the (most specific) type of v?
 A Any
 B Fruit
 C Grapefruit
 D Citrus <-
 E Lemon