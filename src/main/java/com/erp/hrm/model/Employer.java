package com.erp.hrm.model;

/**
 * Created with IntelliJ IDEA.
 * User: ronnie
 * Date: 12/30/13
 * Time: 7:56 PM
 * To change this template use File | Settings | File Templates.
 */
import com.erp.security.model.User;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("employer")
public class Employer extends User {
}