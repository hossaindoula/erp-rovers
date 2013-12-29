package com.erp.hrm.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: ronnie
 * Date: 12/30/13
 * Time: 9:44 PM
 * To change this template use File | Settings | File Templates.
 */

@Entity
public class JobSpec implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "job_spec_name")
    private String jobSpecName;

    @Column(name = "job_spec_description")
    private String jobSpecDescription;

    @Column(name = "job_spec_duties")
    private String jobSpecDuties;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJobSpecName() {
        return jobSpecName;
    }

    public void setJobSpecName(String jobSpecName) {
        this.jobSpecName = jobSpecName;
    }

    public String getJobSpecDescription() {
        return jobSpecDescription;
    }

    public void setJobSpecDescription(String jobSpecDescription) {
        this.jobSpecDescription = jobSpecDescription;
    }

    public String getJobSpecDuties() {
        return jobSpecDuties;
    }

    public void setJobSpecDuties(String jobSpecDuties) {
        this.jobSpecDuties = jobSpecDuties;
    }
}
