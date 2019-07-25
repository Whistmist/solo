package com.hand.web;

import com.hand.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by HuangHeng on 2019/7/25
 */
@RestController
public class TicketController {
    @Autowired
    private TicketService ticketService;


    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public String getTicket(){
        return ticketService.getTicket();
    }
}
