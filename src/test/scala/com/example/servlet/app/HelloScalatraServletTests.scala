package com.example.servlet.app

import org.scalatra.test.scalatest._
import org.scalatest.FunSuite

class HelloScalatraServletTests extends ScalatraSpec {

  addServlet(classOf[HelloScalatraServlet], "/*")

  describe("A Set") {
    assert(1==1)
  }

}
