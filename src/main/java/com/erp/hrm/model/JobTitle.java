package com.erp.hrm.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: ronnie
 * Date: 12/30/13
 * Time: 9:41 PM
 * To change this template use File | Settings | File Templates.
 */

@Entity
public class JobTitle implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "title_code")
    private String titleCode;

    @Column(name = "title_name")
    private String titleName;


    @Column(name = "title_description")
    private String titleDescription;

//    @ManyToMany
//    private List<JobRole> jobRoles;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitleCode() {
        return titleCode;
    }

    public void setTitleCode(String titleCode) {
        this.titleCode = titleCode;
    }

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public String getTitleDescription() {
        return titleDescription;
    }

    public void setTitleDescription(String titleDescription) {
        this.titleDescription = titleDescription;
    }
//    public List<JobRole> getJobRoles() {
//        return jobRoles;
//    }
//
//    public void setJobRoles(List<JobRole> jobRoles) {
//        this.jobRoles = jobRoles;
//    }
}
