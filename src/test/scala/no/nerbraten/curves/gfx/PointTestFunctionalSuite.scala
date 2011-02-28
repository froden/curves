package no.nerbraten.curves.gfx

import org.scalatest.FunSuite

class PointTestFunctionalSuite extends FunSuite {
  test("A Point should print it's coordinates") {
    expect("1, 2") {
      new Point(1, 2).toString
    }
  }
}