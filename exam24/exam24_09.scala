

which of the following functions are in curried form ? 1 or more:

def f2 : String => String => String => x => y => x + " and " + y <-

def f5(x : String , y: String) : String = x + " and " + y 

def f4(x: String) : String => String = y => x + " and " + y <-

def f3(x: String)(y: String): String = x + " and " + y <- 

def f1 : (String, String) => String = (x,y) => x + " and " + y 