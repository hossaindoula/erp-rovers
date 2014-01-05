package com.erp.accounting.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 1/3/14
 * Time: 3:07 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class SysTypes implements Serializable{
    @Id

    private int type_id;// pk
    private  String typeName;
    private int typeNo;
    private String nextReference;

    public int getType_id() {
        return type_id;
    }

    public void setType_id(int type_id) {
        this.type_id = type_id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public int getTypeNo() {
        return typeNo;
    }

    public void setTypeNo(int typeNo) {
        this.typeNo = typeNo;
    }

    public String getNextReference() {
        return nextReference;
    }

    public void setNextReference(String nextReference) {
        this.nextReference = nextReference;
    }
}
