package com.erp.util.model;

import com.erp.security.model.User;

import javax.persistence.*;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: ronnie
 * Date: 12/30/13
 * Time: 6:22 PM
 * To change this template use File | Settings | File Templates.
 */

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class UserProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "USER_ID")
    private Long id;
    private Date birthDate;
    private String maritalStatus;
    private String bloodGroup;
    private String firstName;
    private String lastName;
    private String surname;
    private String initials;

    @ManyToOne
    private Address address;

    @ManyToOne
    private Race race;

    @OneToOne
    private User user;

    //private Avatar avatar;



}
