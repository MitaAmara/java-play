
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /*
* This template takes a two arguments, a String containing a
* message to display and an AssetsFinder to locate static assets.
*/
  def apply/*5.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*6.1*/("""
"""),_display_(/*7.2*/main("Home Page")/*7.19*/ {_display_(Seq[Any](format.raw/*7.21*/("""
    """),format.raw/*8.23*/("""
    """),format.raw/*9.5*/("""<h1>The Home Page</h1>
    <h2>"""),_display_(/*10.10*/message),format.raw/*10.17*/("""</h2>
    <h3>email@mita.com</h3>
""")))}))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-02-22T16:19:17.443917
                  SOURCE: /home/kt-lap012/Documents/Java Play Project/helloWorld/app/views/index.scala.html
                  HASH: b870bb6408869f644993e0c86372913277074e47
                  MATRIX: 1035->134|1146->152|1173->154|1198->171|1237->173|1269->196|1300->201|1359->233|1387->240
                  LINES: 30->5|35->6|36->7|36->7|36->7|37->8|38->9|39->10|39->10
                  -- GENERATED --
              */
          