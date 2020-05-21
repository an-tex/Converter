package typingsJapgolly.react.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactAnimationEventFrom
import japgolly.scalajs.react.ReactClipboardEventFrom
import japgolly.scalajs.react.ReactCompositionEventFrom
import japgolly.scalajs.react.ReactDragEventFrom
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactPointerEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import japgolly.scalajs.react.ReactTransitionEventFrom
import japgolly.scalajs.react.ReactUIEventFrom
import japgolly.scalajs.react.ReactWheelEventFrom
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.AnonHtml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMAttributes[T] extends js.Object {
  var children: js.UndefOr[Node] = js.native
  var dangerouslySetInnerHTML: js.UndefOr[AnonHtml] = js.native
  // Media Events
  var onAbort: js.UndefOr[ReactEventHandler[T]] = js.native
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[T]] = js.native
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[T]] = js.native
  // Animation Events
  var onAnimationStart: js.UndefOr[AnimationEventHandler[T]] = js.native
  // MouseEvents
  var onAuxClick: js.UndefOr[MouseEventHandler[T]] = js.native
  var onBeforeInput: js.UndefOr[FormEventHandler[T]] = js.native
  var onBlur: js.UndefOr[FocusEventHandler[T]] = js.native
  var onCanPlay: js.UndefOr[ReactEventHandler[T]] = js.native
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[T]] = js.native
  // Form Events
  var onChange: js.UndefOr[FormEventHandler[T]] = js.native
  var onClick: js.UndefOr[MouseEventHandler[T]] = js.native
  // Composition Events
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[T]] = js.native
  var onCompositionStart: js.UndefOr[CompositionEventHandler[T]] = js.native
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[T]] = js.native
  var onContextMenu: js.UndefOr[MouseEventHandler[T]] = js.native
  // Clipboard Events
  var onCopy: js.UndefOr[ClipboardEventHandler[T]] = js.native
  var onCut: js.UndefOr[ClipboardEventHandler[T]] = js.native
  var onDoubleClick: js.UndefOr[MouseEventHandler[T]] = js.native
  var onDrag: js.UndefOr[DragEventHandler[T]] = js.native
  var onDragEnd: js.UndefOr[DragEventHandler[T]] = js.native
  var onDragEnter: js.UndefOr[DragEventHandler[T]] = js.native
  var onDragExit: js.UndefOr[DragEventHandler[T]] = js.native
  var onDragLeave: js.UndefOr[DragEventHandler[T]] = js.native
  var onDragOver: js.UndefOr[DragEventHandler[T]] = js.native
  var onDragStart: js.UndefOr[DragEventHandler[T]] = js.native
  var onDrop: js.UndefOr[DragEventHandler[T]] = js.native
  var onDurationChange: js.UndefOr[ReactEventHandler[T]] = js.native
  var onEmptied: js.UndefOr[ReactEventHandler[T]] = js.native
  var onEncrypted: js.UndefOr[ReactEventHandler[T]] = js.native
  var onEnded: js.UndefOr[ReactEventHandler[T]] = js.native
  var onError: js.UndefOr[ReactEventHandler[T]] = js.native
  // Focus Events
  var onFocus: js.UndefOr[FocusEventHandler[T]] = js.native
  var onInput: js.UndefOr[FormEventHandler[T]] = js.native
  var onInvalid: js.UndefOr[FormEventHandler[T]] = js.native
   // also a Media Event
  // Keyboard Events
  var onKeyDown: js.UndefOr[KeyboardEventHandler[T]] = js.native
  var onKeyPress: js.UndefOr[KeyboardEventHandler[T]] = js.native
  var onKeyUp: js.UndefOr[KeyboardEventHandler[T]] = js.native
  // Image Events
  var onLoad: js.UndefOr[ReactEventHandler[T]] = js.native
  var onLoadStart: js.UndefOr[ReactEventHandler[T]] = js.native
  var onLoadedData: js.UndefOr[ReactEventHandler[T]] = js.native
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[T]] = js.native
  var onMouseDown: js.UndefOr[MouseEventHandler[T]] = js.native
  var onMouseEnter: js.UndefOr[MouseEventHandler[T]] = js.native
  var onMouseLeave: js.UndefOr[MouseEventHandler[T]] = js.native
  var onMouseMove: js.UndefOr[MouseEventHandler[T]] = js.native
  var onMouseOut: js.UndefOr[MouseEventHandler[T]] = js.native
  var onMouseOver: js.UndefOr[MouseEventHandler[T]] = js.native
  var onMouseUp: js.UndefOr[MouseEventHandler[T]] = js.native
  var onPaste: js.UndefOr[ClipboardEventHandler[T]] = js.native
  var onPause: js.UndefOr[ReactEventHandler[T]] = js.native
  var onPlay: js.UndefOr[ReactEventHandler[T]] = js.native
  var onPlaying: js.UndefOr[ReactEventHandler[T]] = js.native
  var onPointerCancel: js.UndefOr[PointerEventHandler[T]] = js.native
  // Pointer Events
  var onPointerDown: js.UndefOr[PointerEventHandler[T]] = js.native
  var onPointerEnter: js.UndefOr[PointerEventHandler[T]] = js.native
  var onPointerLeave: js.UndefOr[PointerEventHandler[T]] = js.native
  var onPointerMove: js.UndefOr[PointerEventHandler[T]] = js.native
  var onPointerOut: js.UndefOr[PointerEventHandler[T]] = js.native
  var onPointerOver: js.UndefOr[PointerEventHandler[T]] = js.native
  var onPointerUp: js.UndefOr[PointerEventHandler[T]] = js.native
  var onProgress: js.UndefOr[ReactEventHandler[T]] = js.native
  var onRateChange: js.UndefOr[ReactEventHandler[T]] = js.native
  var onReset: js.UndefOr[FormEventHandler[T]] = js.native
  // UI Events
  var onScroll: js.UndefOr[UIEventHandler[T]] = js.native
  var onSeeked: js.UndefOr[ReactEventHandler[T]] = js.native
  var onSeeking: js.UndefOr[ReactEventHandler[T]] = js.native
  // Selection Events
  var onSelect: js.UndefOr[ReactEventHandler[T]] = js.native
  var onStalled: js.UndefOr[ReactEventHandler[T]] = js.native
  var onSubmit: js.UndefOr[FormEventHandler[T]] = js.native
  var onSuspend: js.UndefOr[ReactEventHandler[T]] = js.native
  var onTimeUpdate: js.UndefOr[ReactEventHandler[T]] = js.native
  // Touch Events
  var onTouchCancel: js.UndefOr[TouchEventHandler[T]] = js.native
  var onTouchEnd: js.UndefOr[TouchEventHandler[T]] = js.native
  var onTouchMove: js.UndefOr[TouchEventHandler[T]] = js.native
  var onTouchStart: js.UndefOr[TouchEventHandler[T]] = js.native
  // Transition Events
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[T]] = js.native
  var onVolumeChange: js.UndefOr[ReactEventHandler[T]] = js.native
  var onWaiting: js.UndefOr[ReactEventHandler[T]] = js.native
  // Wheel Events
  var onWheel: js.UndefOr[WheelEventHandler[T]] = js.native
}

object DOMAttributes {
  @scala.inline
  def apply[T](
    children: VdomNode = null,
    dangerouslySetInnerHTML: AnonHtml = null,
    onAbort: ReactEventFrom[T with Element] => Callback = null,
    onAnimationEnd: ReactAnimationEventFrom[T with Element] => Callback = null,
    onAnimationIteration: ReactAnimationEventFrom[T with Element] => Callback = null,
    onAnimationStart: ReactAnimationEventFrom[T with Element] => Callback = null,
    onAuxClick: ReactMouseEventFrom[T with Element] => Callback = null,
    onBeforeInput: ReactEventFrom[T with Element] => Callback = null,
    onBlur: ReactFocusEventFrom[T with Element] => Callback = null,
    onCanPlay: ReactEventFrom[T with Element] => Callback = null,
    onCanPlayThrough: ReactEventFrom[T with Element] => Callback = null,
    onChange: ReactEventFrom[T with Element] => Callback = null,
    onClick: ReactMouseEventFrom[T with Element] => Callback = null,
    onCompositionEnd: ReactCompositionEventFrom[T with Element] => Callback = null,
    onCompositionStart: ReactCompositionEventFrom[T with Element] => Callback = null,
    onCompositionUpdate: ReactCompositionEventFrom[T with Element] => Callback = null,
    onContextMenu: ReactMouseEventFrom[T with Element] => Callback = null,
    onCopy: ReactClipboardEventFrom[T with Element] => Callback = null,
    onCut: ReactClipboardEventFrom[T with Element] => Callback = null,
    onDoubleClick: ReactMouseEventFrom[T with Element] => Callback = null,
    onDrag: ReactDragEventFrom[T with Element] => Callback = null,
    onDragEnd: ReactDragEventFrom[T with Element] => Callback = null,
    onDragEnter: ReactDragEventFrom[T with Element] => Callback = null,
    onDragExit: ReactDragEventFrom[T with Element] => Callback = null,
    onDragLeave: ReactDragEventFrom[T with Element] => Callback = null,
    onDragOver: ReactDragEventFrom[T with Element] => Callback = null,
    onDragStart: ReactDragEventFrom[T with Element] => Callback = null,
    onDrop: ReactDragEventFrom[T with Element] => Callback = null,
    onDurationChange: ReactEventFrom[T with Element] => Callback = null,
    onEmptied: ReactEventFrom[T with Element] => Callback = null,
    onEncrypted: ReactEventFrom[T with Element] => Callback = null,
    onEnded: ReactEventFrom[T with Element] => Callback = null,
    onError: ReactEventFrom[T with Element] => Callback = null,
    onFocus: ReactFocusEventFrom[T with Element] => Callback = null,
    onInput: ReactEventFrom[T with Element] => Callback = null,
    onInvalid: ReactEventFrom[T with Element] => Callback = null,
    onKeyDown: ReactKeyboardEventFrom[T with Element] => Callback = null,
    onKeyPress: ReactKeyboardEventFrom[T with Element] => Callback = null,
    onKeyUp: ReactKeyboardEventFrom[T with Element] => Callback = null,
    onLoad: ReactEventFrom[T with Element] => Callback = null,
    onLoadStart: ReactEventFrom[T with Element] => Callback = null,
    onLoadedData: ReactEventFrom[T with Element] => Callback = null,
    onLoadedMetadata: ReactEventFrom[T with Element] => Callback = null,
    onMouseDown: ReactMouseEventFrom[T with Element] => Callback = null,
    onMouseEnter: ReactMouseEventFrom[T with Element] => Callback = null,
    onMouseLeave: ReactMouseEventFrom[T with Element] => Callback = null,
    onMouseMove: ReactMouseEventFrom[T with Element] => Callback = null,
    onMouseOut: ReactMouseEventFrom[T with Element] => Callback = null,
    onMouseOver: ReactMouseEventFrom[T with Element] => Callback = null,
    onMouseUp: ReactMouseEventFrom[T with Element] => Callback = null,
    onPaste: ReactClipboardEventFrom[T with Element] => Callback = null,
    onPause: ReactEventFrom[T with Element] => Callback = null,
    onPlay: ReactEventFrom[T with Element] => Callback = null,
    onPlaying: ReactEventFrom[T with Element] => Callback = null,
    onPointerCancel: ReactPointerEventFrom[T with Element] => Callback = null,
    onPointerDown: ReactPointerEventFrom[T with Element] => Callback = null,
    onPointerEnter: ReactPointerEventFrom[T with Element] => Callback = null,
    onPointerLeave: ReactPointerEventFrom[T with Element] => Callback = null,
    onPointerMove: ReactPointerEventFrom[T with Element] => Callback = null,
    onPointerOut: ReactPointerEventFrom[T with Element] => Callback = null,
    onPointerOver: ReactPointerEventFrom[T with Element] => Callback = null,
    onPointerUp: ReactPointerEventFrom[T with Element] => Callback = null,
    onProgress: ReactEventFrom[T with Element] => Callback = null,
    onRateChange: ReactEventFrom[T with Element] => Callback = null,
    onReset: ReactEventFrom[T with Element] => Callback = null,
    onScroll: ReactUIEventFrom[T with Element] => Callback = null,
    onSeeked: ReactEventFrom[T with Element] => Callback = null,
    onSeeking: ReactEventFrom[T with Element] => Callback = null,
    onSelect: ReactEventFrom[T with Element] => Callback = null,
    onStalled: ReactEventFrom[T with Element] => Callback = null,
    onSubmit: ReactEventFrom[T with Element] => Callback = null,
    onSuspend: ReactEventFrom[T with Element] => Callback = null,
    onTimeUpdate: ReactEventFrom[T with Element] => Callback = null,
    onTouchCancel: ReactTouchEventFrom[T with Element] => Callback = null,
    onTouchEnd: ReactTouchEventFrom[T with Element] => Callback = null,
    onTouchMove: ReactTouchEventFrom[T with Element] => Callback = null,
    onTouchStart: ReactTouchEventFrom[T with Element] => Callback = null,
    onTransitionEnd: ReactTransitionEventFrom[T with Element] => Callback = null,
    onVolumeChange: ReactEventFrom[T with Element] => Callback = null,
    onWaiting: ReactEventFrom[T with Element] => Callback = null,
    onWheel: ReactWheelEventFrom[T with Element] => Callback = null
  ): DOMAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (onAbort != null) __obj.updateDynamic("onAbort")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onAbort(t0).runNow()))
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1((t0: ReactAnimationEventFrom[T with Element]) => onAnimationEnd(t0).runNow()))
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(js.Any.fromFunction1((t0: ReactAnimationEventFrom[T with Element]) => onAnimationIteration(t0).runNow()))
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1((t0: ReactAnimationEventFrom[T with Element]) => onAnimationStart(t0).runNow()))
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(js.Any.fromFunction1((t0: ReactMouseEventFrom[T with Element]) => onAuxClick(t0).runNow()))
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onBeforeInput(t0).runNow()))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: ReactFocusEventFrom[T with Element]) => onBlur(t0).runNow()))
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onCanPlay(t0).runNow()))
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onCanPlayThrough(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onChange(t0).runNow()))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: ReactMouseEventFrom[T with Element]) => onClick(t0).runNow()))
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction1((t0: ReactCompositionEventFrom[T with Element]) => onCompositionEnd(t0).runNow()))
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(js.Any.fromFunction1((t0: ReactCompositionEventFrom[T with Element]) => onCompositionStart(t0).runNow()))
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(js.Any.fromFunction1((t0: ReactCompositionEventFrom[T with Element]) => onCompositionUpdate(t0).runNow()))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1((t0: ReactMouseEventFrom[T with Element]) => onContextMenu(t0).runNow()))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1((t0: ReactClipboardEventFrom[T with Element]) => onCopy(t0).runNow()))
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction1((t0: ReactClipboardEventFrom[T with Element]) => onCut(t0).runNow()))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1((t0: ReactMouseEventFrom[T with Element]) => onDoubleClick(t0).runNow()))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1((t0: ReactDragEventFrom[T with Element]) => onDrag(t0).runNow()))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1((t0: ReactDragEventFrom[T with Element]) => onDragEnd(t0).runNow()))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1((t0: ReactDragEventFrom[T with Element]) => onDragEnter(t0).runNow()))
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(js.Any.fromFunction1((t0: ReactDragEventFrom[T with Element]) => onDragExit(t0).runNow()))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1((t0: ReactDragEventFrom[T with Element]) => onDragLeave(t0).runNow()))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1((t0: ReactDragEventFrom[T with Element]) => onDragOver(t0).runNow()))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1((t0: ReactDragEventFrom[T with Element]) => onDragStart(t0).runNow()))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1((t0: ReactDragEventFrom[T with Element]) => onDrop(t0).runNow()))
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onDurationChange(t0).runNow()))
    if (onEmptied != null) __obj.updateDynamic("onEmptied")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onEmptied(t0).runNow()))
    if (onEncrypted != null) __obj.updateDynamic("onEncrypted")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onEncrypted(t0).runNow()))
    if (onEnded != null) __obj.updateDynamic("onEnded")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onEnded(t0).runNow()))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onError(t0).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: ReactFocusEventFrom[T with Element]) => onFocus(t0).runNow()))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onInput(t0).runNow()))
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onInvalid(t0).runNow()))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: ReactKeyboardEventFrom[T with Element]) => onKeyDown(t0).runNow()))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1((t0: ReactKeyboardEventFrom[T with Element]) => onKeyPress(t0).runNow()))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1((t0: ReactKeyboardEventFrom[T with Element]) => onKeyUp(t0).runNow()))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onLoad(t0).runNow()))
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onLoadStart(t0).runNow()))
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onLoadedData(t0).runNow()))
    if (onLoadedMetadata != null) __obj.updateDynamic("onLoadedMetadata")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onLoadedMetadata(t0).runNow()))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1((t0: ReactMouseEventFrom[T with Element]) => onMouseDown(t0).runNow()))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1((t0: ReactMouseEventFrom[T with Element]) => onMouseEnter(t0).runNow()))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1((t0: ReactMouseEventFrom[T with Element]) => onMouseLeave(t0).runNow()))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1((t0: ReactMouseEventFrom[T with Element]) => onMouseMove(t0).runNow()))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1((t0: ReactMouseEventFrom[T with Element]) => onMouseOut(t0).runNow()))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1((t0: ReactMouseEventFrom[T with Element]) => onMouseOver(t0).runNow()))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1((t0: ReactMouseEventFrom[T with Element]) => onMouseUp(t0).runNow()))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1((t0: ReactClipboardEventFrom[T with Element]) => onPaste(t0).runNow()))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onPause(t0).runNow()))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onPlay(t0).runNow()))
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onPlaying(t0).runNow()))
    if (onPointerCancel != null) __obj.updateDynamic("onPointerCancel")(js.Any.fromFunction1((t0: ReactPointerEventFrom[T with Element]) => onPointerCancel(t0).runNow()))
    if (onPointerDown != null) __obj.updateDynamic("onPointerDown")(js.Any.fromFunction1((t0: ReactPointerEventFrom[T with Element]) => onPointerDown(t0).runNow()))
    if (onPointerEnter != null) __obj.updateDynamic("onPointerEnter")(js.Any.fromFunction1((t0: ReactPointerEventFrom[T with Element]) => onPointerEnter(t0).runNow()))
    if (onPointerLeave != null) __obj.updateDynamic("onPointerLeave")(js.Any.fromFunction1((t0: ReactPointerEventFrom[T with Element]) => onPointerLeave(t0).runNow()))
    if (onPointerMove != null) __obj.updateDynamic("onPointerMove")(js.Any.fromFunction1((t0: ReactPointerEventFrom[T with Element]) => onPointerMove(t0).runNow()))
    if (onPointerOut != null) __obj.updateDynamic("onPointerOut")(js.Any.fromFunction1((t0: ReactPointerEventFrom[T with Element]) => onPointerOut(t0).runNow()))
    if (onPointerOver != null) __obj.updateDynamic("onPointerOver")(js.Any.fromFunction1((t0: ReactPointerEventFrom[T with Element]) => onPointerOver(t0).runNow()))
    if (onPointerUp != null) __obj.updateDynamic("onPointerUp")(js.Any.fromFunction1((t0: ReactPointerEventFrom[T with Element]) => onPointerUp(t0).runNow()))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onProgress(t0).runNow()))
    if (onRateChange != null) __obj.updateDynamic("onRateChange")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onRateChange(t0).runNow()))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onReset(t0).runNow()))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1((t0: ReactUIEventFrom[T with Element]) => onScroll(t0).runNow()))
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onSeeked(t0).runNow()))
    if (onSeeking != null) __obj.updateDynamic("onSeeking")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onSeeking(t0).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onSelect(t0).runNow()))
    if (onStalled != null) __obj.updateDynamic("onStalled")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onStalled(t0).runNow()))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onSubmit(t0).runNow()))
    if (onSuspend != null) __obj.updateDynamic("onSuspend")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onSuspend(t0).runNow()))
    if (onTimeUpdate != null) __obj.updateDynamic("onTimeUpdate")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onTimeUpdate(t0).runNow()))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1((t0: ReactTouchEventFrom[T with Element]) => onTouchCancel(t0).runNow()))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1((t0: ReactTouchEventFrom[T with Element]) => onTouchEnd(t0).runNow()))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1((t0: ReactTouchEventFrom[T with Element]) => onTouchMove(t0).runNow()))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1((t0: ReactTouchEventFrom[T with Element]) => onTouchStart(t0).runNow()))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1((t0: ReactTransitionEventFrom[T with Element]) => onTransitionEnd(t0).runNow()))
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onVolumeChange(t0).runNow()))
    if (onWaiting != null) __obj.updateDynamic("onWaiting")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onWaiting(t0).runNow()))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1((t0: ReactWheelEventFrom[T with Element]) => onWheel(t0).runNow()))
    __obj.asInstanceOf[DOMAttributes[T]]
  }
  @scala.inline
  implicit class DOMAttributesOps[Self[t] <: DOMAttributes[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other /* <: js.Any */](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withChildrenVdomElement(children: VdomElement): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (children != null) ret.updateDynamic("children")(children.rawElement.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withChildren(children: VdomNode): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (children != null) ret.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutChildren: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "children")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withDangerouslySetInnerHTML(dangerouslySetInnerHTML: AnonHtml): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (dangerouslySetInnerHTML != null) ret.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutDangerouslySetInnerHTML: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "dangerouslySetInnerHTML")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnAbort(onAbort: ReactEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onAbort != null) ret.updateDynamic("onAbort")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onAbort(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnAbort: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onAbort")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnAnimationEnd(onAnimationEnd: ReactAnimationEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onAnimationEnd != null) ret.updateDynamic("onAnimationEnd")(js.Any.fromFunction1((t0: ReactAnimationEventFrom[T with Element]) => onAnimationEnd(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnAnimationEnd: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onAnimationEnd")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnAnimationIteration(onAnimationIteration: ReactAnimationEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onAnimationIteration != null) ret.updateDynamic("onAnimationIteration")(js.Any.fromFunction1((t0: ReactAnimationEventFrom[T with Element]) => onAnimationIteration(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnAnimationIteration: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onAnimationIteration")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnAnimationStart(onAnimationStart: ReactAnimationEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onAnimationStart != null) ret.updateDynamic("onAnimationStart")(js.Any.fromFunction1((t0: ReactAnimationEventFrom[T with Element]) => onAnimationStart(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnAnimationStart: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onAnimationStart")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnAuxClick(onAuxClick: ReactMouseEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onAuxClick != null) ret.updateDynamic("onAuxClick")(js.Any.fromFunction1((t0: ReactMouseEventFrom[T with Element]) => onAuxClick(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnAuxClick: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onAuxClick")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnBeforeInput(onBeforeInput: ReactEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onBeforeInput != null) ret.updateDynamic("onBeforeInput")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onBeforeInput(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnBeforeInput: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onBeforeInput")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnBlur(onBlur: ReactFocusEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onBlur != null) ret.updateDynamic("onBlur")(js.Any.fromFunction1((t0: ReactFocusEventFrom[T with Element]) => onBlur(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnBlur: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onBlur")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnCanPlay(onCanPlay: ReactEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onCanPlay != null) ret.updateDynamic("onCanPlay")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onCanPlay(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnCanPlay: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onCanPlay")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnCanPlayThrough(onCanPlayThrough: ReactEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onCanPlayThrough != null) ret.updateDynamic("onCanPlayThrough")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onCanPlayThrough(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnCanPlayThrough: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onCanPlayThrough")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnChange(onChange: ReactEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onChange != null) ret.updateDynamic("onChange")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onChange(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnChange: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onChange")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnClick(onClick: ReactMouseEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onClick != null) ret.updateDynamic("onClick")(js.Any.fromFunction1((t0: ReactMouseEventFrom[T with Element]) => onClick(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnClick: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onClick")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnCompositionEnd(onCompositionEnd: ReactCompositionEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onCompositionEnd != null) ret.updateDynamic("onCompositionEnd")(js.Any.fromFunction1((t0: ReactCompositionEventFrom[T with Element]) => onCompositionEnd(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnCompositionEnd: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onCompositionEnd")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnCompositionStart(onCompositionStart: ReactCompositionEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onCompositionStart != null) ret.updateDynamic("onCompositionStart")(js.Any.fromFunction1((t0: ReactCompositionEventFrom[T with Element]) => onCompositionStart(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnCompositionStart: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onCompositionStart")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnCompositionUpdate(onCompositionUpdate: ReactCompositionEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onCompositionUpdate != null) ret.updateDynamic("onCompositionUpdate")(js.Any.fromFunction1((t0: ReactCompositionEventFrom[T with Element]) => onCompositionUpdate(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnCompositionUpdate: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onCompositionUpdate")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnContextMenu(onContextMenu: ReactMouseEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onContextMenu != null) ret.updateDynamic("onContextMenu")(js.Any.fromFunction1((t0: ReactMouseEventFrom[T with Element]) => onContextMenu(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnContextMenu: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onContextMenu")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnCopy(onCopy: ReactClipboardEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onCopy != null) ret.updateDynamic("onCopy")(js.Any.fromFunction1((t0: ReactClipboardEventFrom[T with Element]) => onCopy(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnCopy: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onCopy")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnCut(onCut: ReactClipboardEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onCut != null) ret.updateDynamic("onCut")(js.Any.fromFunction1((t0: ReactClipboardEventFrom[T with Element]) => onCut(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnCut: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onCut")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnDoubleClick(onDoubleClick: ReactMouseEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onDoubleClick != null) ret.updateDynamic("onDoubleClick")(js.Any.fromFunction1((t0: ReactMouseEventFrom[T with Element]) => onDoubleClick(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnDoubleClick: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onDoubleClick")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnDrag(onDrag: ReactDragEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onDrag != null) ret.updateDynamic("onDrag")(js.Any.fromFunction1((t0: ReactDragEventFrom[T with Element]) => onDrag(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnDrag: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onDrag")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnDragEnd(onDragEnd: ReactDragEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onDragEnd != null) ret.updateDynamic("onDragEnd")(js.Any.fromFunction1((t0: ReactDragEventFrom[T with Element]) => onDragEnd(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnDragEnd: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onDragEnd")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnDragEnter(onDragEnter: ReactDragEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onDragEnter != null) ret.updateDynamic("onDragEnter")(js.Any.fromFunction1((t0: ReactDragEventFrom[T with Element]) => onDragEnter(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnDragEnter: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onDragEnter")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnDragExit(onDragExit: ReactDragEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onDragExit != null) ret.updateDynamic("onDragExit")(js.Any.fromFunction1((t0: ReactDragEventFrom[T with Element]) => onDragExit(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnDragExit: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onDragExit")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnDragLeave(onDragLeave: ReactDragEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onDragLeave != null) ret.updateDynamic("onDragLeave")(js.Any.fromFunction1((t0: ReactDragEventFrom[T with Element]) => onDragLeave(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnDragLeave: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onDragLeave")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnDragOver(onDragOver: ReactDragEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onDragOver != null) ret.updateDynamic("onDragOver")(js.Any.fromFunction1((t0: ReactDragEventFrom[T with Element]) => onDragOver(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnDragOver: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onDragOver")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnDragStart(onDragStart: ReactDragEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onDragStart != null) ret.updateDynamic("onDragStart")(js.Any.fromFunction1((t0: ReactDragEventFrom[T with Element]) => onDragStart(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnDragStart: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onDragStart")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnDrop(onDrop: ReactDragEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onDrop != null) ret.updateDynamic("onDrop")(js.Any.fromFunction1((t0: ReactDragEventFrom[T with Element]) => onDrop(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnDrop: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onDrop")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnDurationChange(onDurationChange: ReactEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onDurationChange != null) ret.updateDynamic("onDurationChange")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onDurationChange(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnDurationChange: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onDurationChange")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnEmptied(onEmptied: ReactEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onEmptied != null) ret.updateDynamic("onEmptied")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onEmptied(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnEmptied: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onEmptied")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnEncrypted(onEncrypted: ReactEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onEncrypted != null) ret.updateDynamic("onEncrypted")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onEncrypted(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnEncrypted: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onEncrypted")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnEnded(onEnded: ReactEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onEnded != null) ret.updateDynamic("onEnded")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onEnded(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnEnded: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onEnded")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnError(onError: ReactEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onError != null) ret.updateDynamic("onError")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onError(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnError: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onError")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnFocus(onFocus: ReactFocusEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onFocus != null) ret.updateDynamic("onFocus")(js.Any.fromFunction1((t0: ReactFocusEventFrom[T with Element]) => onFocus(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnFocus: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onFocus")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnInput(onInput: ReactEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onInput != null) ret.updateDynamic("onInput")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onInput(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnInput: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onInput")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnInvalid(onInvalid: ReactEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onInvalid != null) ret.updateDynamic("onInvalid")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onInvalid(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnInvalid: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onInvalid")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnKeyDown(onKeyDown: ReactKeyboardEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onKeyDown != null) ret.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: ReactKeyboardEventFrom[T with Element]) => onKeyDown(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnKeyDown: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onKeyDown")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnKeyPress(onKeyPress: ReactKeyboardEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onKeyPress != null) ret.updateDynamic("onKeyPress")(js.Any.fromFunction1((t0: ReactKeyboardEventFrom[T with Element]) => onKeyPress(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnKeyPress: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onKeyPress")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnKeyUp(onKeyUp: ReactKeyboardEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onKeyUp != null) ret.updateDynamic("onKeyUp")(js.Any.fromFunction1((t0: ReactKeyboardEventFrom[T with Element]) => onKeyUp(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnKeyUp: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onKeyUp")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnLoad(onLoad: ReactEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onLoad != null) ret.updateDynamic("onLoad")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onLoad(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnLoad: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onLoad")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnLoadStart(onLoadStart: ReactEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onLoadStart != null) ret.updateDynamic("onLoadStart")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onLoadStart(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnLoadStart: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onLoadStart")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnLoadedData(onLoadedData: ReactEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onLoadedData != null) ret.updateDynamic("onLoadedData")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onLoadedData(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnLoadedData: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onLoadedData")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnLoadedMetadata(onLoadedMetadata: ReactEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onLoadedMetadata != null) ret.updateDynamic("onLoadedMetadata")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onLoadedMetadata(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnLoadedMetadata: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onLoadedMetadata")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnMouseDown(onMouseDown: ReactMouseEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onMouseDown != null) ret.updateDynamic("onMouseDown")(js.Any.fromFunction1((t0: ReactMouseEventFrom[T with Element]) => onMouseDown(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnMouseDown: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onMouseDown")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnMouseEnter(onMouseEnter: ReactMouseEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onMouseEnter != null) ret.updateDynamic("onMouseEnter")(js.Any.fromFunction1((t0: ReactMouseEventFrom[T with Element]) => onMouseEnter(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnMouseEnter: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onMouseEnter")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnMouseLeave(onMouseLeave: ReactMouseEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onMouseLeave != null) ret.updateDynamic("onMouseLeave")(js.Any.fromFunction1((t0: ReactMouseEventFrom[T with Element]) => onMouseLeave(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnMouseLeave: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onMouseLeave")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnMouseMove(onMouseMove: ReactMouseEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onMouseMove != null) ret.updateDynamic("onMouseMove")(js.Any.fromFunction1((t0: ReactMouseEventFrom[T with Element]) => onMouseMove(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnMouseMove: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onMouseMove")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnMouseOut(onMouseOut: ReactMouseEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onMouseOut != null) ret.updateDynamic("onMouseOut")(js.Any.fromFunction1((t0: ReactMouseEventFrom[T with Element]) => onMouseOut(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnMouseOut: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onMouseOut")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnMouseOver(onMouseOver: ReactMouseEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onMouseOver != null) ret.updateDynamic("onMouseOver")(js.Any.fromFunction1((t0: ReactMouseEventFrom[T with Element]) => onMouseOver(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnMouseOver: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onMouseOver")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnMouseUp(onMouseUp: ReactMouseEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onMouseUp != null) ret.updateDynamic("onMouseUp")(js.Any.fromFunction1((t0: ReactMouseEventFrom[T with Element]) => onMouseUp(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnMouseUp: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onMouseUp")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnPaste(onPaste: ReactClipboardEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onPaste != null) ret.updateDynamic("onPaste")(js.Any.fromFunction1((t0: ReactClipboardEventFrom[T with Element]) => onPaste(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnPaste: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onPaste")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnPause(onPause: ReactEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onPause != null) ret.updateDynamic("onPause")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onPause(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnPause: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onPause")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnPlay(onPlay: ReactEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onPlay != null) ret.updateDynamic("onPlay")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onPlay(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnPlay: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onPlay")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnPlaying(onPlaying: ReactEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onPlaying != null) ret.updateDynamic("onPlaying")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onPlaying(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnPlaying: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onPlaying")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnPointerCancel(onPointerCancel: ReactPointerEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onPointerCancel != null) ret.updateDynamic("onPointerCancel")(js.Any.fromFunction1((t0: ReactPointerEventFrom[T with Element]) => onPointerCancel(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnPointerCancel: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onPointerCancel")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnPointerDown(onPointerDown: ReactPointerEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onPointerDown != null) ret.updateDynamic("onPointerDown")(js.Any.fromFunction1((t0: ReactPointerEventFrom[T with Element]) => onPointerDown(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnPointerDown: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onPointerDown")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnPointerEnter(onPointerEnter: ReactPointerEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onPointerEnter != null) ret.updateDynamic("onPointerEnter")(js.Any.fromFunction1((t0: ReactPointerEventFrom[T with Element]) => onPointerEnter(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnPointerEnter: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onPointerEnter")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnPointerLeave(onPointerLeave: ReactPointerEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onPointerLeave != null) ret.updateDynamic("onPointerLeave")(js.Any.fromFunction1((t0: ReactPointerEventFrom[T with Element]) => onPointerLeave(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnPointerLeave: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onPointerLeave")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnPointerMove(onPointerMove: ReactPointerEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onPointerMove != null) ret.updateDynamic("onPointerMove")(js.Any.fromFunction1((t0: ReactPointerEventFrom[T with Element]) => onPointerMove(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnPointerMove: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onPointerMove")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnPointerOut(onPointerOut: ReactPointerEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onPointerOut != null) ret.updateDynamic("onPointerOut")(js.Any.fromFunction1((t0: ReactPointerEventFrom[T with Element]) => onPointerOut(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnPointerOut: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onPointerOut")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnPointerOver(onPointerOver: ReactPointerEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onPointerOver != null) ret.updateDynamic("onPointerOver")(js.Any.fromFunction1((t0: ReactPointerEventFrom[T with Element]) => onPointerOver(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnPointerOver: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onPointerOver")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnPointerUp(onPointerUp: ReactPointerEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onPointerUp != null) ret.updateDynamic("onPointerUp")(js.Any.fromFunction1((t0: ReactPointerEventFrom[T with Element]) => onPointerUp(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnPointerUp: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onPointerUp")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnProgress(onProgress: ReactEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onProgress != null) ret.updateDynamic("onProgress")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onProgress(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnProgress: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onProgress")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnRateChange(onRateChange: ReactEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onRateChange != null) ret.updateDynamic("onRateChange")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onRateChange(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnRateChange: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onRateChange")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnReset(onReset: ReactEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onReset != null) ret.updateDynamic("onReset")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onReset(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnReset: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onReset")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnScroll(onScroll: ReactUIEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onScroll != null) ret.updateDynamic("onScroll")(js.Any.fromFunction1((t0: ReactUIEventFrom[T with Element]) => onScroll(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnScroll: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onScroll")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnSeeked(onSeeked: ReactEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onSeeked != null) ret.updateDynamic("onSeeked")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onSeeked(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnSeeked: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onSeeked")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnSeeking(onSeeking: ReactEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onSeeking != null) ret.updateDynamic("onSeeking")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onSeeking(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnSeeking: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onSeeking")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnSelect(onSelect: ReactEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onSelect != null) ret.updateDynamic("onSelect")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onSelect(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnSelect: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onSelect")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnStalled(onStalled: ReactEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onStalled != null) ret.updateDynamic("onStalled")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onStalled(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnStalled: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onStalled")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnSubmit(onSubmit: ReactEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onSubmit != null) ret.updateDynamic("onSubmit")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onSubmit(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnSubmit: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onSubmit")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnSuspend(onSuspend: ReactEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onSuspend != null) ret.updateDynamic("onSuspend")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onSuspend(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnSuspend: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onSuspend")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnTimeUpdate(onTimeUpdate: ReactEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onTimeUpdate != null) ret.updateDynamic("onTimeUpdate")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onTimeUpdate(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnTimeUpdate: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onTimeUpdate")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnTouchCancel(onTouchCancel: ReactTouchEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onTouchCancel != null) ret.updateDynamic("onTouchCancel")(js.Any.fromFunction1((t0: ReactTouchEventFrom[T with Element]) => onTouchCancel(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnTouchCancel: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onTouchCancel")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnTouchEnd(onTouchEnd: ReactTouchEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onTouchEnd != null) ret.updateDynamic("onTouchEnd")(js.Any.fromFunction1((t0: ReactTouchEventFrom[T with Element]) => onTouchEnd(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnTouchEnd: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onTouchEnd")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnTouchMove(onTouchMove: ReactTouchEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onTouchMove != null) ret.updateDynamic("onTouchMove")(js.Any.fromFunction1((t0: ReactTouchEventFrom[T with Element]) => onTouchMove(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnTouchMove: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onTouchMove")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnTouchStart(onTouchStart: ReactTouchEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onTouchStart != null) ret.updateDynamic("onTouchStart")(js.Any.fromFunction1((t0: ReactTouchEventFrom[T with Element]) => onTouchStart(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnTouchStart: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onTouchStart")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnTransitionEnd(onTransitionEnd: ReactTransitionEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onTransitionEnd != null) ret.updateDynamic("onTransitionEnd")(js.Any.fromFunction1((t0: ReactTransitionEventFrom[T with Element]) => onTransitionEnd(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnTransitionEnd: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onTransitionEnd")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnVolumeChange(onVolumeChange: ReactEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onVolumeChange != null) ret.updateDynamic("onVolumeChange")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onVolumeChange(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnVolumeChange: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onVolumeChange")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnWaiting(onWaiting: ReactEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onWaiting != null) ret.updateDynamic("onWaiting")(js.Any.fromFunction1((t0: ReactEventFrom[T with Element]) => onWaiting(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnWaiting: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onWaiting")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOnWheel(onWheel: ReactWheelEventFrom[T with Element] => Callback): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        if (onWheel != null) ret.updateDynamic("onWheel")(js.Any.fromFunction1((t0: ReactWheelEventFrom[T with Element]) => onWheel(t0).runNow()))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOnWheel: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "onWheel")
        ret.asInstanceOf[Self[T]]
    }
  }
  
}

