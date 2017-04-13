import scala.annotation.tailrec

/**
  * Created by Qba on 13.04.2017.
  */
object ex1 {

  def fib(n: Int): Int = {
    @tailrec
    def _fib(n: Int, prev: Int, cur: Int): Int = {
      if (0 == n) prev
      else _fib(n - 1, cur, cur + prev)
    }
    _fib(n,0,1)
  }


  def main(args: Array[String]): Unit = {
    println(ex1.fib(0))
    println(ex1.fib(1))
    println(ex1.fib(2))
    println(ex1.fib(3))
    println(ex1.fib(4))
    println(ex1.fib(5))
    println(ex1.fib(6))
  }
}

