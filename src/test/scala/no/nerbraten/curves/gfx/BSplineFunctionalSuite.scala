package no.nerbraten.curves.gfx

import org.scalatest.FunSuite

class BSplineFunctionalSuite extends FunSuite {

  test("Should calculate the points on the spline based on the given control points and resolution") {
    val points = List(new Point(0, 0), new Point(10, 0), new Point(10, 10), new Point(0, 10))
    val bspline = new BSpline(points, 10)
    val ps = bspline.spline
    //println(ps)
    ps(0) === new Point(9, 2)
    ps(1) === new Point(9, 2)
    ps(2) === new Point(9, 3)
    ps(3) === new Point(9, 3)
    ps(4) === new Point(9, 4)
    ps(5) === new Point(10, 5)
    ps(6) === new Point(9, 5)
    ps(7) === new Point(9, 7)
    ps(8) === new Point(9, 7)
    ps(9) === new Point(9, 8)
  }
}