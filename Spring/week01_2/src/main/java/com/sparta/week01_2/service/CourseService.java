package com.sparta.week01_2.service;

import com.sparta.week01_2.domain.Course;
import com.sparta.week01_2.domain.CourseRepository;
import com.sparta.week01_2.domain.CourseRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
@RequiredArgsConstructor
@Service // 스프링에게 이 클래스는 서비스임을 명시
public class CourseService {

    // final: 서비스에게 꼭 필요한 녀석임을 명시
    private final CourseRepository courseRepository;

    // 생성자를 통해, Service 클래스를 만들 때 꼭 Repository를 넣어주도록
    // 스프링에게 알려줌
//    public CourseService(CourseRepository courseRepository) {
//        this.courseRepository = courseRepository;
//    }

    @Transactional // SQL 쿼리가 일어나야 함을 스프링에게 알려줌
    public Long update(Long id, CourseRequestDto requestDto) { // 내가 이해한 바 (id에 해당하는 거를 course로 바꿔줘)
        Course course1 = courseRepository.findById(id).orElseThrow( // (찾아서 가르키고)
                () -> new IllegalArgumentException("해당 아이디가 존재하지 않습니다.")
        );
        course1.update(requestDto); // (이 함수는 코스 클래스에 있는 함수 코스1을 매ㅔ개밴수 코스로 변경)
        return course1.getId();
    }
}
