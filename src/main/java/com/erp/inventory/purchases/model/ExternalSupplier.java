package com.erp.inventory.purchases.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/30/13
 * Time: 6:46 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@DiscriminatorValue("external_supplier")
public class ExternalSupplier extends Supplier {
}
