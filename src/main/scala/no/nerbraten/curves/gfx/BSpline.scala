package no.nerbraten.curves.gfx

/**
 *
 * switch (i) {
    case -2:
      return (((-t+3)*t-3)*t+1)/6;
    case -1:
      return (((3*t-6)*t)*t+4)/6;
    case 0:
      return (((-3*t+3)*t+3)*t+1)/6;
    case 1:
      return (t*t*t)/6;
 *
 */

class BSpline(controlPoints: List[Point]) {
  private val points = controlPoints


  def s(t: Float): Point = {
    points(0)*((((-t+3)*t-3)*t+1)/6) + points(1)*((((3*t-6)*t)*t+4)/6) + points(2)*((((-3*t+3)*t+3)*t+1)/6) + points(3)*((t*t*t)/6)
  }

  def spline(): List[Point] = {
    val steps = 100
    var splinePoints: List[Point] = Nil
    for(i <- 0 until steps) {
      println(i)
      val point = s(i/steps.floatValue)
      println(point)
      splinePoints = point :: splinePoints
    }
    splinePoints
  }
}