package com.qfedu.mapper;

import com.qfedu.entry.Account;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * @author 周立雄
 * @date 2019/9/27 16:19
 */
public interface AccountMapper {
    @Update("update test set money = (money - #{num}) where id = 2")
    void updateAccount(double num);

    @Update("update test set money = (money + #{num}) where id = 1")
    void updateAccount2(double num);

    @Select("select * from test where id = #{i}")
    Account getAccountById(int i);
}
