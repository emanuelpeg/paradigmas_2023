class Alumno(private val dni : Long) {
  var notas = new ListBuffer[Long]()

  def agregarNota(nota : Long): Unit = {
    this.notas.add(nota)
  }

  private def canEqual(other: Any): Boolean = other.isInstanceOf[Alumno]

  override def equals(other: Any): Boolean = other match
    case that: Alumno =>
      that.canEqual(this) &&
        dni == that.dni
    case _ => false

  override def hashCode(): Int =
    val state = Seq(dni)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
}