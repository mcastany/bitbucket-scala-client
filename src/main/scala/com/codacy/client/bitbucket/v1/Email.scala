package com.codacy.client.bitbucket.v1

import play.api.libs.functional.syntax._
import play.api.libs.json._

case class Email(email: String, primary: Boolean, active: Boolean)

object Email {
  // format: off
  implicit def emailReader: Reads[Email] =
    ((__ \ "email").read[String] and
      (__ \ "primary").read[Boolean] and
      (__ \ "active").read[Boolean]
      ) (Email.apply _)
  // format: on
}
