package jpabook.jpashop.repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import jpabook.jpashop.domain.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;


@SpringBootTest
class MemberRepositoryTest {

    @Autowired private MemberRepository memberRepository = new MemberRepository();

    @Test
    @Transactional(rollbackFor=Exception.class)
    void save() {

        Member member = new Member();
        memberRepository.save(member);

        assertThat(member.getId()).isEqualTo(memberRepository.findOne(member.getId()).getId());
    }

    @Test
    void findOne() {
    }

    @Test
    void findAll() {
    }

    @Test
    void findByName() {
    }
}
