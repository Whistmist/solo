package com.hand.service;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * Created by HuangHeng on 2019/7/23
 */
@Service
public class UserService {

    @Reference
    private TicketService ticketService;

    public void getTivket(){
        String ticket = ticketService.getTicket();
        System.out.println("抢到了-------->"+ticket);
    }
}
