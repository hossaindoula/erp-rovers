package com.erp.dms.model;

import com.erp.util.model.File;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created with IntelliJ IDEA.
 * User: ronnie
 * Date: 12/30/13
 * Time: 7:16 PM
 * To change this template use File | Settings | File Templates.
 */

@Entity
@DiscriminatorValue("user_avatar")
public class Avatar extends File {

}
