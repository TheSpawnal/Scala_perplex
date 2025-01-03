

class Fruit
class Citrus extends Fruit
class Lemon extends Citrus 
class Grapefruit extends Citrus

object GenType {
  def gfid[A <: Citrus](x: A): A = x
  def cfid(x: Citrus): Grapefruit = new Grapefruit
  def ffid(x: Citrus): Fruit = x
  def fid(x: Citrus): Citrus = x
  
  val v = (ffid(fid(gfid(new Lemon))), gfid(cfid(new Lemon)))
}

What is the (most specific) type of v?
 A (Fruit,Grapefruit)
 B (Citrus,Citrus)
 C (Lemon,Grapefruit)
 D (Any, Citrus)
 E (Fruit, Fruit)


(A)

