package com.mysite.jumpto;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.mysite.jumpto.answer.Answer;
import com.mysite.jumpto.answer.AnswerRepository;
import com.mysite.jumpto.question.Question;
import com.mysite.jumpto.question.QuestionRepository;

@SpringBootTest
class JumptoApplicationTests {

//	@Test
//	void contextLoads() {
//	}
	
	@Autowired
    private QuestionRepository questionRepository;
	
	@Autowired
    private AnswerRepository answerRepository;

	@Transactional
    @Test
    void testJpa() {
    	Optional<Question> oq = this.questionRepository.findById(2);
        assertTrue(oq.isPresent());
        Question q = oq.get();

        List<Answer> answerList = q.getAnswerList();

        assertEquals(1, answerList.size());
        assertEquals("네 자동으로 생성됩니다.", answerList.get(0).getContent());
    }

}