package model.serie

import scala.util.Random

/**
 * @author emanuel
 *
 */
abstract class Serie {
  
  var semilla = Random.nextInt(20) + 1;
  
  def generate(): Seq[Int];
  
  val serie : Seq[Int]= generate();

}