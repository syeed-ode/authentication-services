package com.syeedode.authentication.account;

import javax.xml.bind.annotation.XmlType;

/**
 * Authentication Services
 * Account Resource
 * <p>
 * Author: syeedode
 * Date: 9/11/17
 */
@XmlType
public class AccountResponse {
    private final String firstName;
    private final String lastName;
    private final String deviceId;

    /** Static factory method */
    public static AccountResponse getInstance() {
        return new AccountResponse("Syeed", "Ode", "928a0292-dc0a-46b9-9ef9-015c38520d67");
    }

    /** Constructor */
    private AccountResponse(String firstName, String lastName, String deviceId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.deviceId = deviceId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDeviceId() {
        return deviceId;
    }
}
