package no.nerbraten.curves.gfx

import org.scalatest.FunSuite

class PointTestFunctionalSuite extends FunSuite {
  test("A Point should print it's name and coordinates") {
    expect("Point(1, 2)") {
      new Point(1, 2).toString
    }
  }

  test("When adding two points, the x and y coordinates of the points should be added") {
    val p1 = new Point(1, 2)
    val p2 = new Point(2, 3)
    p1 + p2 === new Point(3, 5)
  }

  test("When multiplying a point with a scalar, the point's x and y should be multiplied with the scalar") {
    val p1 = new Point(1, 2)
    p1 * 4 === new Point(4, 8)
  }
}