package typingsJapgolly.semanticUiReact.genericMod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.react.mod.ReactNodeArray
import typingsJapgolly.react.mod.ReactPortal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.react.mod.ReactNode
  - TProps
  - typingsJapgolly.semanticUiReact.genericMod.SemanticShorthandItemFunc[TProps]
*/
trait SemanticShorthandItem[TProps] extends js.Object

object SemanticShorthandItem {
  @scala.inline
  implicit def apply[TProps](value: Boolean): SemanticShorthandItem[TProps] = value.asInstanceOf[SemanticShorthandItem[TProps]]
  @scala.inline
  implicit def apply[TProps](value: Double): SemanticShorthandItem[TProps] = value.asInstanceOf[SemanticShorthandItem[TProps]]
  @scala.inline
  implicit def apply[TProps](value: js.Object): SemanticShorthandItem[TProps] = value.asInstanceOf[SemanticShorthandItem[TProps]]
  @scala.inline
  implicit def apply[TProps](value: Element): SemanticShorthandItem[TProps] = value.asInstanceOf[SemanticShorthandItem[TProps]]
  @scala.inline
  implicit def apply[TProps](value: ReactNodeArray): SemanticShorthandItem[TProps] = value.asInstanceOf[SemanticShorthandItem[TProps]]
  @scala.inline
  implicit def apply[TProps](value: ReactPortal): SemanticShorthandItem[TProps] = value.asInstanceOf[SemanticShorthandItem[TProps]]
  @scala.inline
  implicit def apply[TProps](value: SemanticShorthandItemFunc[TProps]): SemanticShorthandItem[TProps] = value.asInstanceOf[SemanticShorthandItem[TProps]]
  @scala.inline
  implicit def apply[TProps](value: String): SemanticShorthandItem[TProps] = value.asInstanceOf[SemanticShorthandItem[TProps]]
  @scala.inline
  implicit def apply[TProps](value: TProps): SemanticShorthandItem[TProps] = value.asInstanceOf[SemanticShorthandItem[TProps]]
  @scala.inline
  implicit def fromUndef[TProps, T](value: js.UndefOr[T])(implicit ev: T => SemanticShorthandItem[TProps]): SemanticShorthandItem[TProps] = value.map(ev).asInstanceOf[T]
}

