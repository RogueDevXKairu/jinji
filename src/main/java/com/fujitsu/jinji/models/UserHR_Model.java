package com.fujitsu.jinji.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_hr_account")
public class UserHR_Model {
    @Id
    private String hr_id;

    private String hr_username;
    private String hr_password;
    private String hr_fname;
    private String hr_mname;
    private String hr_lname;
    private String hr_mobile_number_primary;
    private String hr_mobile_number_secondary;
    private String hr_email_primary;
    private String hr_email_secondary;
    @Column(name = "hr_account_status")
    private String hrAccountStatus ="PENDING";
    private String hr_approved_account_date;
    private String hr_approved_by_id;

    public UserHR_Model() {
    }

    public String getHr_id() {
        return hr_id;
    }

    public void setHr_id(String hr_id) {
        this.hr_id = hr_id;
    }

    public String getHr_username() {
        return hr_username;
    }

    public void setHr_username(String hr_username) {
        this.hr_username = hr_username;
    }

    public String getHr_password() {
        return hr_password;
    }

    public void setHr_password(String hr_password) {
        this.hr_password = hr_password;
    }

    public String getHr_fname() {
        return hr_fname;
    }

    public void setHr_fname(String hr_fname) {
        this.hr_fname = hr_fname;
    }

    public String getHr_mname() {
        return hr_mname;
    }

    public void setHr_mname(String hr_mname) {
        this.hr_mname = hr_mname;
    }

    public String getHr_lname() {
        return hr_lname;
    }

    public void setHr_lname(String hr_lname) {
        this.hr_lname = hr_lname;
    }

    public String getHr_mobile_number_primary() {
        return hr_mobile_number_primary;
    }

    public void setHr_mobile_number_primary(String hr_mobile_number_primary) {
        this.hr_mobile_number_primary = hr_mobile_number_primary;
    }

    public String getHr_mobile_number_secondary() {
        return hr_mobile_number_secondary;
    }

    public void setHr_mobile_number_secondary(String hr_mobile_number_secondary) {
        this.hr_mobile_number_secondary = hr_mobile_number_secondary;
    }

    public String getHr_email_primary() {
        return hr_email_primary;
    }

    public void setHr_email_primary(String hr_email_primary) {
        this.hr_email_primary = hr_email_primary;
    }

    public String getHr_email_secondary() {
        return hr_email_secondary;
    }

    public void setHr_email_secondary(String hr_email_secondary) {
        this.hr_email_secondary = hr_email_secondary;
    }

    public String getHrAccountStatus() {
        return hrAccountStatus;
    }

    public void setHrAccountStatus(String hrAccountStatus) {
        this.hrAccountStatus = hrAccountStatus;
    }

    public String getHr_approved_account_date() {
        return hr_approved_account_date;
    }

    public void setHr_approved_account_date(String hr_approved_account_date) {
        this.hr_approved_account_date = hr_approved_account_date;
    }

    public String getHr_approved_by_id() {
        return hr_approved_by_id;
    }

    public void setHr_approved_by_id(String hr_approved_by_id) {
        this.hr_approved_by_id = hr_approved_by_id;
    }
}
