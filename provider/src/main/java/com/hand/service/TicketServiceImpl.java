package com.hand.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * Created by HuangHeng on 2019/7/23
 */
@Component
@Service
public class TicketServiceImpl implements TicketService {

    @Override
    public String getTicket() {

        return "腻害了，成功了";
    }
}
