package org.mytest.helloworld

import org.mytest.helloworld.resp.ResponseEnricher
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{GetMapping, RestController}

import java.util

@RestController
class HelloWorldController @Autowired() (private val respEnricher: ResponseEnricher) {

    @GetMapping(path = Array("/hello"))
    def sayHello(name: String): String = {
        val msg = "Hello " + name + ", how are you?"
        respEnricher.enrich(msg)
    }

    @GetMapping(path = Array("/hello1"))
    def sayHello1(name: String): String = {
        val m: util.Map[String, String] = new util.HashMap[String, String]()
        m.put("name", name)
        val lis: util.List[util.Map[String, _]] = new util.ArrayList[util.Map[String, _]]()
        lis.add(m)
        respEnricher.wild(lis)
        val msg = "Hello " + name + ", how are you?"
        respEnricher.enrich(msg)
    }
}
