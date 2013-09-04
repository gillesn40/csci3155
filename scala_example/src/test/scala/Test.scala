import org.scalatest.FlatSpec
import scala.collection.mutable.Stack

class MySpec extends FlatSpec {
  "My Code" should "recursively sum a list of integers properly" in {
    val myList = List[Int](1,2,3)

    assert(MyCode.sumList(myList) === 6)

    def expectedCount(n : Int) : Int = {
      n*(n+1)/2
    }

    (1 to 100).foreach { x =>
      assert(MyCode.sumList((1 to x).toList) === expectedCount(x))
    }
  }

  it should "sum properly sum a list of integers using the fold operation(s)" in {
    val myList = List[Int](1,2,3)

    assert(MyCode.sumList2(myList) === 6)
  }

  "Fib (Euler2)" should "sum a few numbers correctly" in {
    assert(Euler2.fib(21) === 10)
  }

  it should "give the correct final answer" in {
    assert(Euler2.answer === 4613732)
  }

  "Factors (Euler3)" should "compute the largest prime factor of 10" in {
    assert(Euler3.factorize(10) === 5)
  }

  it should "give the correct final answer" in {
    assert(Euler3.answer === 6857)
  }

  "MyMap" should "properly use an addition map" in {
    assert(MyMap.map(List(1,2,3,4,5), x=>x+1) === List(2,3,4,5,6))
  }

  it should "properly use a multiplication map" in {
    assert(MyMap.map(List(1,2,3,4,5), x=>x*2) === List(2,4,6,8,10))
  }
}
