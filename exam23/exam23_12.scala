

sealed class Roshambo
case class Rock() extends Roshambo
case class Paper() extends Roshambo
case class Scissor() extends Roshambo


def wins(lhs: Roshambo, rhs: Roshambo) : Roshambo = rhs
def wins(lhs: Rock, rhs:Paper) : Roshambo = rhs
def wins(lhs:Rock, rhs:Roshambo) : Roshambo = lhs
def wins(lhs:Paper, rhs: Scissor) : Roshambo = rhs
def wins(lhs:Paper, rhs:Roshambo) : Roshambo = lhs
def wins(lhs:Scissor, rhs:Rock) : Roshambo = rhs
def wins(lhs:Scissor, rhs: Roshambo) : Roshambo = lhs

val l: List[Roshambo] = List(Scissors(), Paper(), Rock())
val i: Roshambo = Rock()
val res: Roshambo = l.foldLeft(i)(wins)

 What is the value of res?
 A Scissors()
 B Paper()
 C Rock() <-
