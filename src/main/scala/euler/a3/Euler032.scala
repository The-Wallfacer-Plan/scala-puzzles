package euler.a3

object Euler032 extends App {
  //
  def f: Int = {
    val N = 10000
    val sqrt = math.sqrt(N.toDouble).toInt
    val pl = for {
      i <- 2 to sqrt; j <- 2 to N / i; p = i * j
      s = i.toString + j.toString + p.toString; ss = s.toSet
      if s.length == 9 && ss.size == 9 && !s.contains('0')
    } yield p
    pl.distinct.sum
  }

  import utils.Bench._

  pTimeIt(f)

}
