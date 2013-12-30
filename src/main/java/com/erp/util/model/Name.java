package com.erp.util.model;

/**
 * Created with IntelliJ IDEA.
 * User: ronnie
 * Date: 12/31/13
 * Time: 2:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class Name {

    private String firstName;
    private String lastName;
    private String surname;
    private String initials;
    private String nickname;

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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
