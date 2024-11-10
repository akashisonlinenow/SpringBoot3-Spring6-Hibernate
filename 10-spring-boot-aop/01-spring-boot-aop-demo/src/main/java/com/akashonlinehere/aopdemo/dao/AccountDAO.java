package com.akashonlinehere.aopdemo.dao;

import com.akashonlinehere.aopdemo.Account;

public interface AccountDAO {
    void addAccount(Account theAccount, boolean vipFlag);

    boolean doWork();
}
