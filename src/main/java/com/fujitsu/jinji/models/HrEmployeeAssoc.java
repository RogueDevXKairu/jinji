package com.fujitsu.jinji.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Entity
public class HrEmployeeAssoc {

    @Id
    @NotNull
    @Column(columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp detailUpdatedDate;

    @ManyToOne
    @JoinColumn(name = "hr_id")
    private Hr hr;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    public HrEmployeeAssoc() {
    }

    public Timestamp getDetailUpdatedDate() {
        return detailUpdatedDate;
    }

    public void setDetailUpdatedDate(Timestamp detailUpdatedDate) {
        this.detailUpdatedDate = detailUpdatedDate;
    }

    public Hr getHr() {
        return hr;
    }

    public void setHr(Hr hr) {
        this.hr = hr;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
