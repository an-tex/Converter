package typings.webpackEnv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object WebpackModuleApi {
  type Require1 = js.Function1[/* id */ java.lang.String, js.Any]
  type Require2 = js.Function1[/* id */ java.lang.String, js.Any]
  type RequireLambda = typings.webpackEnv.WebpackModuleApi.Require1 with typings.webpackEnv.WebpackModuleApi.Require2
}
