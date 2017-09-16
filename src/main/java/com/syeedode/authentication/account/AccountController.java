package com.syeedode.authentication.account;

import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    AccountService accountService;

    @RequestMapping(value = "/account", method = RequestMethod.GET)
    public ResponseEntity<?> getAccount() {

        return ResponseEntity.ok(accountService.getAccountData());
    }

    @RequestMapping(value = "/string", method = RequestMethod.GET)
    public ResponseEntity<?> getStringData() {

        return ResponseEntity.ok(accountService.getStringData());
    }
}
