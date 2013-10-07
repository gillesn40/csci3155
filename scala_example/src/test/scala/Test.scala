import org.scalatest.FlatSpec
import scala.collection.mutable.Stack
import scala.util.parsing.input._

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

  "Matching" should "properly order a tree" in {
    assert(Matching.inorder2(Node(Node(Leaf(123),124,Leaf(125)),126,Leaf(127)))
 === List(123,124,125,126,127))
  }

  "Simple Parser Combinators" should "properly compute sums/products" in {
    assert(SimpleParser.parse("0") === 0.0f)
    assert(SimpleParser.parse("1+1+1+1+1+1+1+1+1") === 9.0f)
    assert(SimpleParser.parse("1+2+3+4+5") === 15.0f)
    assert(SimpleParser.parse("123*0.0") === 0.0f)
    assert(SimpleParser.parse("1*2*3*4*5") === 120.0f)
    assert(SimpleParser.parse("1*2+2*3+3*4+4*5") === 40.0f)
    assert(SimpleParser.parse("1*2+2*(3+3)*4+4*5") === 70.0f)
    assert(SimpleParser.parse("1+2+((3*(2+2)))") === 15.0f)
  }
}
