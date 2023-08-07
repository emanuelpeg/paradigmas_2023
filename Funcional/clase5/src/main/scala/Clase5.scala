object Clase5 {

  /**
   * Realice la función Map
   */
  def map[T, M](lista: List[T], fx: T => M): List[M] = ???

  /**
   * Realice la función reduce
   */
  def reduce[T](lista: List[T], acu: T, fx: (T, T) => T): T = ???

  /*
    * Busca el Maximo
    */
  def max(lista: List[Int]): Int = ???

  /*
   * Busca el minimo
   */
  def min(lista: List[Int]): Int = ???


  /*
   * Busca la mediana
   * En el ámbito de la estadística, la mediana representa el
   * valor de la variable de posición central en un conjunto de datos ordenados.
  */
  def mediana(lista: List[Int]): Int = ???

  // filtra la lista de valores mayores que el valor e pasado por parametro
  def maximos(lista: List[Int], e: Int): List[Int] = ???

  // filtra la lista de valores menores que el valor e pasado por parametro
  def minimos(lista: List[Int], e: Int): List[Int] = ???

  // Ordena los valores de una lista utilizando quicksort
  def QuickSort(xs: List[Int]): List[Int] = ???

  //Obtiene un elemento en la posición n
  def ObtenerElemento(lista: List[Int], posicion: Int): Int = ???

  /**
   * Cuenta los elementos
   */
  def contar(lista: List[Int]): Int = ???

  // Acumula los elementos
  def acc(lista: List[Int]): Int = ???


  /**
   * Filtra los elementos de la lista xs segun la funcion p
   */
  def filtrar(xs: List[Int], p: Int => Boolean): List[Int] = ???

  /**
   * Filtra los elementos pares usando filtrar
   */
  def filtrarPares(xs: List[Int]): List[Int] = ???

  /**
   * Filtra los elementos multiplos de 3 usando filtrar
   */
  def filtrarMultiplosDeTres(xs: List[Int]): List[Int] = ???

  /**
   * Acumula los elementos aplicandoles fx
   */
  def acumular(lista: List[Int])(fx: (Int) => Int): Int = ???


  /**
   * Acumula todos los elementos de una lista usando acumula
   */
  def acumularUnidad(lista: List[Int]): Int = ???

  /**
   * Acumula  el dobles de los elementos de una lista usando acumula
   */
  def acumularDoble(lista: List[Int]): Int = ???

  /**
   * Acumula el cuadrado de los elementos de una lista usando acumula
   */
  def acumularCuadrado(lista: List[Int]): Int = ???

  /**
   * Une 2 listas pasada por parametros
   */
  def unir(lista: List[Int], otraLista: List[Int]): List[Int] = ???

  /**
   * Transforma la lista a un lista de otro tipo
   */
  def transformar[T](lista: List[Int], fx: (Int) => (T)): List[T] = ???

  /**
   * retorna true si un elemento existe en la lista
   */
  def existe(lista: List[Int], nro: Int): Boolean = ???

  /**
   * Une 2 listas pasada por parametros pero ignora los repetidos
   */
  def unirOfSet(lista: List[Int], otraLista: List[Int]): List[Int] = ???

}
