package com.example.servlet.app

import org.scalatra._

class HelloScalatraServlet extends ScalatraServlet {

  get("/") {
    val name = params.get("name").getOrElse("Wolrd") 

    <h1>Hello, {name}</h1>
  }

}
