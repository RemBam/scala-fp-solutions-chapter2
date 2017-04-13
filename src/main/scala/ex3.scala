/**
  * Created by Qba on 13.04.2017.
  */
object ex3 {
  def partial1[A,B,C](a: A, f: (A,B) => C) : B => C =
    b => f(a,b)

  def curry [A,B,C](f: (A,B) => C) : A => (B => C) =
    (a : A ) => partial1(a,f)

  def uncurry [A,B,C](f: A => B => C) : (A,B) => C =
    (a,b) => f(a)(b)

  def sum (a : Int, b : Int) : Int = a + b

  def main (args : Array[String]) : Unit ={
    val s = curry(sum)
    val sum5 = s(5)
    println(sum5(4))
    val uncurry_s = uncurry(s)
    println(uncurry_s(10,51))
  }
}
