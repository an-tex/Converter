package typings.fpDashTs

import typings.fpDashTs.libHKTMod.HKT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Never extends js.Object {
  var never: HKT[scala.Nothing, scala.Nothing] = js.native
}

object Anon_Never {
  @scala.inline
  def apply(never: HKT[scala.Nothing, scala.Nothing]): Anon_Never = {
    val __obj = js.Dynamic.literal(never = never.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Never]
  }
}

