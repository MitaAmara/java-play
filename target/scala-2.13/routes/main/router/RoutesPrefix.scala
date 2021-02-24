// @GENERATOR:play-routes-compiler
// @SOURCE:/home/kt-lap012/Documents/Java Play Project/helloWorld/conf/routes
// @DATE:Tue Feb 23 14:24:32 WIB 2021


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
