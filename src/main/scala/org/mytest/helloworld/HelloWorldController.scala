package org.mytest.helloworld

import org.mytest.helloworld.resp.ResponseEnricher
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{GetMapping, RestController}

@RestController
class HelloWorldController @Autowired() (private val respEnricher: ResponseEnricher) {

    @GetMapping(path = Array("/hello"))
    def sayHello(name: String): String = {
        val msg = "Hello " + name + ", how are you?"
        respEnricher.enrich(msg)
    }
}
