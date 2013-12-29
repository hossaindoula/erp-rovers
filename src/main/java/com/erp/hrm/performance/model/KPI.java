package com.erp.hrm.performance.model;

import com.erp.hrm.model.JobTitle;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: ronnie
 * Date: 12/30/13
 * Time: 9:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class KPI implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private JobTitle jobTitle;

    @Column(name = "key_performance_indicator")
    private String keyPerformanceIndicator;

    private Integer minimum;
    private Integer maximum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public JobTitle getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(JobTitle jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getKeyPerformanceIndicator() {
        return keyPerformanceIndicator;
    }

    public void setKeyPerformanceIndicator(String keyPerformanceIndicator) {
        this.keyPerformanceIndicator = keyPerformanceIndicator;
    }

    public Integer getMinimum() {
        return minimum;
    }

    public void setMinimum(Integer minimum) {
        this.minimum = minimum;
    }

    public Integer getMaximum() {
        return maximum;
    }

    public void setMaximum(Integer maximum) {
        this.maximum = maximum;
    }
}
