package com.sparta.week01_2_quiz1;

import com.sparta.week01_2_quiz1.domain.Person;
import com.sparta.week01_2_quiz1.domain.PersonRepository;
import com.sparta.week01_2_quiz1.domain.PersonRequestDto;
import com.sparta.week01_2_quiz1.service.PersonService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.List;
@EnableJpaAuditing
@SpringBootApplication
public class Week012Quiz1Application {

    public static void main(String[] args) {
        SpringApplication.run(Week012Quiz1Application.class, args);
    }
    @Bean
    public CommandLineRunner demo(PersonRepository repository, PersonService personService) {
        return (args) -> {
            repository.save(new Person("Cathy", 25, "preCEO"));
            PersonRequestDto new_c = new PersonRequestDto ("dongs",24, "C");
            personService.update(1L,new_c);
//
//            List<Person> List = repository.findAll();
//            for(int i=0; i<List.size(); i++){
//                Person person = List.get(i);
//                System.out.println(person.getId());
//                System.out.println(person.getName());
//                System.out.println(person.getAge());
//                System.out.println(person.getJob());
//            }
        };
    }
}
