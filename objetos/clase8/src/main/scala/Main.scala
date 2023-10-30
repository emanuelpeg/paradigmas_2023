import model.Juego

import scala.io.StdIn
import scala.io.StdIn.readInt

/**
 * Es contratado para desarrollar un Juego. Dicho juego consiste
 * en que el usuario debe calcular el valor
 * faltante en una secuencia. Si el jugador contesta correctamente
 * gana un punto, de lo contrario resta un
 * punto.
 * Es decir al usuario se le presenta una secuencia de 4 números,
 * de los cuales falta el tercero. El jugador
 * debe completar el valor que falta en secuencia. Diseñe este
 * juego de tal manera que se puedan agregar
 * muchos tipos de secuencias (pares, impares, fiboncci,
 * multiplos de 5, etc) de forma fácil.
 */

@main def hello: Unit =
  var op = "ok"

  while (op == "ok") {

    println("Serie " + Juego.getValor0() + " , " + Juego.getValor1() + " ___ " + Juego.getValor3())
    println()
    print(" Indique el valor faltante : ")
    val i = readInt()

    if (Juego.isValid(i)) {
      println(" Ganaste !! Puntaje : " + Juego.puntos)
    } else {
      println(" Perdiste !! Puntaje : " + Juego.puntos)
    }

    println(" Si desea continuar ingrese ok : ")
    op = StdIn.readLine()

  }

  println(" chau !! ")
