/**
  * Created by Qba on 13.04.2017.
  */
object ex5 {
  def compose[A,B,C](f: A => B, g: B => C) : A => C =
    a => g(f(a))

  def main (args : Array[String]) = {
    println(compose[Int, Int, Int](x => x + 14, x => x - 27)(33))
  }
}
