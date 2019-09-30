package com.qfedu.service;

import com.qfedu.entry.Account;

/**
 * @author 周立雄
 * @date 2019/9/27 16:10
 */
public interface AccountService {

    void transferToJack(String money);

    Account getAccountById(int i);
}
