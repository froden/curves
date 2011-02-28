package no.nerbraten.curves.gfx

import org.scalatest.FunSuite

class BSplineFunctionalSuite extends FunSuite {
  test("should work") {
    val points = List(new Point(1, 1), new Point(200, 100), new Point(200, 200), new Point(200, 100))
    val bspline = new BSpline(points)
    println(bspline.spline())
  }

}