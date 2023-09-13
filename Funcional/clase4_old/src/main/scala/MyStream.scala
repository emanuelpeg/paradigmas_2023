object MyStream {

  abstract class AbstractLazyList

  case class EmptyLazyList() extends AbstractLazyList {

    override def toString(): String = " ... "

  }

  case class LazyList(val head: Int, val tail: AbstractLazyList) extends AbstractLazyList {

    override def toString(): String = head.toString() + " ... "

  }

  def isEmpty(l: => AbstractLazyList): Boolean = ???

  def size(l: => AbstractLazyList): Int = ???

  def equalsList(l: AbstractLazyList, other: => AbstractLazyList): Boolean = ???

  /*
   * Agrega un elemento primero 
   */
  def add(element: Int, l: => AbstractLazyList): AbstractLazyList = ???

  /*
 * Agrega un elemento en la ultima posición 
 */
  def addLast(element: Int, l: => AbstractLazyList): AbstractLazyList = ???


  /** crea una lista desde un rango */
  def range(start: Int, end: Int, step: Int): AbstractLazyList = ???

  /** imprime todos los valores */
  def toStringAll(l: => AbstractLazyList): String = ???

}
