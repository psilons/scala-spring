package org.mytest.helloworld.resp;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class ResponseEnricher
{
    public String enrich(String resp) {
        return "<b>" + resp + "</b>";
    }

    public String wild(List<Map<String, ?>> args)
    {
        String ret = "";
        for (Map<String, ?> item : args) {
            for (Map.Entry<String, ?> entry : item.entrySet())
                ret += "k=" + entry.getKey() + ", v=" + entry.getValue().toString();
        }
        return ret;
    }
}
