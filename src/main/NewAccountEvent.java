package com.ppblock.blockchain.event;

import com.ppblock.blockchain.account.Account;
import org.springframework.context.ApplicationEvent;

/**
 * 创建账户事件
 * @author yangjian
 */
public class NewAccountEvent extends ApplicationEvent {

    public NewAccountEvent(Account account) {
        super(account);
    }
}
