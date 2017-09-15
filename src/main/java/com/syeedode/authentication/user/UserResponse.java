package com.syeedode.authentication.user;

/**
 * Account Services
 * <p>
 * Author: syeedode
 * Date: 9/14/17
 */
public class UserResponse {
    private final String firstName;
    private final String lastName;
    private final String uuid;

    /** Static factory method */
    public static UserResponse getInstance() {
        return new UserResponse("Syeed", "Ode", "141db2ee-dac1-42dc-87fe-0d5bc52f3ddd");
    }

    /** Constructor */
    private UserResponse(String firstName, String lastName, String uuid) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.uuid = uuid;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUuid() {
        return uuid;
    }
}
