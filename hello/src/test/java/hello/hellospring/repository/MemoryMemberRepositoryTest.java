package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.PriorityQueue;

import static org.assertj.core.api.Assertions.assertThat;


class MemoryMemberRepositoryTest {

    MemoryMemberRepository repository = new MemoryMemberRepository();

    @AfterEach
    public void afterEach() {
        repository.clearStrore();
    }

    @Test
    void save() {
        Member member = new Member();
        member.setName("spring");
        repository.save(member);
        Member result = repository.findById(member.getId()).get();

        assertThat(result).isEqualTo(member);
    }

    @Test
    void findById() {
        Member member = new Member();
        member.setName("spring");
        repository.save(member);
        Member result = repository.findById(member.getId()).get();

        assertThat(result).isEqualTo(member);
    }

    @Test
    void  findByName() {
        Member member = new Member();
        member.setName("spring");
        repository.save(member);
        Member result = repository.findByName(member.getName()).get();
        assertThat(result).isEqualTo(member);
    }

    @Test
    void findAll() {
        Member member = new Member();
        member.setName("spring");
        repository.save(member);

        assertThat(repository.findAll().size()).isEqualTo(1);
    }



}
