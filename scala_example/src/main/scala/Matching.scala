sealed abstract class Tree
case class Node(left:Tree, data:Int, right:Tree) extends Tree
case class Leaf(data:Int) extends Tree

object Matching {
  def inorder(tree:Tree) : Unit = {
    tree match {
      case Leaf(d) =>
        println("Leaf -> "+d)
      case Node(left,d,right) =>
        inorder(left)
        println("Leaf -> "+d)
        inorder(right)
    }
  }

  def inorder2(tree:Tree) : List[Int] = {
    tree match {
      case Leaf(d) =>
        List(d)
      case Node(left,d,right) =>
        inorder2(left)++
        List(d)++
        inorder2(right)
    }
  }
}

// Matching.inorder(Node(Node(Leaf(123),124,Leaf(125)),126,Leaf(127)))
// Matching.inorder2(Node(Node(Leaf(123),124,Leaf(125)),126,Leaf(127)))

