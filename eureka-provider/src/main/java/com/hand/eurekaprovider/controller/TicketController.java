package com.hand.eurekaprovider.controller;

import com.hand.eurekaprovider.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by HuangHeng on 2019/7/23
 */
@RestController
public class TicketController {

    @Autowired
    TicketService ticketService;

    @GetMapping("/getTicket")
    public String getTicket(){
        return ticketService.getTicket();
    }

}
