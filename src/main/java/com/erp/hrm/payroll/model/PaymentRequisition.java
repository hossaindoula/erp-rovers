package com.erp.hrm.payroll.model;

import com.erp.hrm.model.Employee;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: ronnie
 * Date: 12/30/13
 * Time: 7:48 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "payment_requisition")
public class PaymentRequisition implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Employee incurredBy;

    @Column(name = "date_incurred")
    private Date dateIncurred;

    @Column(name = "expense_description")
    private String expenseDescription;

    @Column(name = "expense_amount")
    private Double expenseAmount;

    @Column(name = "date_accrued")
    private Date dateAccrued;
    private Date paid;

    @ManyToOne
    private PaymentMethod paymentMethod;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Employee getIncurredBy() {
        return incurredBy;
    }

    public void setIncurredBy(Employee incurredBy) {
        this.incurredBy = incurredBy;
    }

    public Date getDateIncurred() {
        return dateIncurred;
    }

    public void setDateIncurred(Date dateIncurred) {
        this.dateIncurred = dateIncurred;
    }

    public String getExpenseDescription() {
        return expenseDescription;
    }

    public void setExpenseDescription(String expenseDescription) {
        this.expenseDescription = expenseDescription;
    }

    public Double getExpenseAmount() {
        return expenseAmount;
    }

    public void setExpenseAmount(Double expenseAmount) {
        this.expenseAmount = expenseAmount;
    }

    public Date getDateAccrued() {
        return dateAccrued;
    }

    public void setDateAccrued(Date dateAccrued) {
        this.dateAccrued = dateAccrued;
    }

    public Date getPaid() {
        return paid;
    }

    public void setPaid(Date paid) {
        this.paid = paid;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

}