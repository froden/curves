package no.nerbraten.curves.gfx

import org.scalatest.FunSuite

class BSplineFunctionalSuite extends FunSuite {
  test("should work") {
    val points = List(new Point(0, 0), new Point(10, 0), new Point(10, 10), new Point(0, 10))
    val bspline = new BSpline(points, 10)
    println(bspline.spline)
  }
}