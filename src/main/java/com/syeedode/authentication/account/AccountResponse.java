package com.syeedode.authentication.account;

import com.syeedode.authentication.user.UserResponse;

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
    private final String deviceGuid;
    private final String userUuid;

    /** Static factory method */
    public static AccountResponse getInstance() {
        return new AccountResponse("Bilal", "Ode", null,"928a0292-dc0a-46b9-9ef9-015c38520d67");
    }

    public static AccountResponse fromUserData(UserResponse user) {
        return new AccountResponse(user.getFirstName(), user.getLastName(), user.getUuid(), null);
    }

    /** Constructor */
    private AccountResponse(String firstName, String lastName, String userUniqUniversalId, String deviceGuid) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userUuid = userUniqUniversalId;
        this.deviceGuid = deviceGuid;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDeviceGuid() {
        return deviceGuid;
    }

    public String getUserUuid() {
        return userUuid;
    }
}
