
trait A
trait B
class D extends A with B
class E extends D
class MutVar[A]

def withMutVar(p: MutVar[D]): Unit = ()

 Which of the following calls will not cause a type error? Choose 1 or more

withMutVar((throw new Error("Hello")): Nothing) 
withMutVar(null: Any)
withMutVar(new MutVar[B]) 
withMutVar(new MutVar[D]) 
withMutVar(new MutVar[Any]) 

(A,D)
