object Clase1 {

  /**
   * Ejercicio -2
   *
   * Defina una función que calcule el cuadrado de un número
   */
  def cuadrado(n: Long): Long = ???

  /**
   * Ejercicio -1
   *
   * Defina una función que calcule la enésima potencia positiva de un número
   */
  def potencia(n: Long, v: Int): Long = ???

  /**
   * Ejercicio 0
   *
   * Realice una función que calcule el factorial de un nro n
   */
  def factorial(n: Long): Long = ???


  /**
   * Ejercicio 1
   *
   * Realice una función que calcule el enesimo numero de fibonacci
   */
  def fibonacci(n: Int): Long = ???


  /**
   * Ejercicio 2
   * Realice una funcion que dado el numero de fila y columna,
   * calcule el valor del numero que se encuentre el la piramide de Pascal
   */
  def pascal(c: Int, r: Int): Int = ???

  /**
   * Ejercicio 3
   * Realice una función que permita saber si un texto tiene los parentesis balanceados, por ejemplo:
   * () => OK
   * ((()))() => OK
   * (()()) => OK
   * (()())) => no OK
   * (()(()) => no OK
   * )( => no OK
   */
  def balance(chars: List[Char]): Boolean = ???

  /**
   * Ejercicio 4
   * Realice una función que cuente cuantas combinaciones pueden existir con monedas para un valor determinado, por ejemplo:
   * monedas (1,2) y valor es 4 , podemos llegar con las siguientes convinaciones (1,1,1,1) (1,1,2) (2,2)
   * por lo que la función debería retornar 3.
   */
  def countChange(money: Int, coins: List[Int]): Int = ???

  /**
   * Ejercicio 5
   * Realice una función que indique si una lista de letras es palindromo
   * () -> true
   * ('a','l','a') -> true
   * ('a','l','l','a') -> true
   * ('h','a','l','l','a') -> false
   */
  def isPalindrome(word: List[Char]): Boolean = ???

  /**
   * Ejercicio 6
   * Realice una función que dado un entero lo convierta a binario   */
  def binario(nro : Int): Int = ???

  /**
   * Ejercicio 8
   * Realice una función que dado un entero lo convierta a octal */
  def octal(nro: Int): Int = ???

  /**
   * Ejercicio 9
   * Realice una función que dado dos enteros calcule el mayor comun divisor */
  def mcd(a: Int, b: Int): Int = ???
}
