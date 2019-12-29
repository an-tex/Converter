package typings.sax.saxMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.sax.saxMod.BaseTag because var conflicts: name. Inlined isSelfClosing */ @js.native
trait QualifiedTag extends QualifiedName {
  var attributes: StringDictionary[QualifiedAttribute] = js.native
  var isSelfClosing: Boolean = js.native
  var ns: StringDictionary[String] = js.native
}

object QualifiedTag {
  @scala.inline
  def apply(
    attributes: StringDictionary[QualifiedAttribute],
    isSelfClosing: Boolean,
    local: String,
    name: String,
    ns: StringDictionary[String],
    prefix: String,
    uri: String
  ): QualifiedTag = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], isSelfClosing = isSelfClosing.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[QualifiedTag]
  }
}

