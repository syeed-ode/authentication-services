package com.syeedode.authentication.account;

import com.syeedode.authentication.user.UserGateway;
import com.syeedode.authentication.user.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Authentication Services
 * Account Resource
 * <p>
 * Author: syeedode
 * Date: 9/14/17
 */
@Service
public class AccountService {
    @Autowired
    UserGateway userGateway;

    public AccountResponse getAccountData() {
        UserResponse userData = userGateway.getUserData();
        return AccountResponse.fromUserData(userData);
    }

    public String getStringData() {
        return userGateway.getStringData();
    }
}
