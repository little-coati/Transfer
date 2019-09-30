package com.qfedu.service.impl;

import com.qfedu.entry.Account;
import com.qfedu.mapper.AccountMapper;
import com.qfedu.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 周立雄
 * @date 2019/9/27 16:10
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountMapper accountMapper;

    @Override
    public void transferToJack(String money) {
        double num = Double.parseDouble(money);
        System.out.println("qqqq" + num);
        accountMapper.updateAccount(num);
        accountMapper.updateAccount2(num);
    }

    @Override
    public Account getAccountById(int i) {
        Account account = accountMapper.getAccountById(i);
        return account;
    }
}
