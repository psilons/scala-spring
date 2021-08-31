package org.mytest.helloworld

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication


object HelloWorldApp extends App {
  SpringApplication.run(classOf[HelloWorldApp])
}

@SpringBootApplication
class HelloWorldApp
