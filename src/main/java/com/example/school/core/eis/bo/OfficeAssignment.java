package com.example.school.core.eis.bo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "office_assignment")
public class OfficeAssignment implements Serializable {
    @Id
    @Column(name = "instructor_id")
    private Long instructorId;

    @Column(name = "location")
    private String location;

    @Column(name = "timestamp")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeStamp;

    @OneToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "instructor_id", referencedColumnName = "instructor_id", nullable = false)
    private Person person;
}
