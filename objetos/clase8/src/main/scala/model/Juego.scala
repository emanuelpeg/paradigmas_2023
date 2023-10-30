package model

import model.serie.{Serie, SerieFibonacci, SerieImpar, SerieNormal, SeriePar}

import scala.util.Random

object Juego {

  var serie : Serie = null
  var puntos = 0
  
  def generarSerie():Unit = {
    val selector = Random.nextInt(4);
    
    selector match {
      case 0 => serie = new SerieNormal()
      case 1 => serie = new SeriePar()
      case 2 => serie = new SerieFibonacci()
      case _ => serie = new SerieImpar()
    }
  } 
  
  generarSerie()
  
  def getValor0() = serie.serie(0)
  def getValor1() = serie.serie(1)
  def getValor3() = serie.serie(3)
  
  def isValid(i: Int):Boolean = 
    if (i == serie.serie(2)) {
       puntos= puntos+1
       generarSerie()
       true
    } else {
      generarSerie()
      false
    }
  
}