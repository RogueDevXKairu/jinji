package com.fujitsu.jinji.models;

import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
public class HrEmployeeRequirementAssoc {

    @Id
    @GeneratedValue
    private Long hrEmployeeRequirementAssocId;


    private String requirementDetail;

    @NotEmpty
    @NotNull
    private Boolean requirementStatus;

    @NotNull
    @UpdateTimestamp
    private Timestamp requirementDateUpdated;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "hr_id")
    private Hr hr;

    @ManyToOne
    @JoinColumn(name = "requirement_id")
    private Requirement requirement;

}
