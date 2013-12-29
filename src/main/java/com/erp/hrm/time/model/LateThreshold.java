package com.erp.hrm.time.model;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: ronnie
 * Date: 12/30/13
 * Time: 11:28 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "late_threshold")
public class LateThreshold {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "threshold_type")
    private String thresholdType;

    @Column(name = "late_threshold")
    private Integer lateThreshold; //limit of late threshold like up to 15 minutes is allowed

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getThresholdType() {
        return thresholdType;
    }

    public void setThresholdType(String thresholdType) {
        this.thresholdType = thresholdType;
    }

    public Integer getLateThreshold() {
        return lateThreshold;
    }

    public void setLateThreshold(Integer lateThreshold) {
        this.lateThreshold = lateThreshold;
    }
}