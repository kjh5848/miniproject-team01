package com.many.miniproject1.skill;

import com.many.miniproject1.post.PostRequest;
import com.many.miniproject1.resume.Resume;
import jakarta.persistence.EntityManager;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@DataJpaTest
public class SkillJPARepositoryTest {
    @Autowired
    private SkillJPARepository skillJPARepository;
    @Autowired
    private EntityManager em;

    @Test
    public void skills_test() {

        // given
        List<String> skillNameList = Arrays.asList("Java", "spring");
        List<Skill> skillList = new ArrayList<>();

// 각 스킬에 대해 조회하여 리스트에 추가

        List<Skill> skills = skillJPARepository.findBySkills(skillNameList);
        skills.forEach(System.out::println);


        // when

        // then

    }

}
