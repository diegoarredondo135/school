package com.example.school.core.eis.bo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Data
@Entity
@PrimaryKeyJoinColumn(referencedColumnName = "course_id")
public class OnlineCourse extends Course {
    private Long courseId;
    private String url;
}
