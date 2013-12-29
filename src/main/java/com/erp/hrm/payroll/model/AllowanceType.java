package com.erp.hrm.payroll.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: ronnie
 * Date: 12/30/13
 * Time: 7:30 PM
 * To change this template use File | Settings | File Templates.
 */

@Entity
public class AllowanceType implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "allowance_name")
    private String allowanceName;

    @Column(name = "allowance_description")
    private String allowanceDescription;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAllowanceName() {
        return allowanceName;
    }

    public void setAllowanceName(String allowanceName) {
        this.allowanceName = allowanceName;
    }

    public String getAllowanceDescription() {
        return allowanceDescription;
    }

    public void setAllowanceDescription(String allowanceDescription) {
        this.allowanceDescription = allowanceDescription;
    }
}
