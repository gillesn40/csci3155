object MyCode {
  def sumList(a : List[Int]) : Int = {
    a match {
      case (List()) => 0
      case (x::more) => (x + sumList(more))
    }
  }

  def sumList2(l : List[Int]) : Int = {
    l.foldLeft(0) { case (res, x) =>
      res + x
    }
  }

  def stringsToInts(sl : Array[String]) : List[Int] = {
    (sl.map { s => s.toInt }).toList
  }
}

object Main {
  import MyCode._

  def main(args: Array[String]) {
    val sum = MyCode.sumList(stringsToInts(args))
    val sum2 = MyCode.sumList2(stringsToInts(args))
    println("The sum is: "+sum+" ("+sum2+")")
  }
}
