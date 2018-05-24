package com.fujitsu.jinji.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Requirement {

    @Id
    @Column(unique = true)
    @NotNull
    @NotEmpty
    private String requirementName;

    @OneToMany(mappedBy = "requirement")
    private Set<HrEmployeeRequirementAssoc> hrEmployeeRequirementAssocs = new HashSet<HrEmployeeRequirementAssoc>();
}
