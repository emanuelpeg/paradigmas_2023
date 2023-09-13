object MyList {

  sealed abstract class AbstractList

  case class EmptyList() extends AbstractList {

    override def toString(): String = " "

  }

  case class MyList(head: Int, tail: AbstractList) extends AbstractList {

    override def toString(): String = head.toString() + ", "+ tail.toString

  }

  def isEmpty(l: AbstractList): Boolean = ???

  def size(l: AbstractList): Int = ???

  def equalsList(l: AbstractList, other: AbstractList): Boolean = ???

  /*
   * Agrega un elemento primero
   */
  def add(element: Int, l: AbstractList): AbstractList = ???

  /*
 * Agrega un elemento en la ultima posición
 */
  def addLast(element: Int, l: AbstractList): AbstractList = ???

  /** crea una lista desde un rango */
  def range(start: Int, end: Int, step: Int): AbstractList = ???

  /** imprime todos los valores */
  def toStringAll(l: AbstractList): String = l.toString

  class MyLazyList(val head : Int, val tail: () => AbstractList) {
    def sizeLazy() = 1 + size(tail.apply())
  }

  /** Creates a new LazyList. */
  def newLazyList(head: Int, state: => AbstractList): MyLazyList = ???

  /**
   * Create an infinite LazyList starting at `start` and incrementing by
   * step `step`.
   */
  def from(start: Int, end: Int, step: Int): MyLazyList = ???

  /**
   * Create an infinite LazyList starting at `start` and incrementing by
   * step `step`.
   */
  def from(start: Int, step: Int): MyLazyList = ???

  /**
   * Create an infinite LazyList starting at `start` and incrementing by `1`.
   */
  def from(start: Int): MyLazyList = ???

}
