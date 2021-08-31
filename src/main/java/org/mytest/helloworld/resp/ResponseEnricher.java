package org.mytest.helloworld.resp;

import org.springframework.stereotype.Component;

@Component
public class ResponseEnricher
{
    public String enrich(String resp) {
        return "<b>" + resp + "</b>";
    }
}
