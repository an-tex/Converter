package typingsSlinky.semanticDashUiDashReact.distCommonjsElementsButtonButtonOrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictButtonOrProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  /** Additional classes. */
  var className: js.UndefOr[String] = js.native
  /** Or buttons can have their text localized, or adjusted by using the text prop. */
  var text: js.UndefOr[Double | String] = js.native
}

object StrictButtonOrProps {
  @scala.inline
  def apply(as: js.Any = null, className: String = null, text: Double | String = null): StrictButtonOrProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictButtonOrProps]
  }
}

