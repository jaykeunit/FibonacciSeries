package fibonacci
import scala.annotation.tailrec

class FibonacciSeries {

  def fibonacciRecursive(position : Int) : List[Int] = position match {
    case 0 => List(1)
    case 1 => List(1, 1)
    case position => {
      val sequence = fibonacciRecursive(position - 1)
      sequence :+ sequence.takeRight(2).sum
    }
  }

  @tailrec final def fibonacciTailRecursive(position : Int, updatedList : List[Int] = List(1) ) : List[Int] = position match {
    case 0 => updatedList
    case position => fibonacciTailRecursive (position - 1, updatedList :+ updatedList.takeRight(2).sum)
  }
}