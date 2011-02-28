package no.nerbraten.curves.applet

import java.awt.geom.Ellipse2D
import java.awt.{RenderingHints, Graphics2D, Color}
import swing.{Button, Orientation, BoxPanel, Applet}

class CurvesApplet extends Applet {
  val ui = new CurvesUi(Color.WHITE)

  class CurvesUi(backgroundColor: Color) extends UI {
    val mainPanel = new BoxPanel(Orientation.Vertical) {
      background = backgroundColor

      override def paint(g: Graphics2D) {
        g.setColor(Color.black)
        g.fillRect(0, 0, 10, 10)
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON)
        g.draw(new Ellipse2D.Double(100, 100, 30, 50));
        g.drawPolyline(Array(1, 20, 30, 40, 50, 60), Array(1, 5, 10, 40, 60, 100), 6)
      }

    }

    contents = mainPanel

    def init(): Unit = {}
  }

}