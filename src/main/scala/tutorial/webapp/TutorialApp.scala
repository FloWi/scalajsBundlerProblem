package tutorial.webapp

import org.scalajs.dom
import org.scalajs.dom.document

object TutorialApp {
  def main(args: Array[String]): Unit = {

    appendPar(document.body, "Hello world!")

    draw()
  }

  def draw(): Unit = {
    println("trying to render")

    import plotly._
    import plotly.element._

    val trace1 = Scatter(
      Seq(1, 2, 3, 4),
      Seq(10, 15, 13, 17)
    )

    val trace2 = Scatter(
      Seq(1, 2, 3, 4),
      Seq(16, 5, 11, 9)
    )

    val data = Seq(trace1, trace2)

    Plotly.plot("plot-target", data)
  }

  def appendPar(targetNode: dom.Node, text: String): Unit = {
    val parNode = document.createElement("div")
    val textNode = document.createTextNode(text)
    parNode.appendChild(textNode)
    targetNode.appendChild(parNode)
  }
}
