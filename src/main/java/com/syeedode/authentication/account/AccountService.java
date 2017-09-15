package com.syeedode.authentication.account;

import com.syeedode.authentication.user.UserGateway;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Authentication Services
 * Account Resource
 * <p>
 * Author: syeedode
 * Date: 9/14/17
 */
public class AccountService {
    @Autowired
    UserGateway userGateway;

    public AccountResponse getAccountData() {
        userGateway.getUserData();
        return null;
    }
}
