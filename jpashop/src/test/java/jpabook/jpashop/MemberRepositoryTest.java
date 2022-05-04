package jpabook.jpashop;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;


@SpringBootTest
class MemberRepositoryTest {

    @Autowired MemberRepository memberRepository;

    @Test
    @Transactional
    public void testMember() throws Exception {
        //g
        Member member = new Member();
        //w
        Long saveId = memberRepository.save(member);
        Member findMember = memberRepository.find(saveId);
        //t
        Assertions.assertThat(findMember.getId()).isEqualTo(member.getId());



    }

}
