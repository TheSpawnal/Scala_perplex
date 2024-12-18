

abstract class Pokemon
case object Slowbro extends Pokemon

case class FPokeball(p: Pokemon)
case class GPokeball[A <: Pokemon](p: A)

val m = (FPokeball(Slowbro).p, GPokeball(Slowbro).p)

What is the (most specific) type of m?
 A (Slowbro, Slowbro)
 B (Pokemon, Pokemon)
 C (FPokeball, Slowbro)
 D (Slowbro, Pokemon)
 E (FPokeball, Pokemon)
 F (Pokemon,SlowBro) <- 