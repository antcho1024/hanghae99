package com.sparta.week01_2_quiz1.service;

import com.sparta.week01_2_quiz1.domain.Person;
import com.sparta.week01_2_quiz1.domain.PersonRepository;
import com.sparta.week01_2_quiz1.domain.PersonRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class PersonService {
    private final PersonRepository personRepository; //!!!!!!!!!!
    @Transactional
    public Long update(Long id, PersonRequestDto personRequestDto){
        System.out.println("---");
        Person person = personRepository.findById(id).orElseThrow(
                ()-> new IllegalArgumentException("헤딩 아이디 존제 하지 않음")
        );
        person.update(personRequestDto);
        return person.getId();
    }

}
