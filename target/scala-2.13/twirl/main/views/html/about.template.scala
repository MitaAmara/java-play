
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

object about extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /*
* This template takes a two arguments, a String containing a
* message to display and an AssetsFinder to locate static assets.
*/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*6.2*/main("About Us")/*6.18*/ {_display_(Seq[Any](format.raw/*6.20*/("""
    """),format.raw/*7.36*/("""
    """),format.raw/*8.5*/("""<h1>The About Page</h1>
    <h3>email@mita.com</h3>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-02-22T16:22:33.296670
                  SOURCE: /home/kt-lap012/Documents/Java Play Project/helloWorld/app/views/about.scala.html
                  HASH: 63f8895bc69b36d0b4ef985eac3c252b17e4acf5
                  MATRIX: 1117->135|1141->151|1180->153|1212->189|1243->194
                  LINES: 35->6|35->6|35->6|36->7|37->8
                  -- GENERATED --
              */
          