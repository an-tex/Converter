package typings.node.streamMod

import typings.node.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WritableOptions extends js.Object {
  var `final`: js.UndefOr[
    js.Function1[/* callback */ js.Function1[/* error */ js.UndefOr[Error], Unit], Unit]
  ] = js.native
}

object WritableOptions {
  @scala.inline
  def apply(`final`: /* callback */ js.Function1[/* error */ js.UndefOr[Error], Unit] => Unit = null): WritableOptions = {
    val __obj = js.Dynamic.literal()
    if (`final` != null) __obj.updateDynamic("final")(js.Any.fromFunction1(`final`))
    __obj.asInstanceOf[WritableOptions]
  }
  @scala.inline
  implicit class WritableOptionsOps[Self <: WritableOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other /* <: js.Any */](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFinal(`final`: /* callback */ js.Function1[/* error */ js.UndefOr[Error], Unit] => Unit): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (`final` != null) ret.updateDynamic("final")(js.Any.fromFunction1(`final`))
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def withoutFinal: Self = {
        val ret = this.duplicate
        js.special.delete(ret, "final")
        ret.asInstanceOf[Self]
    }
  }
  
}

