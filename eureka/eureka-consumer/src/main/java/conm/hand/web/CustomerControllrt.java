package conm.hand.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by HuangHeng on 2019/7/25
 */
@RestController
public class CustomerControllrt {

    public static final String URL = "http://TICKETSERVICE";

    @Autowired
    RestTemplate restTemplate;
    @GetMapping("/buy")
    public String buTicket(String name){
        String forObject = restTemplate.getForObject(URL + "/get", String.class);
        return name + "购买了"+forObject;
    }
}
