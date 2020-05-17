package typingsSlinky.react.mod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.react.mod.ReactChild
  - typingsSlinky.react.mod.ReactFragment
  - typingsSlinky.react.mod.ReactPortal
  - scala.Boolean
  - js.UndefOr[scala.Nothing]
*/
trait ReactNode extends js.Object

object ReactNode {
  @scala.inline
  implicit def apply(value: Boolean): TagMod[Any] = value.asInstanceOf[TagMod[Any]]
  @scala.inline
  implicit def apply(value: Double): TagMod[Any] = value.asInstanceOf[TagMod[Any]]
  @scala.inline
  implicit def apply(value: js.Object): TagMod[Any] = value.asInstanceOf[TagMod[Any]]
  @scala.inline
  implicit def apply(value: slinky.core.facade.ReactElement): TagMod[Any] = value.asInstanceOf[TagMod[Any]]
  @scala.inline
  implicit def apply(value: ReactNodeArray): TagMod[Any] = value.asInstanceOf[TagMod[Any]]
  @scala.inline
  implicit def apply(value: ReactPortal): TagMod[Any] = value.asInstanceOf[TagMod[Any]]
  @scala.inline
  implicit def apply(value: String): TagMod[Any] = value.asInstanceOf[TagMod[Any]]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => TagMod[Any]): TagMod[Any] = value.map(ev).asInstanceOf[T]
}

