import scala.annotation.tailrec

/**
  * Created by Qba on 13.04.2017.
  */
object ex2 {
  @tailrec
  def isSorted[A](as : Array[A], ordered: (A,A) => Boolean) : Boolean = {
    if (as.length == 0 || as.length == 1) true
    else if (ordered(as(0), as(1))) isSorted(as.tail, ordered)
    else false
  }

  def main(args: Array[String]) : Unit = {
    println(isSorted(Array(1,2,3),
      (a : Int,b : Int ) => a < b
    ))
    println(isSorted(Array(2,2,3),
      (a : Int,b : Int ) => a < b
    ))
    println(isSorted(Array(1,2,3),
      (a : Int,b : Int ) => a <= b
    ))
  }
}
