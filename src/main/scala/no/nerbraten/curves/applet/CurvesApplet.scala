package no.nerbraten.curves.applet

import java.awt.geom.Ellipse2D
import java.awt.{RenderingHints, Graphics2D, Color}
import swing.{Button, Orientation, BoxPanel, Applet}
import no.nerbraten.curves.gfx.{Point, BSpline}

class CurvesApplet extends Applet {
  val ui = new CurvesUi(Color.WHITE)

  class CurvesUi(backgroundColor: Color) extends UI {
    val mainPanel = new BoxPanel(Orientation.Vertical) {
      background = backgroundColor

      override def paint(g: Graphics2D) {
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON)
        g.setColor(Color.black)
        g.fillRect(0, 0, 10, 10)
        //g.draw(new Ellipse2D.Double(100, 100, 30, 50));
        //g.drawPolyline(Array(1, 20, 30, 40, 50, 60), Array(1, 5, 10, 40, 60, 100), 6)
        val points = List(
          new Point(1, 1),
          new Point(200, 100),
          new Point(200, 200),
          new Point(300, 100),
          new Point(300, 200),
          new Point(100, 300),
          new Point(0, 200)
        )
        val bspline = new BSpline(points)
        points.foreach(point => g.draw(new Ellipse2D.Double(point.x, point.y, 10, 10)))
        bspline.spline.sliding(2).foreach(points => g.drawLine(points(0).x, points(0).y, points(1).x, points(1).y))
      }

    }

    contents = mainPanel

    def init(): Unit = {}
  }

}