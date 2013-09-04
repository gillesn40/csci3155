object MyMap {
  def map(list:List[Int], f:Int=>Int) : List[Int] = {
    list match {
      case List() => List()
      case a::more => f(a)::map(more,f)
    }
  }
}
