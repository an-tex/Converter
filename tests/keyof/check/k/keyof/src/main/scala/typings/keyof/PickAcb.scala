package typings.keyof

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<keyof.A, 'c' | 'b'> */
@js.native
trait PickAcb extends js.Object {
  var b: Double = js.native
  var c: Double = js.native
}

object PickAcb {
  @scala.inline
  def apply(b: Double, c: Double): PickAcb = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickAcb]
  }
  @scala.inline
  implicit class PickAcbOps[Self <: PickAcb] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other /* <: js.Any */](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withB(b: Double): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("b")(b.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def withC(c: Double): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("c")(c.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
  }
  
}

