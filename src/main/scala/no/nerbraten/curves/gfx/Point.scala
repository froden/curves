package no.nerbraten.curves.gfx

class Point(xv: Int, yv: Int) {
  private val x = xv;
  private val y = yv;

  def +(point: Point) = {
    new Point(x + point.x, y + point.y)
  }

  def *(scalar: Float) = {
    new Point((x * scalar).round, (y * scalar).round)
  }

  override def toString = x + ", " + y
}