package com.fujitsu.jinji.models;

import com.fujitsu.jinji.models.enums.CivilStatus;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Employee {

    @Id
    @GeneratedValue
    private Long employeeId;

    @NotNull
    @NotEmpty
    private String employeeFname;


    private String employeeMname;

    @NotNull
    @NotEmpty
    private String employeeLname;

    @NotNull
    @NotEmpty
    private String employeeMobileNumberPrimary;

    private String employeeMobileNumberSecondary;

    private String employeeLandlineNumber;


    @NotNull
    @NotEmpty
    @Email
    private String employeeEmailPrimary;

    @Email
    private String employeeEmailWork;

    private String employeeAddressHouse;


    @NotNull
    @NotEmpty
    private String employeeAddressCity;

    @NotNull
    @NotEmpty
    private String employeeAddressProvince;

    @NotNull
    @NotEmpty
    private String employeeAddressCountry;

    @NotNull
    @NotEmpty
    private String employeeAddressZipCode;

    @Enumerated(EnumType.STRING)
    @NotNull
    @NotEmpty
    private CivilStatus employeeCivilStatus;

    @NotNull
    @NotEmpty
    private String employeePosition;


    private java.sql.Date employeeHireDate;

    @NotNull
    @Column(columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private java.sql.Timestamp employeeRegisterDateCreated;

    @OneToMany(mappedBy = "employee")
    private Set<HrEmployeeAssoc> hrEmployeeAssocs = new HashSet<HrEmployeeAssoc>();

    @OneToMany(mappedBy = "employee")
    private Set<HrEmployeeRequirementAssoc> hrEmployeeRequirementAssocs = new HashSet<HrEmployeeRequirementAssoc>();

    public Employee() {
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeFname() {
        return employeeFname;
    }

    public void setEmployeeFname(String employeeFname) {
        this.employeeFname = employeeFname;
    }

    public String getEmployeeMname() {
        return employeeMname;
    }

    public void setEmployeeMname(String employeeMname) {
        this.employeeMname = employeeMname;
    }

    public String getEmployeeLname() {
        return employeeLname;
    }

    public void setEmployeeLname(String employeeLname) {
        this.employeeLname = employeeLname;
    }

    public String getEmployeeMobileNumberPrimary() {
        return employeeMobileNumberPrimary;
    }

    public void setEmployeeMobileNumberPrimary(String employeeMobileNumberPrimary) {
        this.employeeMobileNumberPrimary = employeeMobileNumberPrimary;
    }

    public String getEmployeeMobileNumberSecondary() {
        return employeeMobileNumberSecondary;
    }

    public void setEmployeeMobileNumberSecondary(String employeeMobileNumberSecondary) {
        this.employeeMobileNumberSecondary = employeeMobileNumberSecondary;
    }

    public String getEmployeeLandlineNumber() {
        return employeeLandlineNumber;
    }

    public void setEmployeeLandlineNumber(String employeeLandlineNumber) {
        this.employeeLandlineNumber = employeeLandlineNumber;
    }

    public String getEmployeeEmailPrimary() {
        return employeeEmailPrimary;
    }

    public void setEmployeeEmailPrimary(String employeeEmailPrimary) {
        this.employeeEmailPrimary = employeeEmailPrimary;
    }

    public String getEmployeeEmailWork() {
        return employeeEmailWork;
    }

    public void setEmployeeEmailWork(String employeeEmailWork) {
        this.employeeEmailWork = employeeEmailWork;
    }

    public String getEmployeeAddressHouse() {
        return employeeAddressHouse;
    }

    public void setEmployeeAddressHouse(String employeeAddressHouse) {
        this.employeeAddressHouse = employeeAddressHouse;
    }

    public String getEmployeeAddressCity() {
        return employeeAddressCity;
    }

    public void setEmployeeAddressCity(String employeeAddressCity) {
        this.employeeAddressCity = employeeAddressCity;
    }

    public String getEmployeeAddressProvince() {
        return employeeAddressProvince;
    }

    public void setEmployeeAddressProvince(String employeeAddressProvince) {
        this.employeeAddressProvince = employeeAddressProvince;
    }

    public String getEmployeeAddressCountry() {
        return employeeAddressCountry;
    }

    public void setEmployeeAddressCountry(String employeeAddressCountry) {
        this.employeeAddressCountry = employeeAddressCountry;
    }

    public String getEmployeeAddressZipCode() {
        return employeeAddressZipCode;
    }

    public void setEmployeeAddressZipCode(String employeeAddressZipCode) {
        this.employeeAddressZipCode = employeeAddressZipCode;
    }

    public CivilStatus getEmployeeCivilStatus() {
        return employeeCivilStatus;
    }

    public void setEmployeeCivilStatus(CivilStatus employeeCivilStatus) {
        this.employeeCivilStatus = employeeCivilStatus;
    }

    public String getEmployeePosition() {
        return employeePosition;
    }

    public void setEmployeePosition(String employeePosition) {
        this.employeePosition = employeePosition;
    }

    public Date getEmployeeHireDate() {
        return employeeHireDate;
    }

    public void setEmployeeHireDate(Date employeeHireDate) {
        this.employeeHireDate = employeeHireDate;
    }

    public Timestamp getEmployeeRegisterDateCreated() {
        return employeeRegisterDateCreated;
    }

    public void setEmployeeRegisterDateCreated(Timestamp employeeRegisterDateCreated) {
        this.employeeRegisterDateCreated = employeeRegisterDateCreated;
    }
}
