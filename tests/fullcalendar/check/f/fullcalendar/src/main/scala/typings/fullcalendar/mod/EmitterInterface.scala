package typings.fullcalendar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmitterInterface extends js.Object {
  def on(types: js.Any, handler: js.Any): js.Any = js.native
}

object EmitterInterface {
  @scala.inline
  def apply(on: (js.Any, js.Any) => js.Any): EmitterInterface = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction2(on))
    __obj.asInstanceOf[EmitterInterface]
  }
  @scala.inline
  implicit class EmitterInterfaceOps[Self <: EmitterInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOn(value: (js.Any, js.Any) => js.Any): Self = this.set("on", js.Any.fromFunction2(value))
  }
  
}

