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
}

// Matching.inorder(Node(Node(Leaf(123),124,Leaf(125)),126,Leaf(127)))
