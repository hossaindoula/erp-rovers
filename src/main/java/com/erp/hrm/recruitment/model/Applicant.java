package com.erp.hrm.recruitment.model;

import com.erp.hrm.model.*;
import com.erp.util.model.Address;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: ronnie
 * Date: 12/30/13
 * Time: 10:17 PM
 * To change this template use File | Settings | File Templates.
 */

@Entity
public class Applicant implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String motherName;
    private String fatherName;
    private String gender;
    private String maritalStatus;
    private String nationality;
    private String religion;

    @ManyToOne
    private String personalPhone;

    @ManyToOne
    private String officePhone;

    @ManyToOne
    private String email;

    @ManyToOne
    private String alternateEmail;

    @Temporal(TemporalType.DATE)
    @Column(name = "birth_date")
    Date birthDate;

    @ManyToOne
    private JobTitle appliedJob;

    private String subject;

    @ManyToOne
    private Employee responsible;

    @ManyToOne
    private RecruitmentAction recruitmentAction;

    @ManyToOne
    private RecruitmentAction nextRecruitmentAction;

    @ManyToOne
    private Department department;

    @Column(name = "expected_salary")
    private Double expectedSalary;

    @Column(name = "proposed_salary")
    private Double proposedSalary;

    @Lob
    private String notes;

    @ManyToOne
    private Degree degree;

    @ManyToOne
    private JobAppreciation appreciation;

    @OneToOne
    private Address address;

    @Temporal(TemporalType.DATE)
    @Column(name = "applied_date")
    private Date appliedDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "updated_at")
    private Date updatedAt;

    @Temporal(TemporalType.DATE)
    @Column(name = "closed_at")
    private Date closedAt;

    @Temporal(TemporalType.DATE)
    @Column(name = "next_action")
    private Date nextAction;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Employee getResponsible() {
        return responsible;
    }

    public void setResponsible(Employee responsible) {
        this.responsible = responsible;
    }

    public RecruitmentAction getNextRecruitmentAction() {
        return nextRecruitmentAction;
    }

    public void setNextRecruitmentAction(RecruitmentAction nextRecruitmentAction) {
        this.nextRecruitmentAction = nextRecruitmentAction;
    }

    public Date getNextAction() {
        return nextAction;
    }

    public void setNextAction(Date nextAction) {
        this.nextAction = nextAction;
    }

    public Date getAppliedDate() {
        return appliedDate;
    }

    public void setAppliedDate(Date appliedDate) {
        this.appliedDate = appliedDate;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getClosedAt() {
        return closedAt;
    }

    public void setClosedAt(Date closedAt) {
        this.closedAt = closedAt;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public JobAppreciation getAppreciation() {
        return appreciation;
    }

    public void setAppreciation(JobAppreciation appreciation) {
        this.appreciation = appreciation;
    }

    public String getPersonalPhone() {
        return personalPhone;
    }

    public void setPersonalPhone(String personalPhone) {
        this.personalPhone = personalPhone;
    }

    public String getOfficePhone() {
        return officePhone;
    }

    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String alternateEmail) {
        this.email = alternateEmail;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    public Double getExpectedSalary() {
        return expectedSalary;
    }

    public void setExpectedSalary(Double expectedSalary) {
        this.expectedSalary = expectedSalary;
    }

    public Double getProposedSalary() {
        return proposedSalary;
    }

    public void setProposedSalary(Double proposedSalary) {
        this.proposedSalary = proposedSalary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public JobTitle getAppliedJob() {
        return appliedJob;
    }

    public void setAppliedJob(JobTitle appliedJob) {
        this.appliedJob = appliedJob;
    }

    public RecruitmentAction getRecruitmentAction() {
        return recruitmentAction;
    }

    public void setRecruitmentAction(RecruitmentAction recruitmentAction) {
        this.recruitmentAction = recruitmentAction;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

}
