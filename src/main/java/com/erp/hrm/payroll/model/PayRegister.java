package com.erp.hrm.payroll.model;

import com.erp.hrm.model.Employee;
import com.erp.security.model.User;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: ronnie
 * Date: 12/30/13
 * Time: 7:45 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "pay_register")
public class PayRegister implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Employee employee;

    @ManyToOne
    private User paidBy;

    @Column(name = "pay_period")
    private Date payPeriod; //(like: 20090101-20090131)

    @Column(name = "pay_date")
    private Date payDate; //Date salary is paid

    @Column(name = "salary_due")
    private Double salaryDue; //Actual amount of payment

    @Column(name = "start_day")
    private Date startDay; //From the day the employee would get payment

    @Column(name = "end_day")
    private Date endDay;   //Up to the day the employee would get payment

    @Column(name = "hours_worked")
    private Integer hoursWorked; //number of hours worked

    @Column(name = "gross_pay")
    private Double grossPay;
    private Double deductions;

    @Column(name = "net_pay")
    private Double netPay;

    @ManyToOne
    private PaymentMethod paymentMethod; //(Cash, Check, EFT, etc.)

    @Column(name = "payment_identifier")
    private String paymentIdentifier;    //(Check Number, EFT number, etc.)


    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Date getPayPeriod() {
        return payPeriod;
    }

    public void setPayPeriod(Date payPeriod) {
        this.payPeriod = payPeriod;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public Double getSalaryDue() {
        return salaryDue;
    }

    public void setSalaryDue(Double salaryDue) {
        this.salaryDue = salaryDue;
    }

    public Date getStartDay() {
        return startDay;
    }

    public void setStartDay(Date startDay) {
        this.startDay = startDay;
    }

    public Date getEndDay() {
        return endDay;
    }

    public void setEndDay(Date endDay) {
        this.endDay = endDay;
    }

    public Integer getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(Integer hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public Double getGrossPay() {
        return grossPay;
    }

    public void setGrossPay(Double grossPay) {
        this.grossPay = grossPay;
    }

    public Double getDeductions() {
        return deductions;
    }

    public void setDeductions(Double deductions) {
        this.deductions = deductions;
    }

    public Double getNetPay() {
        return netPay;
    }

    public void setNetPay(Double netPay) {
        this.netPay = netPay;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentIdentifier() {
        return paymentIdentifier;
    }

    public void setPaymentIdentifier(String paymentIdentifier) {
        this.paymentIdentifier = paymentIdentifier;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

}