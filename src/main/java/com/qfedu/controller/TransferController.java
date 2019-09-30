package com.qfedu.controller;

import com.qfedu.entry.Account;
import com.qfedu.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 周立雄
 * @date 2019/9/27 16:05
 */
@Controller
public class TransferController {

    @Autowired
    AccountService accountService;

    @RequestMapping(value = "/justDo")
    @ResponseBody
    public String transfer(String money) {
        accountService.transferToJack(money);
        return "success";
    }


    @RequestMapping(value = "/list")
    public String list(Model model) {
        Account jack = accountService.getAccountById(1);
        Account rose = accountService.getAccountById(2);

        model.addAttribute("Jack", jack);
        model.addAttribute("Rose", rose);

        return "index.jsp";
    }
}
