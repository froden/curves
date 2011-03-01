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

class BSpline(controlPoints: List[Point], resolution: Int = 100) {
  private val points = controlPoints
  private val steps = resolution


  def calculatePoint(t: Float): Point = {
    points(0)*((((-t+3)*t-3)*t+1)/6) + points(1)*((((3*t-6)*t)*t+4)/6) + points(2)*((((-3*t+3)*t+3)*t+1)/6) + points(3)*((t*t*t)/6)
  }

  def spline() = {
    (0 until steps).map(i => calculatePoint(i/steps.floatValue))
  }
}