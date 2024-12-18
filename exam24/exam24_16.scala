

which of the following function headers can be called with:
b(_+_)(2)
? 0 or more

def b : Int => (Int => Int ) => Int = 

def b(f: (Int, Int) => Int, x : Int) =

def b : ((Int => Int) => Int) => Int =

def b(f: (Int, Int) => Int) : (Int => Int) = <-

def b : ((Int, Int) => Int) => Int => Int = <-

def b : ((Int, Int) => Int) => (Int =>Int) = <-