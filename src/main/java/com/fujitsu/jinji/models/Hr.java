package com.fujitsu.jinji.models;

import com.fujitsu.jinji.models.enums.HrAccountStatus;
import com.fujitsu.jinji.models.enums.HrAccountType;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Hr {

    @Id
    @NotEmpty
    @NotNull
    @Column(unique = true)
    private String hrEmployeeId;

    @NotEmpty
    @NotNull
    private String hrPassword;

    @NotEmpty
    @NotNull
    private String hrFname;

    private String hrMname;

    @NotEmpty
    @NotNull
    private String hrLname;

    @NotEmpty
    @NotNull
    private String hrMobileNumberPrimary;

    private String hrMobileNumberSecondary;

    @NotEmpty
    @NotNull
    @Email
    private String hrEmailPrimary;

    @Email
    private String hrEmailSecondary;

    @Enumerated(EnumType.STRING)
    @NotEmpty
    @NotNull
    @Column(columnDefinition = "varchar(32) default 'PENDING'")
    private HrAccountStatus hrAccountStatus;

    @Enumerated(EnumType.STRING)
    @NotNull
    @Column(columnDefinition = "varchar(32) default 'USER'")
    private HrAccountType hrAccountType;

    @NotNull
    @Column(columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private java.sql.Timestamp hrCreatedAccountDate;

    private java.sql.Timestamp hrApprovedAccountDate;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "hrApprovedById")
    private Hr hrApprovedById;

    @OneToMany(mappedBy = "hrApprovedById")
    private Set<Hr> employeesOnBoarding = new HashSet<Hr>();

    @OneToMany(mappedBy = "hr")
    private Set<HrEmployeeAssoc> hrEmployeeAssocs = new HashSet<HrEmployeeAssoc>();

    @OneToMany(mappedBy = "hr")
    private Set<HrEmployeeRequirementAssoc> hrEmployeeRequirementAssocs = new HashSet<HrEmployeeRequirementAssoc>();

    public Hr() {
    }

    public String getHrEmployeeId() {
        return hrEmployeeId;
    }

    public void setHrEmployeeId(String hrEmployeeId) {
        this.hrEmployeeId = hrEmployeeId;
    }

    public String getHrPassword() {
        return hrPassword;
    }

    public void setHrPassword(String hrPassword) {
        this.hrPassword = hrPassword;
    }

    public String getHrFname() {
        return hrFname;
    }

    public void setHrFname(String hrFname) {
        this.hrFname = hrFname;
    }

    public String getHrMname() {
        return hrMname;
    }

    public void setHrMname(String hrMname) {
        this.hrMname = hrMname;
    }

    public String getHrLname() {
        return hrLname;
    }

    public void setHrLname(String hrLname) {
        this.hrLname = hrLname;
    }

    public String getHrMobileNumberPrimary() {
        return hrMobileNumberPrimary;
    }

    public void setHrMobileNumberPrimary(String hrMobileNumberPrimary) {
        this.hrMobileNumberPrimary = hrMobileNumberPrimary;
    }

    public String getHrMobileNumberSecondary() {
        return hrMobileNumberSecondary;
    }

    public void setHrMobileNumberSecondary(String hrMobileNumberSecondary) {
        this.hrMobileNumberSecondary = hrMobileNumberSecondary;
    }

    public String getHrEmailPrimary() {
        return hrEmailPrimary;
    }

    public void setHrEmailPrimary(String hrEmailPrimary) {
        this.hrEmailPrimary = hrEmailPrimary;
    }

    public String getHrEmailSecondary() {
        return hrEmailSecondary;
    }

    public void setHrEmailSecondary(String hrEmailSecondary) {
        this.hrEmailSecondary = hrEmailSecondary;
    }

    public HrAccountStatus getHrAccountStatus() {
        return hrAccountStatus;
    }

    public void setHrAccountStatus(HrAccountStatus hrAccountStatus) {
        this.hrAccountStatus = hrAccountStatus;
    }

    public HrAccountType getHrAccountType() {
        return hrAccountType;
    }

    public void setHrAccountType(HrAccountType hrAccountType) {
        this.hrAccountType = hrAccountType;
    }

    public Timestamp getHrCreatedAccountDate() {
        return hrCreatedAccountDate;
    }

    public void setHrCreatedAccountDate(Timestamp hrCreatedAccountDate) {
        this.hrCreatedAccountDate = hrCreatedAccountDate;
    }

    public java.sql.Timestamp getHrApprovedAccountDate() {
        return hrApprovedAccountDate;
    }

    public void setHrApprovedAccountDate(java.sql.Timestamp hrApprovedAccountDate) {
        this.hrApprovedAccountDate = hrApprovedAccountDate;
    }

    public Hr getHrApprovedById() {
        return hrApprovedById;
    }

    public void setHrApprovedById(Hr hrApprovedById) {
        this.hrApprovedById = hrApprovedById;
    }

    public Set<Hr> getEmployeesOnBoarding() {
        return employeesOnBoarding;
    }

    public void setEmployeesOnBoarding(Set<Hr> employeesOnBoarding) {
        this.employeesOnBoarding = employeesOnBoarding;
    }
}