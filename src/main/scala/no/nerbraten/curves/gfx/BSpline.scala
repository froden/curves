package no.nerbraten.curves.gfx


class BSpline(controlPoints: List[Point], resolution: Int = 10) {

  lazy val spline = controlPoints.sliding(4).map(calculateSegment(_)).toList.flatten

  private def calculateSegment(segmentPoints: List[Point]) = {
    (0 until resolution).map(i => calculatePoint(i/resolution.floatValue, segmentPoints))
  }

  private def calculatePoint(t: Float, segmentPoints: List[Point]): Point = {
    segmentPoints(0)*((((-t+3)*t-3)*t+1)/6) +
      segmentPoints(1)*((((3*t-6)*t)*t+4)/6) +
      segmentPoints(2)*((((-3*t+3)*t+3)*t+1)/6) +
      segmentPoints(3)*((t*t*t)/6)
  }
}