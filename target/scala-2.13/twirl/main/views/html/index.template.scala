
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
    """),format.raw/*8.5*/("""<!-- this css class is not part of bootstrap but is defined in /css/style.css -->
    <div class="starter-template">
        <h1>Bootstrap starter template</h1>
        <p class="lead">Use this document as a way to quickly start any new project.<br> All you get is this text and a mostly barebones HTML document.</p>
        <p> for details see <a href="https://getbootstrap.com/docs/4.0/examples/">https://getbootstrap.com/docs/4.0/examples/</a></p>
        <h4>To learn more about bootstrap 4 (including how to customise this page) see:</h4>
        <p><a href="https://www.w3schools.com/bootstrap4/bootstrap_get_started.asp">W3Schools - Get started with Bootstrap 4</a></p>
        <p><a href="https://www.w3schools.com/bootstrap4/default.asp">W3Schools - Bootstrap 4 Tutorial</a></p>
        <p><a href="https://www.w3schools.com/bootstrap4/bootstrap_ref_all_classes.asp">W3Schools - Bootstrap 4 Reference</a></p>
        <h4>For general HTML and CSS see:</h4>
        <p><a href="https://www.w3schools.com/tags/default.asp">W3Schools - HTML 5</a></p>
        <p><a href="https://www.w3schools.com/cssref/default.asp">W3Schools - CSS</a></p>
    </div>
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
                  DATE: 2021-02-24T13:38:00.139270
                  SOURCE: /home/kt-lap012/Documents/Java Play Project/helloWorld/app/views/index.scala.html
                  HASH: 9138210a6189395c146056e56b3b043ef2219d9a
                  MATRIX: 1035->134|1146->152|1173->154|1198->171|1237->173|1268->178
                  LINES: 30->5|35->6|36->7|36->7|36->7|37->8
                  -- GENERATED --
              */
          