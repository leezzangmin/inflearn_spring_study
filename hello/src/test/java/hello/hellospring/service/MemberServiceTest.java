package hello.hellospring.service;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemoryMemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {

    MemberService memberService = new MemberService(new MemoryMemberRepository());
    @Test
    void join() {
        Member m = new Member();
        m.setName("hello");

        Long saveId = memberService.join(m);


        assertThat(m.getName()).isEqualTo(memberService.findOne(saveId).get().getName());
    }

    @Test
    void findMembers() {
    }

    @Test
    void findOne() {
    }
}
