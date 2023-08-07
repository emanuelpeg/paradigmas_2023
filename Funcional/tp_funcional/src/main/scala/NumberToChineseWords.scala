
/**
 * Realice una función que dado un numero natural lo escriba en Financial Chinese characters
 */
object NumberToChineseWords {

  val digits:Map[Int, String] = Map(0 -> "〇", 1 -> "壹", 2 -> "貳", 3 -> "參", 4 -> "肆", 5 -> "伍", 6 -> "陸", 7 -> "柒", 8 -> "捌", 9 -> "玖");
  val exponent:Map[Int, String] = Map(1 -> "", 10 -> "拾", 100 -> "佰", 1000 -> "仟", 10000 -> "萬", 100000 -> "億", 1000000 -> "兆");

  def format(unit: Int): String = ???


}