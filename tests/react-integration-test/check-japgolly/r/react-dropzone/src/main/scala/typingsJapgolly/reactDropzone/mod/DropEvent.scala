package typingsJapgolly.reactDropzone.mod

import japgolly.scalajs.react.ReactDragEventFrom
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.react.mod.DragEvent[typingsJapgolly.std.HTMLElement]
  - typingsJapgolly.react.mod.ChangeEvent[typingsJapgolly.std.HTMLInputElement]
  - typingsJapgolly.std.DragEvent
  - typingsJapgolly.std.Event
*/
trait DropEvent extends js.Object

object DropEvent {
  @scala.inline
  implicit def apply(value: DragEvent | Event): DropEvent = value.asInstanceOf[DropEvent]
  @scala.inline
  implicit def apply(value: ReactEventFrom[HTMLInputElement]): DropEvent = value.asInstanceOf[DropEvent]
  @scala.inline
  implicit def apply(value: ReactDragEventFrom[HTMLElement]): DropEvent = value.asInstanceOf[DropEvent]
}

