package com.dinesh.springdatajpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tbl_student",
        uniqueConstraints = @UniqueConstraint(
                name="emailid_unique",
                columnNames = "student_email"
        )
)
public class Student {

    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private long studentId;
    private String firstName;
    private String lastName;
    private String guardianName;
    private String guardianEmail;
    private String guardianMobile;
    @Column(name = "student_email",
            nullable = false
    )
    private String emailId;

}
