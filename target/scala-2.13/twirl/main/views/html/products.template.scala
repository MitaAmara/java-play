
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

object products extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.Product,play.twirl.api.HtmlFormat.Appendable] {

  /*
* This template takes a two arguments, a String containing a
* message to display and an AssetsFinder to locate static assets.
*/
  def apply/*6.2*/(product: models.Product):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.1*/("""
"""),_display_(/*8.2*/main("Products")/*8.18*/ {_display_(Seq[Any](format.raw/*8.20*/("""
    """),format.raw/*9.5*/("""<!-- https://getbootstrap.com/docs/4.0/layout/grid/ -->
    <div class="row">
        <div class="col-md-2">

            <!-- https://getbootstrap.com/docs/components/list-group/ -->
            <div class="list-group">
                <a href="#" class="list-group-item list-group-item-action">All Categories</a>
            </div>
        </div>

        <div class="col-md-auto">
            <!-- https://getbootstrap.com/docs/4.0/content/tables/ -->
            <table class="table table-hover">
                <thead>
                    <th scope="col">ID</th>
                    <th scope="col">Name</th>
                    <th scope="col">Category</th>
                    <th scope="col">Description</th>
                    <th scope="col">Stock</th>
                    <th scope="col">Price</th>
                </thead>
                <tbody>
                    <tr scope="row">
                        <td>"""),_display_(/*32.30*/product/*32.37*/.getId),format.raw/*32.43*/("""</td>
                        <td>"""),_display_(/*33.30*/product/*33.37*/.getName),format.raw/*33.45*/("""</td>
                        <td>"""),_display_(/*34.30*/product/*34.37*/.getCategory),format.raw/*34.49*/("""</td>
                        <td>"""),_display_(/*35.30*/product/*35.37*/.getDescription),format.raw/*35.52*/("""</td>
                        <td>"""),_display_(/*36.30*/product/*36.37*/.getStock),format.raw/*36.46*/("""</td>
                        <td>&euro;"""),_display_(/*37.36*/product/*37.43*/.getPrice),format.raw/*37.52*/("""</td>
                    </tr>
                </tbody>
                <tfoot>
                    <tr scope="row"></tr>
                </tfoot>
            </table>
        </div>
    </div>
""")))}))
      }
    }
  }

  def render(product:models.Product): play.twirl.api.HtmlFormat.Appendable = apply(product)

  def f:((models.Product) => play.twirl.api.HtmlFormat.Appendable) = (product) => apply(product)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-02-25T16:05:01.361936
                  SOURCE: /home/kt-lap012/Documents/Java Play Project/helloWorld/app/views/products.scala.html
                  HASH: 7f4f0aa8fd051280fbd3a3102d8801508f488644
                  MATRIX: 1046->135|1165->161|1192->163|1216->179|1255->181|1286->186|2240->1113|2256->1120|2283->1126|2345->1161|2361->1168|2390->1176|2452->1211|2468->1218|2501->1230|2563->1265|2579->1272|2615->1287|2677->1322|2693->1329|2723->1338|2791->1379|2807->1386|2837->1395
                  LINES: 30->6|35->7|36->8|36->8|36->8|37->9|60->32|60->32|60->32|61->33|61->33|61->33|62->34|62->34|62->34|63->35|63->35|63->35|64->36|64->36|64->36|65->37|65->37|65->37
                  -- GENERATED --
              */
          