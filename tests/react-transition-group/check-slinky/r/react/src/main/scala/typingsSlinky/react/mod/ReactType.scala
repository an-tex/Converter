package typingsSlinky.react.mod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.react.mod.ComponentType[P]
*/
trait ReactType[P] extends js.Object

object ReactType {
  @scala.inline
  implicit def apply[P](value: ComponentClass[P]): ReactComponentClass[P] = value.asInstanceOf[ReactComponentClass[P]]
  @scala.inline
  implicit def apply[P](value: StatelessComponent[P]): ReactComponentClass[P] = value.asInstanceOf[ReactComponentClass[P]]
  @scala.inline
  implicit def apply[P](value: String): ReactComponentClass[P] = value.asInstanceOf[ReactComponentClass[P]]
}

