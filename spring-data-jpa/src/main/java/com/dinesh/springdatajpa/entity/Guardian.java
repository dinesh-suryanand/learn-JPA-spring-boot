package com.dinesh.springdatajpa.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.AssociationOverrides;
import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Guardian {
    @Column(name = "guardian_name")
    private String name;
    @Column(name = "guardian_email")
    private String email;
    @Column(name = "guardian_mobile")
    private String mobile;
}
