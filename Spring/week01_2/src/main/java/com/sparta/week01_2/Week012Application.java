package com.sparta.week01_2;

import com.sparta.week01_2.domain.Course;
import com.sparta.week01_2.domain.CourseRepository;
import com.sparta.week01_2.service.CourseService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.List;

@EnableJpaAuditing
@SpringBootApplication
public class Week012Application {

	public static void main(String[] args) {
		SpringApplication.run(Week012Application.class, args);
	}
	@Bean
	public CommandLineRunner demo(CourseRepository repository, CourseService courseService) {
		return (args) -> {
			repository.save((new Course("java","A")));
			repository.save((new Course("C++","B")));

			List<Course> courseList = repository.findAll();
			for(int i=0; i<courseList.size(); i++){
				Course course = courseList.get(i);

				System.out.println(course.getId());
				System.out.println(course.getTitle());
				System.out.println(course.getTutor());
			}

			Course new_c = new Course("python", "C");
			courseService.update(1l,new_c);

			courseList = repository.findAll();
			for(int i=0; i<courseList.size(); i++){
				Course course = courseList.get(i);

				System.out.println(course.getId());
				System.out.println(course.getTitle());
				System.out.println(course.getTutor());
			}

		};
	}
}
