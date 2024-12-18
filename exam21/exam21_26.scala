
class Food
class Flour extends Food
class Raisins extends Food
class Milk extends Food
class Pancakes extends Food
class RaisinPancakes extends Pancakes

trait Transformer[-A, +B]{
    def transform(a: A) : B
}


 Which are subtypes of the following type?
 Transformer[(Flour,Raisins,Milk), Pancakes]
 Select 0 or more.
 A Transformer[Any, Pancakes] <-
 B Transformer[(Food,Food,Food), RaisinPancakes] <-
 C Transformer[(Food,Food,Food),Food] 
 D Transformer[(Flour,Raisins,Milk), RaisinPancakes] <-
 E Transformer[Any, Food]
 F Nothing <-