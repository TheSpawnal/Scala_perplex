class Fruit
class Apple extends Fruit
class JonaGold extends Apple
class Pear extends Fruit

def gId[A](x: A): A = x                  // Generic identity function
def gfId[A <: Fruit](x: A): A = x        // Generic identity bounded by Fruit
def nId(x: Any): JonaGold = new JonaGold // Always returns new JonaGold

val f = (x: Boolean) =>
  if(x) (nId(new Pear)    , gfId(new JonaGold))
  else  (nId(gfId(new Pear)), gId(new Pear))

what is the most specific type of f ? 

A Boolean => (JonaGold,JonaGold)
 B Boolean => (Fruit,Fruit)
 C Boolean => (Pear, Fruit)
 D Boolean => (Pear, Pear)
 E Boolean => (JonaGold, Fruit)


(E)
