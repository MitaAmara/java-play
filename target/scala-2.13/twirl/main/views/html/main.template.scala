
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
import scala.jdk.CollectionConverters._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*8.1*/("""
"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href=""""),_display_(/*14.35*/routes/*14.41*/.Assets.versioned("stylesheets/style.css")),format.raw/*14.83*/("""">
    <title>"""),_display_(/*15.13*/title),format.raw/*15.18*/("""</title>
</head>
<body>
    
    <ul>
        <li><a href=""""),_display_(/*20.23*/routes/*20.29*/.HomeController.index()),format.raw/*20.52*/("""">Home</a></li>
        <li><a href=""""),_display_(/*21.23*/routes/*21.29*/.HomeController.about()),format.raw/*21.52*/("""">About Us</a></li>
        <li><a href=""""),_display_(/*22.23*/routes/*22.29*/.HomeController.products()),format.raw/*22.55*/("""">Products</a></li>
    </ul>
    <hr>

    """),format.raw/*26.31*/("""
    """),format.raw/*27.5*/("""<!-- Content area -->
    """),_display_(/*28.6*/content),format.raw/*28.13*/("""

    """),format.raw/*30.5*/("""<hr>
    <div id="footer">
        <p>Page footer</p>
    </div>

</body>
</html>"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-02-23T14:27:08.455017
                  SOURCE: /home/kt-lap012/Documents/Java Play Project/helloWorld/app/views/main.scala.html
                  HASH: bed84d8c7c023b458b06fd39937d606aabc31822
                  MATRIX: 1165->260|1289->291|1316->292|1519->468|1534->474|1597->516|1639->531|1665->536|1752->596|1767->602|1811->625|1876->663|1891->669|1935->692|2004->734|2019->740|2066->766|2138->836|2170->841|2223->868|2251->875|2284->881
                  LINES: 32->7|37->8|38->9|43->14|43->14|43->14|44->15|44->15|49->20|49->20|49->20|50->21|50->21|50->21|51->22|51->22|51->22|55->26|56->27|57->28|57->28|59->30
                  -- GENERATED --
              */
          