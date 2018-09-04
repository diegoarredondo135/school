package com.example.school.core.eis.bo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Data
@Entity
@PrimaryKeyJoinColumn(referencedColumnName = "course_id")
public class OnsiteCourse extends Course {
    private Long courseId;
    private String location;
    private String days;
    @Temporal(TemporalType.TIME)
    private Date time;
}
