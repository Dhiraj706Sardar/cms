package com.cms.system.cms.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "course_enrollment")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseEnrollment {

    @EmbeddedId
    private CourseEnrollmentId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id", insertable = false, updatable = false)
    private Students student;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id", insertable = false, updatable = false)
    private Courses course;

    @Embeddable
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CourseEnrollmentId {
        @Column(name = "student_id")
        private Long studentId;

        @Column(name = "course_id")
        private Long courseId;
    }
}
