package com.erp.hrm.time.model;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: ronnie
 * Date: 12/30/13
 * Time: 11:25 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "attendance_adjustment")
public class AttendanceAdjustment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "adjustment_type")
    private String adjustmentType;

    @Column(name = "adjustment_threshold")
    private Integer adjustmentThreshold;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdjustmentType() {
        return adjustmentType;
    }

    public void setAdjustmentType(String adjustmentType) {
        this.adjustmentType = adjustmentType;
    }

    public Integer getAdjustmentThreshold() {
        return adjustmentThreshold;
    }

    public void setAdjustmentThreshold(Integer adjustmentThreshold) {
        this.adjustmentThreshold = adjustmentThreshold;
    }
}

