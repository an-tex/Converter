package org.scalablytyped.converter
package internal
package importer

import io.circe013.{Decoder, Encoder}
import org.scalablytyped.converter.internal.scalajs.{flavours, Name, Versions}

case class ConversionOptions(
    useScalaJsDomTypes:    Boolean,
    flavour:               Flavour,
    outputPackage:         Name,
    enableScalaJsDefined:  Selection[ts.TsIdentLibrary],
    stdLibs:               IArray[String],
    expandTypeMappings:    Selection[ts.TsIdentLibrary],
    ignoredLibs:           Set[ts.TsIdentLibrary],
    ignoredModulePrefixes: Set[List[String]],
    versions:              Versions,
    organization:          String,
) {
  val flavourImpl: flavours.FlavourImpl =
    flavour match {
      case Flavour.Normal =>
        flavours.NormalFlavour(useScalaJsDomTypes, outputPackage)
      case Flavour.Slinky =>
        flavours.SlinkyFlavour(outputPackage, versions.scala)
      case Flavour.SlinkyNative =>
        flavours.SlinkyNativeFlavour(outputPackage, versions.scala)
      case Flavour.Japgolly =>
        flavours.JapgollyFlavour(outputPackage, versions.scala)
    }

}

object ConversionOptions {
  import io.circe013.generic.auto._
  import jsonCodecs._

  implicit val encodes: Encoder[ConversionOptions] = exportEncoder[ConversionOptions].instance
  implicit val decodes: Decoder[ConversionOptions] = exportDecoder[ConversionOptions].instance
}
