package com.syeedode.authentication.user;

/**
 * Account Services
 * <p>
 * Author: syeedode
 * Date: 9/14/17
 */
public class UserResponse {
    private String firstName;
    private String lastName;
    private String uuid;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
