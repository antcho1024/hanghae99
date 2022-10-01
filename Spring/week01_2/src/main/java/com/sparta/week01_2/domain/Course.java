package com.sparta.week01_2.domain;

import com.sparta.week01_2.entity.Timestamped;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Getter
@NoArgsConstructor //기본 생성자
@Entity //테이블임 명시
//@EntityListeners(AuditingEntityListener.class)
public class Course extends Timestamped {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String tutor;

    public Course(String title, String tutor){
        this.title = title;
        this.tutor = tutor;
    }
    public Long getId() {return id;}
    public String getTitle() {return title;}
    public String getTutor() {return tutor;}
    public void update(Course course) {
        this.title = course.title;
        this.tutor = course.tutor;
    }
}
