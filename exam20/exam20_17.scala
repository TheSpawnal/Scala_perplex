
abstract class Roshambo
case object Rock extends Roshambo
case object Paper extends Roshambo
case object Scissors extends Roshambo

def beats(l : Roshambo, r : Roshambo) : Boolean = 
    (l, r) match {
        case (Paper, Rock)
            | (Rock, Scissors)
            | (Scissors, Paper) => true
        case => false
    }

def winner(l: Roshambo, r: Roshambo) : Roshambo = 
    if(beats(l,r)) l else r

val l : List[Roshambo] = List(Rock, Paper, Scissors, Scissors)
val res : (Roshambo, Roshambo) = 
    (l.foldLeft(Rock : Roshambo)(winner(_,_)),
        l.foldRight(Rock : Roshambo)(winner(_,_)))


 What is the value of res?
 A (Scissors,Paper) <-
 B (Paper,Scissors)
 C (Scissors,Scissors)
 D (Paper,Paper)
 E (Rock,Rock)

