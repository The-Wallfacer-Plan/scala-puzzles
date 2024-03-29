package s99

object SLogic {

  // 46
  def and(a: Boolean, b: Boolean): Boolean = if (a) {
    b
  } else {
    false
  }

  def or(a: Boolean, b: Boolean): Boolean = if (a) {
    true
  } else {
    b
  }

  def nand(a: Boolean, b: Boolean): Boolean = !and(a, b)

  def nor(a: Boolean, b: Boolean): Boolean = !or(a, b)

  def xor(a: Boolean, b: Boolean): Boolean = if (a == b) false else true

  def impl(a: Boolean, b: Boolean): Boolean = if (a) {
    b
  } else {
    true
  }

  def equ(a: Boolean, b: Boolean): Boolean = !xor(a, b)

  def table(f: (Boolean, Boolean) => Boolean): Unit = {
    println("A\t\tB\t\tresult")
    for (a <- Array(true, false); b <- Array(true, false)) {
      println(f"$a%-8b$b%-8b${f(a, b)}")
    }
  }

  // 47 TODO

  // 48 TODO omitted

  // 49
  val grayList = List("0", "1")

  def gray(n: Int): List[String] = n match {
    case _ if n < 1 => throw new IllegalArgumentException
    case 1 => grayList
    case _ => {
      val l = gray(n - 1)
      l.map("0" + _) ::: l.reverse.map("1" + _)
    }
  }

  // 50 TODO
  // https://www.siggraph.org/education/materials/HyperGraph/video/mpeg/mpegfaq/huffman_tutorial.html
  def huffman(l: List[(String, Int)]): List[(String, String)] = {
//    abstract class CodeTree
//    val sortedList = l.sortWith((a, b) => a._2 < b._2)
    Nil
  }


}
