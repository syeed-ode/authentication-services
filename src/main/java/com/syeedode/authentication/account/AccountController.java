package com.syeedode.authentication.account;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Authentication Services
 * Account Resource
 * <p>
 * Author: syeedode
 * Date: 9/11/17
 */
@RestController
public class AccountController {


    @RequestMapping(value = "/account", method = RequestMethod.GET)
    public ResponseEntity<?> getAccount() {

        return ResponseEntity.ok(AccountResponse.getInstance());
    }

}
