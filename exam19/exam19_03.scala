
Some(Some(9)) match {
    case Some(_) => "fizz"
    case Some(Some(_)) => "buzz"
    case Some(Some(9)) => "test"
    case _ => "nope"
}
value of this expression ? 
A "nope"
B "test"
C "buzz" 
D "fizz"<-